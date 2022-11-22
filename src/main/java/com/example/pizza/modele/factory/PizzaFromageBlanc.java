package com.example.pizza.modele.factory;

import com.example.pizza.MyImage;

/**
 * Classe qui represente des pizzas base fromage blanc
 */
public class PizzaFromageBlanc implements Pizza {

    private double prix;
    private String nomlm;
    private String description;

    /**
     * Constructeur de la classe PizzaFromageBlanc
     */
    public PizzaFromageBlanc() {
        this.prix = 6;
        this.nomlm = "file:images/fond_fromage.png";
        this.description = "Pizza base Fromage";
    }

    /**
     * Methode affichant l'image de la pizza au Fromage blanc
     * @return l'image de la pizza au fromage
     */
    @Override
    public MyImage getPizzalm() {
        return new MyImage(nomlm, null);
    }

    /**
     * Methode permettant de recuperer le prix de la pizza
     * @return double, le prix de la pizza
     */
    @Override
    public double cout() {
        return prix;
    }

    /**
     * Methode permettant de recuperer la description de la pizza
     * @return la description de la pizza
     */
    @Override
    public String getDescription() {
        return description;
    }
}
