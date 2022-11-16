package com.example.pizza;

/**
 * Classe qui represente des pizzas base tomate
 */
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