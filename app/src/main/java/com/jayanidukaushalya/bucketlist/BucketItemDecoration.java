package com.jayanidukaushalya.bucketlist;

import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;

public class BucketItemDecoration extends RecyclerView.ItemDecoration {
    private final int space;

    public BucketItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(
            @NonNull Rect outRect,
            @NonNull View view,
            @NonNull RecyclerView parent,
            @NonNull RecyclerView.State state) {

        outRect.bottom = space;
    }
}

