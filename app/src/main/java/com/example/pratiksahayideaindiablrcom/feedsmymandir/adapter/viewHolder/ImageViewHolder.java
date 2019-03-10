package com.example.pratiksahayideaindiablrcom.feedsmymandir.adapter.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class ImageViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.imgPerson)
    public CircleImageView imgPerson;

    @BindView(R.id.tvPerson)
    public TextView tvPerson;

    @BindView(R.id.tvTitle)
    public TextView tvTitle;

    @BindView(R.id.imgContent)
    public ImageView imgContent;

    @BindView(R.id.imgShare)
    public ImageView imgShare;

    @BindView(R.id.tvShare)
    public TextView tvShare;

    @BindView(R.id.imgLike)
    public ImageView imgLike;

    @BindView(R.id.tvLike)
    public TextView tvLike;



    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
