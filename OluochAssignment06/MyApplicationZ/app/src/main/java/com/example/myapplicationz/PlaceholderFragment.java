package com.example.myapplicationz;

import android.graphics.ColorSpace;
import android.support.annotation.Nullable;
;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplicationz.model.FastFood;
import com.example.myapplicationz.model.FastFoodCreator;

import java.util.ArrayList;
import java.util.List;

public class PlaceholderFragment extends Fragment {

    RecyclerView recyclerView;
    private static ArrayList<FastFood> demoData = new FastFoodCreator().fastfoods;



    RecyclerViewAdapter adapter = new RecyclerViewAdapter(demoData);

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = (RecyclerView) getView().findViewById(R.id.myList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        demoData = new FastFoodCreator().fastfoods;

        adapter = new RecyclerViewAdapter(demoData);

        adapter.setOnItemClickListener(new RecyclerViewAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                FastFoodCreator fasts = new FastFoodCreator();
                String[] names_text = fasts.getNames().toArray(new String[fasts.getNames().size()]);
                String[] food_text = fasts.getFoods().toArray(new String[fasts.getFoods().size()]);
                String[] slogan_text = fasts.getSlogans().toArray(new String[fasts.getSlogans().size()]);
                String[] desc_text = fasts.getDescriptions().toArray(new String[fasts.getDescriptions().size()]);
                FragmentManager fm = getActivity().getSupportFragmentManager();
                MyDialogFragment dialog= new MyDialogFragment().newInstance(names_text[(int) position],food_text[(int) position],slogan_text[(int) position],desc_text[(int) position]);
                dialog.show(fm,"lol");

            }

            @Override
            public void onItemLongClick(int position, View v) {
                FastFoodCreator fasts = new FastFoodCreator();
                String[] names_text = fasts.getNames().toArray(new String[fasts.getNames().size()]);
                String[] food_text = fasts.getFoods().toArray(new String[fasts.getFoods().size()]);
                String[] slogan_text = fasts.getSlogans().toArray(new String[fasts.getSlogans().size()]);
                String[] desc_text = fasts.getDescriptions().toArray(new String[fasts.getDescriptions().size()]);
                FragmentManager fm = getActivity().getSupportFragmentManager();
                MyDialogFragment dialog= new MyDialogFragment().newInstance(names_text[(int) position],food_text[(int) position],slogan_text[(int) position],desc_text[(int) position]);
                dialog.show(fm,"lol");
            }
        });

        recyclerView.setAdapter(adapter);
    }
}
