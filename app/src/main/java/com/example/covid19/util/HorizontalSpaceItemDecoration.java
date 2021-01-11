package com.example.covid19.util;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class HorizontalSpaceItemDecoration extends RecyclerView.ItemDecoration {


    private final int horizontalSpaceLength;

    public HorizontalSpaceItemDecoration(int horizontalSpaceLength) {
        this.horizontalSpaceLength = horizontalSpaceLength;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.right = horizontalSpaceLength;
    }
}

