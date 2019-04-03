package com.example.assignment05;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements TopFragment.MiddleListener {
    protected final String TAG = getClass().getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        Fragment topFragment=fm.findFragmentById(R.id.topThird);
        Fragment bottomFragment= fm.findFragmentById(R.id.bottomThird);
        if (bottomFragment == null){
            bottomFragment = new BottomFragment();
            fm.beginTransaction().add(R.id.bottomThird,bottomFragment).commit();
        }
        bottomFragment=fm.findFragmentById(R.id.bottomThird);
        if (topFragment == null){
            topFragment = new TopFragment();
            fm.beginTransaction().add(R.id.topThird,topFragment).commit();
        }


    }
    public void click(View view){
        View parent= (View)view.getParent();
        EditText edit= parent.findViewById(R.id.EditText);

        String message=edit.getText().toString();
        FragmentManager fm = getSupportFragmentManager();
        Fragment  topFragment = new TopFragment();
        Bundle args= new Bundle();
        args.putString("Message",message);
        topFragment.setArguments(args);

        Log.d(TAG, "click: please work ");
        Log.d(TAG, message);
        fm.beginTransaction().add(R.id.topThird,topFragment).commit();
    }
    public void pls(){
        Log.d(TAG, "pls: ");
    }

    @Override
    public void sentText(String a) {
        BottomFragment Bottom= (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomThird);
        Bottom.updateText(a);
    }
}
