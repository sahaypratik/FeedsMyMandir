package com.example.pratiksahayideaindiablrcom.feedsmymandir.retrofit;

import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.DataItem;
import com.example.pratiksahayideaindiablrcom.feedsmymandir.model.RespData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService
{
    @GET("dummy")
    Call<List<RespData>> fetchData();

}
