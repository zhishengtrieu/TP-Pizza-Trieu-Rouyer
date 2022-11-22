package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.factory.Pizza;

public class PizzaOlivesV extends IngredientPizza {

    public PizzaOlivesV(Pizza pi) {
        super(pi, 0.3, "Olives vertes", "file:images/ing_olivesvertes.png");
    }
}

