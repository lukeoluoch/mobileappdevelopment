package com.example.myapplicationz.model;

public class FastFood {
    public String name;
    public String food;
    public String slogan;
    public String description;

    public FastFood(String name, String food, String slogan, String des){
        this.name=name;
        this.food=food;
        this.slogan=slogan;
        this.description=des;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSlogan() {
        return slogan;
    }
}
