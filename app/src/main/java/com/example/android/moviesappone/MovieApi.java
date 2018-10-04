package com.example.android.moviesappone;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {

    @GET("search")
    Call<Movies> getData
}
