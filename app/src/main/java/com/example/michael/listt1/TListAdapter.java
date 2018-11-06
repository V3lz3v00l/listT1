package com.example.michael.listt1;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TListAdapter extends RecyclerView.Adapter<TViewHolder>{
    private ArrayList<Article> mDataSet;

    public TListAdapter(@Nullable ArrayList<Article> mDataset) {
        mDataSet = mDataset;
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    @NonNull
    @Override
    public TViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        return new TViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.t_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTitle.setText(mDataSet[position]);
        holder.setData(mDataSet.get(position));

    }

}
