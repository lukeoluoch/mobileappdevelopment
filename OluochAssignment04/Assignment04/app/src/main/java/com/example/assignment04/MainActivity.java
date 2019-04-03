package com.example.assignment04;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.*;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    private static final int RC_FONT = 2;
    private static final int RC_MESSAGE = 4;
    private static final int RESULT_OK = -1;
    private static final int RESULT_CANCELED = 0;
    public static final String KEY_BOLD ="luke.BOLD";
    public static final String KEY_UNDERLINE ="luke.UNDERLINE";
    public static final String KEY_ITALIC ="luke.ITALIC";
    public static final String KEY_COLOR ="luke.COLOR";
    public static final String KEY_SIZE ="luke.SIZE";
    public static final String KEY_MESSAGE ="luke.MESSAGE";
    public boolean mIsBold=true;
    public boolean mIsItalic=true;
    public boolean mIsUnderline=false;
    public String color="Black";
    public String message="Text to be changed";
    public int size=12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent =getIntent();


            mIsBold=intent.getBooleanExtra(KEY_BOLD,false);
            mIsItalic=intent.getBooleanExtra(KEY_ITALIC,false);
            mIsUnderline=intent.getBooleanExtra(KEY_UNDERLINE,false);
            color=intent.getStringExtra(KEY_COLOR);
            size=intent.getIntExtra(KEY_SIZE,12);

        if (color == null) {
            mIsBold=true;
            mIsItalic=true;
            mIsUnderline=false;
            color="Black";
            size=12;
        }


//
    }
    public void changeFont(View view){
        Intent intent = new Intent(MainActivity.this, ChangeFontActivity.class);
        intent.putExtra(KEY_BOLD,mIsBold);
        intent.putExtra(KEY_ITALIC,mIsItalic);
        intent.putExtra(KEY_UNDERLINE,mIsUnderline);
        intent.putExtra(KEY_COLOR,color);
        intent.putExtra(KEY_SIZE,size);
        Log.d(TAG, mIsBold+" "+mIsUnderline+" "+mIsItalic+" "+color+size);
        startActivityForResult(intent,RC_FONT);
        //startActivity(intent);


    }
    public void changeText(View view){
        Intent intent = new Intent(MainActivity.this, ChangeText.class);

        startActivityForResult(intent,RC_MESSAGE);
        //startActivity(intent);


    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_FONT) {
            if (resultCode == ChangeFontActivity.RESULT_OK) {
                // TODO Extract the data returned from the child Activity.
                mIsBold = data.getBooleanExtra(KEY_BOLD, false);
                mIsItalic = data.getBooleanExtra(KEY_ITALIC, false);
                mIsUnderline = data.getBooleanExtra(KEY_UNDERLINE, false);
                color = data.getStringExtra(KEY_COLOR);
                size = data.getIntExtra(KEY_SIZE, 12);
            }
        }
        if (requestCode == RC_MESSAGE) {
            if (resultCode == ChangeText.RESULT_OK) {
                // TODO Extract the data returned from the child Activity.
                message = data.getStringExtra(KEY_MESSAGE);

            }


        }

        TextView text=findViewById(R.id.textView);

        if (color.matches("Black")){
            text.setTextColor(getResources().getColor(R.color.textBlack));
           // text.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textBlack, null));
        }
        if (color.matches("Blue")){
              text.setTextColor(getResources().getColor(R.color.textBlue));
              Log.d(TAG, color);
            //text.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textBlue, null));
        }
        if (color.matches("Red")){
             text.setTextColor(getResources().getColor(R.color.textRed));
            //text.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textRed, null));
        }
//
        text.setTextSize(TypedValue.COMPLEX_UNIT_SP,size);
//
        if(mIsBold){
            Log.d(TAG, color);
            text.setTypeface(null,Typeface.NORMAL);
            text.setTypeface(null, Typeface.BOLD);
        }
         if(mIsItalic){
             text.setTypeface(null,Typeface.NORMAL);
            text.setTypeface(null, Typeface.ITALIC);
        }
         if(mIsUnderline){
             text.setTypeface(null,Typeface.NORMAL);
            text.setPaintFlags(text.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        }
         if(mIsUnderline && mIsItalic){
             text.setTypeface(null,Typeface.NORMAL);
            text.setPaintFlags(text.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
            text.setTypeface(null, Typeface.ITALIC);
        }
        if(mIsUnderline && mIsBold){
            text.setTypeface(null,Typeface.NORMAL);
            text.setPaintFlags(text.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
            text.setTypeface(null, Typeface.BOLD);
        }
        if(mIsBold && mIsItalic){
            text.setTypeface(null,Typeface.NORMAL);
            text.setTypeface(null, Typeface.BOLD_ITALIC);
        }
         if(mIsBold && mIsItalic && mIsUnderline){
             text.setTypeface(null,Typeface.NORMAL);
            text.setTypeface(null, Typeface.BOLD_ITALIC);
            text.setPaintFlags(text.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        }
        else {
            text.setTypeface(null,Typeface.NORMAL);
        }

        text.setText(message);

    }

}
