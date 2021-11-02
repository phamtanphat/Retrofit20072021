package com.example.retrofit20072021;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {
    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Demo1> fetchDemo1();

    @GET("KhoaPhamTraining/json/tien/demo4.json")
    Call<List<Demo4>> fetchDemo4();
}
