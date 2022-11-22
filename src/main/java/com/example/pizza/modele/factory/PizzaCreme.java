package com.example.pizza.modele.factory;

import com.example.pizza.MyImage;

/**
 * Classe qui represente des pizzas base creme
 */
public class PizzaCreme implements Pizza {

    private double prix;
    private String nomlm;
    private String description;

    /**
     * Constructeur de la classe PizzaCreme
     */
    public PizzaCreme() {
        this.prix = 6;
        this.nomlm = "file:images/fond_creme.png";
        this.description = "Pizza base Creme";
    }

    /**
     * Methode affichant l'image de la pizza a la creme
     * @return l'image de la pizza a la creme
     */
    @Override
    public MyImage getPizzalm() {
        return new MyImage(nomlm, null);
    }

    /**
     * Methode permettant de recuperer le prix de la pizza a la creme
     * @return double, le prix de la pizza a la creme
     */
    @Override
    public double cout() {
        return prix;
    }

    /**
     * Methode permettant de recuperer la description de la pizza a la creme
     * @return la description de la pizza a la creme
     */
    @Override
    public String getDescription() {
        return description;
    }
}
