package com.example.pizza.modele;

import com.example.pizza.MyImage;

/**
 * Classe qui represente des pizzas base tomate
 */
public class PizzaTomate implements Pizza {

    private double prix;
    private String nomlm;
    private String description;

    public PizzaTomate() {
        this.prix = 5;
        this.nomlm = "file:images/fond_tomate.png";
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