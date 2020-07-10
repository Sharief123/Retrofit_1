package com.example.retrofit_1;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api_clinet {

    public static final String BASE_URL = "http://202.53.92.122/cgd_api/services/PNG_Controller_v_1_12/";
    public static Retrofit retrofit = null;

    public  static Retrofit getRetrofit()
    {
        if (retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
