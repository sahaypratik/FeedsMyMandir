package com.example.pratiksahayideaindiablrcom.feedsmymandir.view;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;


import com.example.pratiksahayideaindiablrcom.feedsmymandir.R;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.adapter.FeedsAdapter;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.contract.MainActivityContract;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.DataItem;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.presenter.MainActivityPresenter;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.retrofit.ApiUtils;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.retrofit.UserService;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.routemanager.RouteManager;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.ItemSelectListener;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.PermissionCheck;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.Utility;

import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @BindView(R.id.rv_feeds)
    RecyclerView recyclerView;
    List<RespData> itemList;
    int pos=-1;

    private MainActivityContract.Presenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        itemList=new ArrayList<>();
        mPresenter=new MainActivityPresenter(this,MainActivity.this);

    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (grantResults[0]== PackageManager.PERMISSION_GRANTED)
        {
            Utility.download(itemList.get(pos).getAttachments().get(0).getUrl(),MainActivity.this,itemList.get(pos).getAttachments().get(0).getType(),itemList.get(pos).getTitle());
            Toast.makeText(MainActivity.this,"Downloading ...",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Write Access Denied",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void setData(final List<RespData> respDataList) {
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        FeedsAdapter feedsAdapter = new FeedsAdapter(MainActivity.this,respDataList, new ItemSelectListener() {
            @Override
            public void onSelect(int position,String str) {
               mPresenter.share(position,str);
            }
        });
        recyclerView.setAdapter(feedsAdapter);
    }


    @Override
    public void setPermissions(int position,List<RespData> dataList) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            pos=position;
            itemList.clear();
            itemList.addAll(dataList);
            requestPermissions( new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        }
    }
}
