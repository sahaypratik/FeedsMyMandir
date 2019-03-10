package com.example.pratiksahayideaindiablrcom.feedsmymandir.adapter.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class TextViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.imgPerson)
    public CircleImageView imgPerson;

    @BindView(R.id.tvPerson)
    public TextView tvPerson;

    @BindView(R.id.tvText)
    public TextView tvText;

    public TextViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
