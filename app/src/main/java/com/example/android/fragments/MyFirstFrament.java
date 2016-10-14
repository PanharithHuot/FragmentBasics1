package com.example.android.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by huotpanharith on 10/13/16.
 */
public class MyFirstFrament extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout mainLayout = new LinearLayout(getActivity());
        mainLayout.setBackgroundColor(Color.WHITE);
        TextView textView1 = new TextView(getActivity());
        textView1.setText("I love fragment 1");
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MySecondFragment secondFragment = new MySecondFragment();
                ((MainActivity)getActivity()).pushFragment(secondFragment);
            }
        });
        mainLayout.addView(textView1);
        return mainLayout;
    }
}
