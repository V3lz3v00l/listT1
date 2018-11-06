package com.example.michael.listt1;

import android.util.Log;

import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.subscriptions.Subscriptions;

public class TPresenterImpl implements TPresenter{
    private TModel model = new TModelImpl();
    private MainActivity.OnEventListener onEventListener;
    private Subscription subscription = Subscriptions.empty();
    private String apiKey;

    TPresenterImpl(MainActivity.OnEventListener onEventListener) {
        this.onEventListener = onEventListener;
    }

    @Override
    public void onSearchButtonClick() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }

        Log.d("onSearchButtonClick", "Clicked");

        subscription = model.getNewsList(apiKey)
                .subscribe(new Observer<TItem>() {
                    @Override
                    public void onCompleted() {
                        Log.d("onCompleted", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        onEventListener.onError(e.getMessage());
                        Log.d("onError", "onError " + e.getMessage());
                        //view.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(TItem data) {
                        if (data != null) {
                            onEventListener.onEventGetList(data);
                            Log.d("onNext", data.toString());
                        } else {
                            onEventListener.onEmptyList();
                            Log.d("onEmptyList", "onEmptyList ");
                        }
                    }
                });
    }

    @Override
    public void onStop() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    @Override
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
