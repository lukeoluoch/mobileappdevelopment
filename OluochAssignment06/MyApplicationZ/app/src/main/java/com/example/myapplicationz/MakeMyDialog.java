package com.example.myapplicationz;

import android.nfc.Tag;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.example.myapplicationz.model.FastFoodCreator;

public class MakeMyDialog extends DialogFragment {
    FastFoodCreator fasts = new FastFoodCreator();
    String[] names_text = fasts.getNames().toArray(new String[fasts.getNames().size()]);
    String[] food_text = fasts.getFoods().toArray(new String[fasts.getFoods().size()]);
    String[] slogan_text = fasts.getSlogans().toArray(new String[fasts.getSlogans().size()]);
    String[] desc_text = fasts.getDescriptions().toArray(new String[fasts.getDescriptions().size()]);

    public void showup(int id){
        FragmentManager fm = getActivity().getSupportFragmentManager();
        MyDialogFragment dialog= new MyDialogFragment().newInstance(names_text[(int) id],food_text[(int) id],slogan_text[(int) id],desc_text[(int) id]);


//        dialog.show(f,"please");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialogfragment, container);
        // This shows the title, replace My Dialog Title. You can use strings too.
        getDialog().setTitle("My Dialog Title");
        // If you want no title, use this code
        // getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        return view;
    }
}
