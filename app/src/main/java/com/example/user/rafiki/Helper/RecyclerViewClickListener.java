package com.example.user.rafiki.Helper;

import android.view.View;

/**
 * Created by Lucky on 2/18/2016.
 */
public interface RecyclerViewClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
