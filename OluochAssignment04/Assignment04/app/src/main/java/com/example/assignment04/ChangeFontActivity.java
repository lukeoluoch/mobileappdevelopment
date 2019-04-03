package com.example.assignment04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;

public class ChangeFontActivity extends AppCompatActivity {
    private int textsize=12;
    private String color="Black";
    private static final String TAG = "FontActivity";
    boolean isBold=true;
    boolean isItalic=true;
    boolean isUnderline=false;
    private static final int RC_FONT = 2;
    private static final int RC_MESSAGE = 4;
    public static final int RESULT_OK = -1;
    public static final int RESULT_CANCELED = 0;
    public static final String KEY_BOLD ="luke.BOLD";
    public static final String KEY_UNDERLINE ="luke.UNDERLINE";
    public static final String KEY_ITALIC ="luke.ITALIC";
    public static final String KEY_COLOR ="luke.COLOR";
    public static final String KEY_SIZE ="luke.SIZE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_font);

        Intent intent =getIntent();
        isBold=intent.getBooleanExtra(KEY_BOLD,false);
        isItalic=intent.getBooleanExtra(KEY_ITALIC,false);
        isUnderline=intent.getBooleanExtra(KEY_UNDERLINE,false);

        CheckBox bold= findViewById(R.id.bold);
        bold.setChecked(isBold);
        CheckBox italic= findViewById(R.id.italic);
        italic.setChecked(isItalic);
        CheckBox underline= findViewById(R.id.underline);
        underline.setChecked(isUnderline);
//
        color=intent.getStringExtra(KEY_COLOR);
        RadioButton black=findViewById(R.id.black);
        RadioButton blue=findViewById(R.id.blue);
        RadioButton red=findViewById(R.id.red);
        switch (color){
            case "Black":
                black.toggle();
                break;
            case "Blue":
                blue.toggle();
                break;
            case "Red":
                red.toggle();

        }
//
        textsize=intent.getIntExtra(KEY_SIZE,25);
        TextView text= findViewById(R.id.textsize);
        text.setText(textsize+"sp");

}
    public void changeStyle(View view){
        CheckBox bold= findViewById(R.id.bold);
        CheckBox italic= findViewById(R.id.italic);
        CheckBox underline= findViewById(R.id.underline);

        if(bold.isChecked()){
            isBold=true;
        }
        else{
            isBold=false;
        }
        if(italic.isChecked()){
            isItalic=true;
        }
        else{
            isItalic=false;
        }
        if(underline.isChecked()){
            isUnderline=true;
        }
        else{
            isUnderline=false;
        }
    }
    public void addSize(View view){
        if(textsize<36){
        TextView text= findViewById(R.id.textsize);
        textsize++;
        text.setText(textsize+"sp");}

    }
    public void minusSize(View view){
        if(textsize>12){
        TextView text= findViewById(R.id.textsize);
        textsize--;
        text.setText(textsize+"sp");}

    }
    public void changecolor(View view){
        RadioButton black= findViewById(R.id.black);
        RadioButton blue= findViewById(R.id.blue);
        RadioButton red= findViewById(R.id.red);
        boolean isBlack = black.isChecked();
        boolean isBlue= blue.isChecked();
        boolean isRed=red.isChecked();
        if(isBlack){
            color="Black";
        }
        if(isBlue){
            color="Blue";
        }
        if(isRed){
            color="Red";
        }
//        boolean checked= ((RadioButton)view).isChecked();
//        switch(view.getId()) {
//            case R.id.black:
//                if (checked)
//                   color="Black";
//                    break;
//            case R.id.blue:
//                if (checked)
//                    color="Blue";
//                    break;
//            case R.id.red:
//                if (checked)
//                    color="Red";
//                break;
//        }
    }
    public void submit(View view){
        changecolor(view);
        changeStyle(view);
        Intent intent= new Intent();
        intent.putExtra(KEY_COLOR,color);
        intent.putExtra(KEY_SIZE,textsize);
        intent.putExtra(KEY_BOLD,isBold);
        intent.putExtra(KEY_ITALIC,isItalic);
        intent.putExtra(KEY_UNDERLINE,isItalic);
        Log.d(TAG, isBold+" "+isUnderline+" "+isItalic+" "+color+textsize);
        setResult(RESULT_OK,intent);
        finish();
//        Intent intent = new Intent( ChangeFontActivity.this,MainActivity.class);
//        onActivityResult(RC_FONT,)
    }
    public void leave(View view){
        finish();
    }
}
