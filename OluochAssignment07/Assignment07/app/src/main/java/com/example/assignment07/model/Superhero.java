package com.example.assignment07.model;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Superhero {
    @PrimaryKey
    @ColumnInfo(name = "heroname")
    @NonNull
    public String name;
    @ColumnInfo(name = "alter_ego")
    public String secretID;
    @ColumnInfo(name = "company")
    public String company;

    public Superhero(String name, String ID, String company){
        this.name=name;
        this.secretID=ID;
        this.company=company;
    }
    public Superhero(){
        this.name="";
        this.secretID="";
        this.company="";
    }
    @NonNull
    public String getName() {
        return this.name;
    }
}
