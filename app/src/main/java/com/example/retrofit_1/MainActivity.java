package com.example.retrofit_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Recycleradapter recycleradapter;
    private Apiinterfaces apiinterfaces;
    private ArrayList<com.example.retrofit_1.Response> getMenus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_1);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiinterfaces = Api_clinet.getRetrofit().create(Apiinterfaces.class);
    }


    public void ClickHandler(View view) {

        Call<status> call = apiinterfaces.getMenus("1");

        call.enqueue(new Callback<status>() {
            @Override
            public void onResponse(Call<status> call, Response<status> response)
            {
                Log.e("Code", String.valueOf(response.code()));
                if (response.isSuccessful()) {
                    Log.e("Res", response.body().getStatus().toString());
                    getMenus.addAll(response.body().getResponse());
                    recycleradapter =  new Recycleradapter(getMenus);
                    recyclerView.setAdapter(recycleradapter);
                }
                //Log.e("Response", response.body().getResponse().toString());
                //
                //getMenus = ;
                //r
            }

            @Override
            public void onFailure(Call<status> call, Throwable t) {
                Log.e("Error",t.getLocalizedMessage());
            }
        });
    }
    }

