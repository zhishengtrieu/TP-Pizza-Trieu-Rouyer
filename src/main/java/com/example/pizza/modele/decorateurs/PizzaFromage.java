package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.Pizza;

public class PizzaFromage extends IngredientPizza {

    public PizzaFromage(Pizza pi) {
        super(pi, 0.75, "Fromage", "file:images/ing_fromage.png");
    }
}

