package com.example.myapplicationz;

//import android.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.FragmentManager;

import com.example.myapplicationz.model.FastFoodCreator;

public class SimpleListFragment extends ListFragment {
    FastFoodCreator fasts = new FastFoodCreator();
    String[] names_text = fasts.getNames().toArray(new String[fasts.getNames().size()]);
    String[] food_text = fasts.getFoods().toArray(new String[fasts.getFoods().size()]);
    String[] slogan_text = fasts.getSlogans().toArray(new String[fasts.getSlogans().size()]);
    String[] desc_text = fasts.getDescriptions().toArray(new String[fasts.getDescriptions().size()]);



    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        FragmentManager fm = getActivity().getSupportFragmentManager();
        MyDialogFragment dialog= new MyDialogFragment().newInstance(names_text[(int) id],food_text[(int) id],slogan_text[(int) id],desc_text[(int) id]);
        dialog.show(fm,"lol");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1,
                names_text);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
