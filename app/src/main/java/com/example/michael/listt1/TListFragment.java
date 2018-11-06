package com.example.michael.listt1;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TListFragment extends Fragment {
    RecyclerView.Adapter mAdapter;
    ArrayList<Article> mDataSet = new ArrayList<>();

    @Bind(R.id.n_list_recycler)
    RecyclerView mRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.t_list_fragment, container, false);
        ButterKnife.bind(this, view);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecycler.setLayoutManager(mLayoutManager);
        mAdapter = new TListAdapter(mDataSet);
        mRecycler.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void updateDetail() {

    }

    public void showListData(TItem list) {
        List<Article> articles = list.getArticles();
        mDataSet.addAll(articles);
        mAdapter.notifyDataSetChanged();
    }

    public interface onFragmentInteractionListener {
        void onInteractionDetail(Article article);

        void onInteractionList(TItem list);
    }
}
