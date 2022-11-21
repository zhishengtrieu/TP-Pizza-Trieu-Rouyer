package com.example.pizza.modele.decorateurs;

import com.example.pizza.MyImage;
import com.example.pizza.modele.Pizza;

public abstract class IngredientPizza implements Pizza {

    private Pizza pizza;
    private double prix;
    private String description;
    private String nomImage;
    private MyImage myIm;

    public IngredientPizza(Pizza pi, double pr, String des, String im){
        this.pizza = pi;
        this.prix = pr;
        this.description = des;
        this.nomImage = im;
        this.myIm = pizza.getPizzalm();
        this.myIm.superposer(nomImage);
    }

    public String getDescription() {
        return pizza.getDescription() + " - " + description;
    }

    public double cout(){
        return prix + pizza.cout();
    }

    public MyImage getPizzalm(){
        return myIm;
    }
}
