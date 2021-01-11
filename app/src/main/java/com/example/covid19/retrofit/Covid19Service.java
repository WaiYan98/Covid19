package com.example.covid19.retrofit;

import com.example.covid19.model.Covid19;
import com.example.covid19.model.GlobalCovid19;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Covid19Service {

    @GET("all")
    Call<GlobalCovid19> getAllGlobalCovid19(@Query("yesterday") boolean yesterday, @Query("towDaysAgo") boolean towDaysAgo);

    @GET("countries")
    Call<List<Covid19>> getAllCovid19Data(@Query("yesterday") boolean isYesterday, @Query("twoDaysAgo") boolean isTwoDaysAgo, @Query("strict") boolean isStrict);


}
