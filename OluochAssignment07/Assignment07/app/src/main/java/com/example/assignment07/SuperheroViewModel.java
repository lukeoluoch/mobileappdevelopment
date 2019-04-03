package com.example.assignment07;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.assignment07.model.Superhero;
import com.example.assignment07.model.SuperheroRepository;

import java.util.List;

public class SuperheroViewModel extends AndroidViewModel {
    private SuperheroRepository mRepository;

    private LiveData<List<Superhero>> mAllHeroes;

    public SuperheroViewModel(Application application) {
        super(application);
        mRepository = new SuperheroRepository(application);
        mAllHeroes = mRepository.getAllSuperheroes();
    }

    public LiveData<List<Superhero>> getAllWords() {
        return mAllHeroes;
    }

    void insert(Superhero hero) {
        mRepository.insert(hero);
    }
}
