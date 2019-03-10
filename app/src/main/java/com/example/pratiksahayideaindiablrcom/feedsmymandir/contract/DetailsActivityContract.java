package com.example.pratiksahayideaindiablrcom.feedsmymandir.contract;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;

import java.util.List;

public interface DetailsActivityContract
{
    public interface View{
        public void setValues(String image_url,String name,String description,String thumbnail);

    }

    interface Model{
    }

    interface Presenter{
        public void getValues();

    }
}
