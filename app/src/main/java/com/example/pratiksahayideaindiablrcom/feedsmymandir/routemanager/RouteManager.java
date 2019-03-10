package com.example.pratiksahayideaindiablrcom.feedsmymandir.routemanager;

import android.content.Context;
import android.content.Intent;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.DataItem;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.Constants;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.view.DetailsActivity;

public class RouteManager {
    public static void routeToDetailsActivity(Context context, RespData respData) {
        Intent intent = new Intent(context, DetailsActivity.class);
        if (respData.getAttachments() != null) {
            intent.putExtra(Constants.USERIMAGE, respData.getAttachments().get(0).getUserImage());
            intent.putExtra(Constants.USERNAME, respData.getAttachments().get(0).getUserName());
            intent.putExtra(Constants.THUMBNAIL, respData.getAttachments().get(0).getThumbnailUrl());
        }

        if (respData.getText() != null)
            intent.putExtra(Constants.DESCRIPTION, respData.getText());
        context.startActivity(intent);
    }
}
