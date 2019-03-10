package com.example.pratiksahayideaindiablrcom.feedsmymandir.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.R;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.contract.DetailsActivityContract;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.contract.MainActivityContract;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.presenter.DetailsActivityPresenter;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity implements DetailsActivityContract.View{

    @BindView(R.id.imgPerson)
    CircleImageView imageView;

    @BindView(R.id.tvPerson)
    TextView tvuserName;

    @BindView(R.id.imgContent)
    ImageView imgThumb;

    @BindView(R.id.tvDescription)
    TextView tvDescription;

    private DetailsActivityContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        mPresenter=new DetailsActivityPresenter(this,DetailsActivity.this);


    }


    @Override
    public void setValues(String image_url, String name, String description, String thumbnail) {
        Picasso.with(this).load(image_url).into(imageView);
        tvuserName.setText(name);
        tvDescription.setText(description);
        Picasso.with(this).load(thumbnail).into(imgThumb);
    }
}
