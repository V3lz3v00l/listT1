package com.example.michael.listt1;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class TApiModule {
    private static final boolean ENABLE_AUTH = false;
    private static final String AUTH_64 = "***"; //your code here

    public static TApiInterface getApiInterface() {

        OkHttpClient httpClient = new OkHttpClient();
        httpClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();
                Request request = original.newBuilder()
                        .header("Authorization", "Basic " + AUTH_64)
                        .method(original.method(), original.body())
                        .build();

                return chain.proceed(request);
            }
        });
        Retrofit.Builder builder = new Retrofit.Builder().
                baseUrl("https://newsapi.org/")// получать из стринги
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create());
        if (ENABLE_AUTH) builder.client(httpClient);

        return builder.build().create(TApiInterface.class);
    }
}

