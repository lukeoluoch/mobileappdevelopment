package com.example.assignment04;

import android.app.FragmentTransaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ChangeText extends AppCompatActivity {
    private static final int CONTENT_VIEW_ID = 10101010;
    private static FrameLayout frame;
public String message="Text to be changed";
    public static final String KEY_MESSAGE ="luke.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_text2);
        Intent intent =getIntent();
        message=intent.getStringExtra(KEY_MESSAGE);

//        frame = new FrameLayout(this);
//        frame.setId(CONTENT_VIEW_ID);
//        setContentView(frame, new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//
//        if (savedInstanceState == null) {
//            Fragment newFragment = new myFragment();
//            FragmentTransaction ft = getFragmentManager().beginTransaction();
//            ft.add(CONTENT_VIEW_ID,newFragment);
//
//        }
    }

//    public static class myFragment extends Fragment {
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
//            EditText v = new EditText(getActivity());
//
//            v.setText("Hello Fragment!");
//            frame.addView(v);
//            return v;
//        }
//    }
    public void submit2(View view){
        EditText p= findViewById(R.id.editText1);
        message=p.getText().toString();
        Intent intent= new Intent();
        intent.putExtra(KEY_MESSAGE,message);
        setResult(RESULT_OK,intent);
        finish();
    }
    public void leave(View view){
        finish();
    }
}


