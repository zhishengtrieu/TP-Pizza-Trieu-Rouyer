package com.example.pizza.modele.factory;

public class FactoryPizzaFromage implements FactoryPizza {

    @Override
    public Pizza creerPizza() {
        return new PizzaFromageBlanc();
    }
}