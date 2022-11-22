package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.factory.Pizza;

public class PizzaRoquette extends IngredientPizza {

    public PizzaRoquette(Pizza pi) {
        super(pi, 0.45, "Roquette", "file:images/ing_roquette.png");
    }
}

