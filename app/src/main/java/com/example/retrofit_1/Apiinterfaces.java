package com.example.retrofit_1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiinterfaces {

    @GET("document_types")
    Call<status> getMenus(@Query("employee") String employee);
}
