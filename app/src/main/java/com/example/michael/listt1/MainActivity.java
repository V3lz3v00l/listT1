package com.example.michael.listt1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements TListFragment.onFragmentInteractionListener {
    TPresenter presenter;

    @Bind(R.id.n_search_button)
    Button searchButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        presenter = new TPresenterImpl(new OnEventListener() {
            @Override
            public void onEventGetList(TItem cardList) {
                onInteractionList(cardList);
            }

            @Override
            public void onError(String errorCode) {

            }

            @Override
            public void onEmptyList() {

            }
        });

        searchButton.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                presenter.setApiKey("179f611067d34efd8670e39a2ea2c123");//string source
                presenter.onSearchButtonClick();
            }
        });
    }

    @Override
    public void onInteractionDetail(Article article) {

    }

    @Override
    public void onInteractionList(TItem cardList) {
        TListFragment tListFragment = (TListFragment) getFragmentManager().findFragmentById(R.id.n_list_fragment);
        if (tListFragment != null && tListFragment.isInLayout()) {
            tListFragment.showListData(cardList);
        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        if (presenter != null) {
            presenter.onStop();
        }
    }

    public interface OnEventListener {
        void onEventGetList(TItem item);

        void onError(String errorCode);

        void onEmptyList();

    }
}
