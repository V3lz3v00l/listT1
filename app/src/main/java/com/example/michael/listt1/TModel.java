package com.example.michael.listt1;


import java.util.List;

import rx.Observable;

public interface TModel {
    Observable<TItem> getNewsList(String key);
}
