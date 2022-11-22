package com.example.pizza.modele.factory;

public class FactoryPizzaTomate implements FactoryPizza {

    @Override
    public Pizza creerPizza() {
        return new PizzaTomate();
    }
}