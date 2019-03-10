package com.example.pratiksahayideaindiablrcom.feedsmymandir.retrofit;

public class ApiUtils
{
    public static final String BASE_URL=" http://staging.mymandir.com/";

    public static UserService getUserService()
    {
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);

    }
}
