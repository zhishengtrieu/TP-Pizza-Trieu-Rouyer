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
        return new MyImage(nomlm, null);
    }

    @Override
    public double cout() {
        return prix;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
