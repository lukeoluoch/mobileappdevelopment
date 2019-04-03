package com.example.myapplicationz;

import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyDialogFragment  extends DialogFragment {
    TextView foodname;
    TextView actualname;
    TextView descname;
    TextView sloganname;
    String mFood;
    String mName;
    String mSlogan;
    String mDesc;

    public MyDialogFragment newInstance(String name, String food, String slogan, String desc) {
        MyDialogFragment f = new MyDialogFragment();

        Bundle args = new Bundle();
        args.putString("Name", name);
        args.putString("Food", food);
        args.putString("Slogan", slogan);
        args.putString("Desc", desc);
        f.setArguments(args);

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDesc = getArguments().getString("Desc");
        mFood = getArguments().getString("Food");
        mName = getArguments().getString("Name");
        mSlogan = getArguments().getString("Slogan");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dialogfragment, container,
                false);
        getDialog().setTitle("DialogFragment Tutorial");
        // Do something else
        actualname = rootView.findViewById(R.id.ffname);
        foodname = rootView.findViewById(R.id.ffname2);
        descname = rootView.findViewById(R.id.ffname4);
        sloganname = rootView.findViewById(R.id.ffname3);

        actualname.setText(mName);
        foodname.setText(mFood);
        descname.setText(mDesc);
        sloganname.setText(mSlogan);

        return rootView;
    }
}