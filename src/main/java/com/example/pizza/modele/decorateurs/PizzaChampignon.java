package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.Pizza;

public class PizzaChampignon extends IngredientPizza {

    public PizzaChampignon(Pizza pi) {
        super(pi, 0.5, "Champignon", "file:images/ing_champignons.png");
    }
}

