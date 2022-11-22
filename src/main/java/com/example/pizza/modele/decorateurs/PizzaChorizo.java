package com.example.pizza.modele.decorateurs;

import com.example.pizza.modele.factory.Pizza;

public class PizzaChorizo extends IngredientPizza {

    public PizzaChorizo(Pizza pi) {
        super(pi, 1.0, "Chorizo", "file:images/ing_chorizo.png");
    }
}

