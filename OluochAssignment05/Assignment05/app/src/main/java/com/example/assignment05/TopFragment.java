package com.example.assignment05;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
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
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends FragmentLifecycleLogger {

    int textViewID=2814;
    int editTextID=2813;
    int buttonID=1417;
    private TextView textViewmine;
    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Log.d(TAG, "onCreateView: ");

        View v=inflater.inflate(R.layout.activity_main,container,false);
        v.setBackgroundColor(Color.YELLOW);
        FrameLayout layout = v.findViewById(R.id.topThird) ;
        FrameLayout.LayoutParams params1 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150,Gravity.TOP);
        FrameLayout.LayoutParams params2 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150,Gravity.BOTTOM);
        FrameLayout.LayoutParams params3 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150,Gravity.CENTER);



        final EditText editText=new EditText(getActivity());
        editText.setId(editTextID);
        editText.setHint("Enter Text Message...");
        layout.addView(editText,params3);

        TextView textView = new TextView(getActivity());
        textView.setText("No Message Received");
        textView.setId(textViewID);
        textView.setVisibility(View.VISIBLE);
        layout.addView(textView,params1);

        Button button=new Button(getActivity());
        button.setId(buttonID);
        button.setText("Send Back");
        final TextView second =v.findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                View parent= (View)v.getParent();
//                TextView second =parent.findViewById(R.id.textView2);
                EditText third=editText;
                String message=third.getText().toString();
                second.setText(message);
                Log.d(TAG, "click2: ");
                Log.d(TAG, "Bottom Input Message == " + message);
                Log.d(TAG,"New Bottom Message == " + second.getText().toString());
            }
        });
        layout.addView(button,params2);
        textViewmine = v.findViewById(R.id.toDawg);

        Bundle bundle=this.getArguments();
        if (bundle!=null){
//             txt = v.findViewById(R.id.toDawg);
            String message = bundle.getString("Message");
            Log.d(TAG, "Top Input Message == "+ message);
//            txt.setText(message);
            textViewmine.setText(message);
        }
        Log.d(TAG, "New Top Message == "+ textViewmine.getText().toString());
        return v;
    }

    public void setText(String tex){

        textViewmine.setText(tex);
    }
    public interface MiddleListener{
        void sentText(String a);
    }
    private MiddleListener mListener;

//    public void onAttach(Activity activity) {
//      mListener=(MiddleListener)activity;
//    }
@Override
public void onAttach(Activity activity) {
    super.onAttach(activity);


    try {
        mListener = (MiddleListener) activity;
    } catch (ClassCastException e) {
        throw new ClassCastException(activity.toString()
               );
}
}
    @Override
    public void onDetach() {
        mListener = null;
        super.onDetach();
    }
//    public void click2(View v){
//    TextView second =v.findViewById(R.id.textView2);
//    EditText third=v.findViewById(editTextID);
//    String message=third.getText().toString();
//    second.setText(message);
//        Log.d(TAG, "click2: ");
//        Log.d(TAG, message);
//    }

}
