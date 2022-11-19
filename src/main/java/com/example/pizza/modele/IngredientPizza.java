package com.example.pizza.modele;

import com.example.pizza.MyImage;

public abstract class IngredientPizza {

    private Pizza pizza;
    private double prix;
    private String description;
    private String nomImage;
    MyImage myIm;

    public IngredientPizza(Pizza pi, double pr, String des, String im){
        this.pizza = pi;
        this.prix = pr;
        this.description = des;
        this.nomImage = im;
        myIm = pizza.getPizzalm();
    }

    public String getDescription() {
        return description;
    }

    public double cout(){
        return prix + pizza.cout();
    }

    public MyImage getPizzaIm(){
        return myIm.superposer(nomImage);
    }
}
