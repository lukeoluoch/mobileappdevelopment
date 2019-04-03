package com.example.assignment07;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.RoomDatabase;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.assignment07.model.AppDatabase;
import com.example.assignment07.model.Superhero;
import com.example.assignment07.model.SuperheroDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;

    private SuperheroViewModel mHeroViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final SuperheroListAdapter adapter = new SuperheroListAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mHeroViewModel = ViewModelProviders.of(this).get(SuperheroViewModel.class);
        mHeroViewModel.getAllWords().observe(this, new Observer<List<Superhero>>() {
            @Override
            public void onChanged(@Nullable final List<Superhero> heroes) {
                adapter.setSuperheros(heroes);
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewSuperheroActivity.class);
                startActivityForResult(intent, NEW_WORD_ACTIVITY_REQUEST_CODE);
            }
        });





}
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_WORD_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            Superhero word = new Superhero(data.getStringExtra(NewSuperheroActivity.EXTRA_REPLY1),data.getStringExtra(NewSuperheroActivity.EXTRA_REPLY2),data.getStringExtra(NewSuperheroActivity.EXTRA_REPLY3));
            mHeroViewModel.insert(word);
        } else {
            Toast.makeText(
                    getApplicationContext(),
                    "Hero Not Saved",
                    Toast.LENGTH_LONG).show();
        }

    }
}
