package com.example.assignment07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SuperheroDetailsActivity  extends AppCompatActivity {
    public static final String KEY1 = "NameDetail";
    public static final String KEY2= "AlterDetail";
    public static final String KEY3 = "CompanyDetail";
    private TextView mNameView;
    private TextView mAlterView;
    private TextView mCompanyView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent =getIntent();

        mNameView=findViewById(R.id.nameview);
        mAlterView=findViewById(R.id.alterview);
        mCompanyView=findViewById(R.id.companyview);

        mNameView.setText(intent.getStringExtra(KEY1));
        mAlterView.setText(intent.getStringExtra(KEY2));
        mCompanyView.setText(intent.getStringExtra(KEY3));

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            finish();
            }
        });

}
}

