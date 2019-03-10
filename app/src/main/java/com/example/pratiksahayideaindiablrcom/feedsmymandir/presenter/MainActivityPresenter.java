package com.example.pratiksahayideaindiablrcom.feedsmymandir.presenter;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.contract.MainActivityContract;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.DataItem;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.retrofit.ApiUtils;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.retrofit.UserService;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.routemanager.RouteManager;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.Constants;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.PermissionCheck;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.Utility;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.view.MainActivity;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    UserService userService;
    MainActivityContract.View mView;
    Context context;
    List<RespData> respDataList;

    public MainActivityPresenter(MainActivityContract.View view, Context context) {
        mView = view;
        this.context = context;
        respDataList = new ArrayList<>();
        userService = ApiUtils.getUserService();
        fetchData();
    }

    @Override
    public void fetchData() {
        Call<List<RespData>> call = userService.fetchData();
        call.enqueue(new Callback<List<RespData>>() {
            @Override
            public void onResponse(Call<List<RespData>> call, Response<List<RespData>> response) {
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    respDataList = response.body();
                    mView.setData(respDataList);
                }
            }

            @Override
            public void onFailure(Call<List<RespData>> call, Throwable t) {
            }
        });
    }

    @Override
    public void share(int position, String str) {
        if (str.equals(Constants.IMAGE))
            RouteManager.routeToDetailsActivity(context, respDataList.get(position));

        else if (str.equals(Constants.WHATSAPP)) {
            boolean isAppInstalled = Utility.isPackageInstalled("com.whatsapp", context.getPackageManager());
            if (isAppInstalled) {
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.setPackage("com.whatsapp");
                if (respDataList.get(position).getAttachments().get(0).getType().equals("image"))
                    whatsappIntent.putExtra(Intent.EXTRA_TEXT, respDataList.get(position).getAttachments().get(0).getThumbnailUrl());
                else if (respDataList.get(position).getAttachments().get(0).getType().equals("video") || respDataList.get(position).getAttachments().get(0).getType().equals("audio")) {
                    whatsappIntent.putExtra(Intent.EXTRA_TEXT, respDataList.get(position).getAttachments().get(0).getUrl());
                }
                try {
                    context.startActivity(whatsappIntent);
                } catch (ActivityNotFoundException ex) {
                    Toast.makeText(context, "Whatsapp not installed.", Toast.LENGTH_SHORT).show();
                }
            }
        }

        else if (str.equals(Constants.VIDEO)) {
            if (!PermissionCheck.readAndWriteExternalStorage(context)) {
                mView.setPermissions(position,respDataList);
            } else {
                Utility.download(respDataList.get(position).getAttachments().get(0).getUrl(), context, respDataList.get(position).getAttachments().get(0).getType(), respDataList.get(position).getTitle());
                Toast.makeText(context, "Downloading ...", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
