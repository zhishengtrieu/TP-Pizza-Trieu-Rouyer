package com.example.pizza.modele.factory;

public class FactoryPizzaCreme implements FactoryPizza {

    @Override
    public Pizza creerPizza() {
        return new PizzaCreme();
    }
}