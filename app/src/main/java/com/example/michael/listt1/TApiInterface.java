package com.example.michael.listt1;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface TApiInterface {
    @GET("v2/top-headlines?sources=bbc-news")
    Observable<TItem> getNews(@Query("apiKey") String apiKey);
}
