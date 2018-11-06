package com.example.michael.listt1;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class TModelImpl implements TModel{
    private TApiInterface apiInterface = TApiModule.getApiInterface();

    @Override
    public Observable<TItem> getNewsList(String apiKey) {
        return apiInterface.getNews(apiKey)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
