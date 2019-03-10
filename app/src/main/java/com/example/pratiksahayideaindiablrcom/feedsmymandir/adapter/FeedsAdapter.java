package com.example.pratiksahayideaindiablrcom.feedsmymandir.adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.R;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.adapter.viewHolder.ImageViewHolder;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.adapter.viewHolder.TextViewHolder;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.adapter.viewHolder.VideoViewHolder;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.DataItem;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.Constants;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.utils.ItemSelectListener;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FeedsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int IMAGEMESSAGE = 1;
    private static final int VIDEOMESSAGE = 2;
    private static final int AUDIOMESSAGE = 3;
    private static final int TEXTMESSAGE = 4;

    public Context context;
    public List<RespData> list;
    LayoutInflater layoutInflater;
    public ItemSelectListener itemSelectListener;

    public FeedsAdapter(Context context, List<RespData> list, ItemSelectListener itemSelectListener) {
        this.context = context;
        this.list = list;
        this.itemSelectListener = itemSelectListener;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == IMAGEMESSAGE) {
            View view = layoutInflater.inflate(R.layout.adapter_image_feeds, viewGroup, false);
            return new ImageViewHolder(view);
        } else if (i == VIDEOMESSAGE || i == AUDIOMESSAGE) {
            View view = layoutInflater.inflate(R.layout.adapter_video_feeds, viewGroup, false);
            return new VideoViewHolder(view);
        } else
            if (i==TEXTMESSAGE)
            {
                return new TextViewHolder(layoutInflater.inflate(R.layout.adapter_text_feeds, viewGroup, false));
            }
            else
                return null;
    }


    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, final int i) {

        //if attachment is of Image Type
        if (viewHolder instanceof ImageViewHolder) {
            if (list.get(i).getAttachments().get(0).getUserImage() != null && !list.get(i).getAttachments().get(0).getUserImage().equals(""))
                Picasso.with(context).load(list.get(i).getAttachments().get(0).getUserImage()).into((((ImageViewHolder) viewHolder).imgPerson));
            if (list.get(i).getAttachments().get(0).getUserName() != null && !list.get(i).getAttachments().get(0).getUserName().equals(""))
                ((ImageViewHolder) viewHolder).tvPerson.setText(list.get(i).getAttachments().get(0).getUserName());
            ((ImageViewHolder) viewHolder).tvTitle.setText(list.get(i).getTitle());
            Picasso.with(context).load(list.get(i).getAttachments().get(0).getThumbnailUrl()).into(((ImageViewHolder) viewHolder).imgContent);
            ((ImageViewHolder) viewHolder).tvShare.setText(String.valueOf(list.get(i).getShareCount()));
            ((ImageViewHolder) viewHolder).tvLike.setText(String.valueOf(list.get(i).getLikeCount()));
            ((ImageViewHolder) viewHolder).imgContent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemSelectListener.onSelect(i, Constants.IMAGE);
                }
            });
            ((ImageViewHolder) viewHolder).imgShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((ImageViewHolder) viewHolder).tvShare.setText(String.valueOf(list.get(i).getShareCount() + 1));
                    itemSelectListener.onSelect(i, Constants.WHATSAPP);
                }
            });
            ((ImageViewHolder) viewHolder).imgLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((ImageViewHolder) viewHolder).tvLike.setText(String.valueOf(list.get(i).getLikeCount() + 1));
                }
            });
        }

        //if attachment is of video type
        else if (viewHolder instanceof VideoViewHolder) {
            if (list.get(i).getAttachments().get(0).getUserImage() != null && !list.get(i).getAttachments().get(0).getUserImage().equals(""))
                Picasso.with(context).load(list.get(i).getAttachments().get(0).getUserImage()).into((((VideoViewHolder) viewHolder).imgPerson));
            if (list.get(i).getAttachments().get(0).getUserName() != null && !list.get(i).getAttachments().get(0).getUserName().equals(""))
                ((VideoViewHolder) viewHolder).tvPerson.setText(list.get(i).getAttachments().get(0).getUserName());
            ((VideoViewHolder) viewHolder).tvTitle.setText(list.get(i).getTitle());
            Picasso.with(context).load(list.get(i).getAttachments().get(0).getThumbnailUrl()).into((((VideoViewHolder) viewHolder).imgVideoThumbnail));
            ((VideoViewHolder) viewHolder).tvShare.setText(String.valueOf(list.get(i).getShareCount()));
            ((VideoViewHolder) viewHolder).tvLike.setText(String.valueOf(list.get(i).getLikeCount()));
            ((VideoViewHolder) viewHolder).imgVideoThumbnail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemSelectListener.onSelect(i, Constants.VIDEO);
                }
            });
            ((VideoViewHolder) viewHolder).imgShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((VideoViewHolder) viewHolder).tvShare.setText(String.valueOf(list.get(i).getShareCount() + 1));
                    itemSelectListener.onSelect(i, Constants.WHATSAPP);
                }
            });
            ((VideoViewHolder) viewHolder).imgLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((VideoViewHolder) viewHolder).tvLike.setText(String.valueOf(list.get(i).getLikeCount() + 1));
                }
            });
        }

        //if attachment is of type text
        else if (viewHolder instanceof TextViewHolder) {
            if (list.get(i).getSender().getImageUrl()!= null && !list.get(i).getSender().getImageUrl().equals(""))
                Picasso.with(context).load(list.get(i).getSender().getImageUrl()).into((((TextViewHolder) viewHolder).imgPerson));
            if (list.get(i).getSender().getName()!= null && !list.get(i).getSender().getName().equals(""))
                ((TextViewHolder) viewHolder).tvPerson.setText(list.get(i).getSender().getName());
            ((TextViewHolder) viewHolder).tvText.setText(list.get(i).getText());
        }


    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        List<RespData> respDataList = list;
        if (respDataList.get(position).getAttachments()!=null)
        {
            if (respDataList.get(position).getAttachments().get(0).getType().equals("audio"))
                return AUDIOMESSAGE;
            else if (respDataList.get(position).getAttachments().get(0).getType().equals("video"))
                return VIDEOMESSAGE;
            else if (respDataList.get(position).getAttachments().get(0).getType().equals("image"))
                return IMAGEMESSAGE;
        }
        else if (respDataList.get(position).getAttachments() == null)
            return TEXTMESSAGE;
        return 0;
    }
}
