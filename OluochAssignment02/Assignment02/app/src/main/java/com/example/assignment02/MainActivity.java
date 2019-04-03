package com.example.assignment02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeToast1(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"This is Toast Message One", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void makeToast2(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"This is a Toast Message Two", Toast.LENGTH_SHORT);
        toast.show();
    }

    int value = 100;

    public void decrement(View v){
        value=value-1;
        String value2 = Integer.toString(value);
        displayValue(value2);
    }
    public void displayValue(String val){
        TextView display= findViewById(R.id.decrement);
        display.setText(val);
    }
}
