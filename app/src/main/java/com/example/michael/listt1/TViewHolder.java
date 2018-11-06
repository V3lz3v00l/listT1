package com.example.michael.listt1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class TViewHolder extends RecyclerView.ViewHolder {
    TextView mTitle;
    TextView mContent;

    TViewHolder(@NonNull View itemView) {
        super(itemView);
        mTitle = itemView.findViewById(R.id.t_item_title);
        mContent = itemView.findViewById(R.id.t_item_content);
    }

    public void setData(Article article) {

        mTitle.setText(article.getTitle());
        mContent.setText(article.getContent());
    }
}
