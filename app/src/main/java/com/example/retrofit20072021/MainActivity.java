package com.example.retrofit20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiRequest apiRequest = RetrofitClient.getInstance().getApiRequest();

        Call<Demo1> callbackDemo1 = apiRequest.fetchDemo1();
        callbackDemo1.enqueue(new Callback<Demo1>() {
            @Override
            public void onResponse(Call<Demo1> call, Response<Demo1> response) {
                Demo1 demo1 = response.body();
                Log.d("BBB",demo1.toString());
            }

            @Override
            public void onFailure(Call<Demo1> call, Throwable t) {
                Log.d("BBB",t.getMessage());
            }
        });
    }
}