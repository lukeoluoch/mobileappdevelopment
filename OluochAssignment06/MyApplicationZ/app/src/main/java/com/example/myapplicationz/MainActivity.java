package com.example.myapplicationz;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplicationz.model.FastFood;
import com.example.myapplicationz.model.FastFoodCreator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private static final int CONTENT_VIEW_ID = 10101010;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_main);
////        FragmentManager fm = getFragmentManager();
//
//        ArrayList<FastFood> demoData =new FastFoodCreator().fastfoods;
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(demoData);
//
//        RecyclerView mRecycler = (RecyclerView) this.findViewById(R.id.myList);
//        mRecycler.setLayoutManager(new LinearLayoutManager(this));
//        mRecycler.setAdapter(adapter);
//
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(android.R.id.content, new PlaceholderFragment())
//                    .commit();

        }
    }

