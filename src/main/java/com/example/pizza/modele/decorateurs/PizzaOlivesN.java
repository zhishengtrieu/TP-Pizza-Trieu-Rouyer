package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.factory.Pizza;

public class PizzaOlivesN extends IngredientPizza {

    public PizzaOlivesN(Pizza pi) {
        super(pi, 0.25, "Olives noires", "file:images/ing_olivesnoires.png");
    }
}
