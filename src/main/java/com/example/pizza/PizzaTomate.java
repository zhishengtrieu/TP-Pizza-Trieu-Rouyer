package com.example.pizza;

public class PizzaTomate implements Pizza {

    private double prix;
    private String nomlm;
    private String description;

    public PizzaTomate() {
        this.prix = 5;
        this.nomlm = "PizzaTomate";
        this.description = "Pizza base Tomate";
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