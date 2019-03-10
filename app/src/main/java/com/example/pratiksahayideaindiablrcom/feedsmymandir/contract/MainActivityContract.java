package com.example.pratiksahayideaindiablrcom.feedsmymandir.contract;


import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;

import java.util.List;

public interface MainActivityContract
{
    interface View{
        public void setData(final List<RespData> respDataList);
        public void setPermissions(int position,List<RespData> dataList);
    }

    interface Model{
    }

    interface Presenter{
        public void fetchData();
        public void share(int position,String str);
    }
}
