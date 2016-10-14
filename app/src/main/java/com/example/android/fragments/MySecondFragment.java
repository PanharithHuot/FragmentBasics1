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
public class MySecondFragment extends BaseFragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout mainLayout = new LinearLayout(getActivity());
        mainLayout.setBackgroundColor(Color.WHITE);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        TextView textView1 = new TextView(getActivity());
        textView1.setText("pop back");
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                MyFirstFrament firstFrament = new MyFirstFrament();
                ((MainActivity)getActivity()).popFragment();
            }
        });
        mainLayout.addView(textView1);

        TextView textView2 = new TextView(getActivity());
        textView2.setText("I love fragment 2");
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment3 fragment3 = new Fragment3();
                ((MainActivity)getActivity()).pushFragment(fragment3);
            }
        });
        mainLayout.addView(textView2);
        return mainLayout;
    }
}
