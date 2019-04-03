package com.example.assignment07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewSuperheroActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY1 = "com.example.assignment07.REPLY1";
    public static final String EXTRA_REPLY2 = "com.example.assignment07.REPLY2";
    public static final String EXTRA_REPLY3 = "com.example.assignment07.REPLY3";
    private EditText mEditNameView;
    private EditText mEditAlterView;
    private EditText mEditCompanyView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_hero);
        mEditNameView = findViewById(R.id.edit_name);
        mEditAlterView =findViewById(R.id.edit_alterego);
        mEditCompanyView= findViewById(R.id.edit_company);

        Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(mEditNameView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String name = mEditNameView.getText().toString();
                    String alter = mEditAlterView.getText().toString();
                    String company = mEditCompanyView.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY1, name);
                    replyIntent.putExtra(EXTRA_REPLY2, alter);
                    replyIntent.putExtra(EXTRA_REPLY3, company);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}
