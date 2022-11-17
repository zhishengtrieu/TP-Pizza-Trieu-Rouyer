package com.example.pizza.modele;

import com.example.pizza.MyImage;

/**
 * Classe qui represente des pizzas base tomate
 */
public class PizzaTomate implements Pizza {

    private double prix;
    private String nomlm;
    private String description;


    /**
     * Constructeur de la classe PizzaTomate
     */
    public PizzaTomate() {
        this.prix = 5;
        this.nomlm = "file:images/fond_tomate.png";
        this.description = "Pizza base Tomate";
    }

    /**
     * Methode affichant l'image de la pizza a la tomate
     * @return l'image de la pizza a la tomate
     */
    @Override
    public MyImage getPizzalm() {
        return new MyImage(nomlm, null);
    }

    /**
     * Methode permettant de recuperer le prix de la pizza a la tomate
     * @return le prix de la pizza a la tomate
     */
    @Override
    public double cout() {
        return prix;
    }

    /**
     * Methode permettant de recuperer la description de la pizza a la tomate
     * @return la description de la pizza a la tomate
     */
    @Override
    public String getDescription() {
        return description;
    }
}