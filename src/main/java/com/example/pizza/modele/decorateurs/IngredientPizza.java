package com.example.pizza.modele.decorateurs;

import com.example.pizza.MyImage;
import com.example.pizza.modele.factory.Pizza;

public abstract class IngredientPizza implements Pizza {

    private Pizza pizza;
    private double prix;
    private String description;
    private String nomImage;
    private MyImage myIm;

    /**
     * Constructeur d'ingredient de pizza
     * @param pi la pizza sur laquelle on ajoute l'ingrédient
     * @param pr le prix de l'ingrédient
     * @param des la description de l'ingrédient
     * @param im le nom de l'image de l'ingrédient
     */
    public IngredientPizza(Pizza pi, double pr, String des, String im){
        this.pizza = pi;
        this.prix = pr;
        this.description = des;
        this.nomImage = im;
        this.myIm = pizza.getPizzalm();
        this.myIm.superposer(nomImage);
    }

    /**
     * Retourne la description de la pizza
     * @return la description de la pizza
     */
    public String getDescription() {
        return pizza.getDescription() + " - " + description;
    }

    /**
     * Retourne le prix de la pizza
     * @return le prix de la pizza
     */
    public double cout(){
        return prix + pizza.cout();
    }

    /**
     * Retourne l'image de la pizza
     * @return l'image de la pizza
     */
    public MyImage getPizzalm(){
        return myIm;
    }

    /**
     * Getter de la pizza sur laquelle on ajoute l'ingredient
     * @return
     */
    public Pizza getPizza() {
        return pizza;
    }
}
