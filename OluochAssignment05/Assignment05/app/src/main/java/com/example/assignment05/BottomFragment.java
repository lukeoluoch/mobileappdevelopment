package com.example.assignment05;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends FragmentLifecycleLogger {

    int textViewID2=2999;
    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");

        View v2=inflater.inflate(R.layout.activity_main,container,false);
        v2.setBackgroundColor(Color.CYAN);
        FrameLayout layout = v2.findViewById(R.id.bottomThird) ;
        FrameLayout.LayoutParams params4 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        TextView textView2 = new TextView(getActivity());
        textView2.setText("No Message Sent Back");
        textView2.setId(textViewID2);
        textView2.setVisibility(View.VISIBLE);
        layout.addView(textView2,params4);





        return v2;
    }
    public void updateText(String text){
        // Here you have it
    }
}
