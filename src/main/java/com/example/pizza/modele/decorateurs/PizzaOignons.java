package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.factory.Pizza;

public class PizzaOignons extends IngredientPizza {

    public PizzaOignons(Pizza pi) {
        super(pi, 0.4, "Oignons", "file:images/ing_oignons.png");
    }
}
