package com.example.pizza;

public class PizzaCreme implements Pizza {

    private double prix;
    private String nomlm;
    private String description;

    public PizzaCreme() {
        this.prix = 6;
        this.nomlm = "PizzaCreme";
        this.description = "Pizza base Creme";
    }

    @Override
    public MyImage getPizzalm() {
        return null;
    }

    @Override
    public double cout() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
