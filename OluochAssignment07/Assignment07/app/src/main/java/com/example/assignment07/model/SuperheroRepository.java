package com.example.assignment07.model;

import java.util.List;
import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;
import android.util.Log;


public class SuperheroRepository {
    public LiveData<List<Superhero>> herolist;
    public SuperheroDao superheroDao;

    public SuperheroRepository(Application application){

        AppDatabase db = AppDatabase.getDatabase(application);
        superheroDao=db.superheroDao();
        herolist=superheroDao.getAlphabetizedSuperheroes();

    }

    public LiveData<List<Superhero>> getAllSuperheroes() {
        return herolist;
    }

    public void insert (Superhero hero) {
        new insertAsyncTask(superheroDao).execute(hero);
    }

    private static class insertAsyncTask extends AsyncTask<Superhero, Void, Void> {

        private SuperheroDao mAsyncTaskDao;

        insertAsyncTask(SuperheroDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Superhero... params) {
            Log.d("Method Running", "doInBackground: " + params[0].getName());
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }


}
