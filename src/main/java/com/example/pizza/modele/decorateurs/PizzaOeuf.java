package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.Pizza;

public class PizzaOeuf extends IngredientPizza {

    public PizzaOeuf(Pizza pi) {
        super(pi, 0.70, "Oeuf", "file:images/ing_oeuf.png");
    }
}
