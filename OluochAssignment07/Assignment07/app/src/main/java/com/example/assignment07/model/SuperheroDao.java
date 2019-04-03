package com.example.assignment07.model;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
    @Dao
    public interface SuperheroDao{
        @Query("SELECT * FROM superhero ORDER BY heroname ASC")
        LiveData<List<Superhero>> getAlphabetizedSuperheroes();

        @Insert
        void insert(Superhero hero);

        @Delete
        void delete(Superhero hero);
        @Query("DELETE FROM superhero")
        void deleteAll();
    }

