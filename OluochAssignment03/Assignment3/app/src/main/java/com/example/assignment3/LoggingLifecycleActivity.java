package com.example.assignment3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.*;

public class LoggingLifecycleActivity extends AppCompatActivity {

    int imagecounter;
    int changeimagecounter;
    static boolean landscape=true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState!=null){
            imagecounter =savedInstanceState.getInt("imagecounter");
            changeimagecounter=savedInstanceState.getInt("changeimagecounter");
        }
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Display Rotated " + imagecounter +" times");

        String TAG = LoggingLifecycleActivity.class.getName();
        Log.d(TAG,"onCreate()");

    }
    @Override
    public void onPause(){
        super.onPause();
        String TAG = LoggingLifecycleActivity.class.getName();
        Log.d(TAG,"onPause()");
    }
    @Override
    public void onStop(){
        super.onStop();
        String TAG = LoggingLifecycleActivity.class.getName();
        Log.d(TAG,"onStop()");
    }
    @Override
    public void onStart(){
        super.onStart();
        String TAG = LoggingLifecycleActivity.class.getName();
        Log.d(TAG,"onStart()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        String TAG = LoggingLifecycleActivity.class.getName();
        Log.d(TAG,"onDestroy()");
    }
    @Override
    public void onResume(){
        super.onResume();
        String TAG = LoggingLifecycleActivity.class.getName();
        Log.d(TAG,"onResume()");
    }
 
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE && landscape==false) {
            setContentView(R.layout.activity_main);
            landscape=true;
            imagecounter++;
            TextView text = (TextView) findViewById(R.id.textView);
            text.setText("Display Rotated " + imagecounter +" times");

        } else{
            setContentView(R.layout.activity_main);
            landscape=false;
            imagecounter++;
            TextView text = (TextView) findViewById(R.id.textView);
            text.setText("Display Rotated " + imagecounter +" times");

        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("imagecounter", imagecounter);
        savedInstanceState.putInt("changeimagecounter", changeimagecounter);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        imagecounter = savedInstanceState.getInt("imagecounter");
        changeimagecounter = savedInstanceState.getInt("changeimagecounter");

    }

    public void imageChange(View v){
        changeimagecounter++;
        ImageView image = (ImageView) findViewById(R.id.imageView2);

        if (changeimagecounter%2==1){
            image.setImageResource(R.drawable.guy);
        }
        else{
            image.setImageResource(R.drawable.hal);
        }
    }



}
