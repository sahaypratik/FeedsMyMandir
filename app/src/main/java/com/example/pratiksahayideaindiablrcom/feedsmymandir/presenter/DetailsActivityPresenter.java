package com.example.pratiksahayideaindiablrcom.feedsmymandir.presenter;


import android.app.Activity;
import android.content.Context;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.contract.DetailsActivityContract;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.Constants;

public class DetailsActivityPresenter implements DetailsActivityContract.Presenter
{

    Context context;
    DetailsActivityContract.View mView;
    String image_url,name,description,thumbnail;

    public DetailsActivityPresenter(DetailsActivityContract.View view,Context context)
    {
            mView=view;
            this.context=context;
            getValues();
    }

    @Override
    public void getValues() {
        image_url=((Activity)context).getIntent().getStringExtra(Constants.USERIMAGE);
        name=((Activity)context).getIntent().getStringExtra(Constants.USERNAME);
        description=((Activity)context).getIntent().getStringExtra(Constants.DESCRIPTION);
        thumbnail=((Activity)context).getIntent().getStringExtra(Constants.THUMBNAIL);
        mView.setValues(image_url,name,description,thumbnail);
    }
}
