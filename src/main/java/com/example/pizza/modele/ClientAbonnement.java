package com.example.pizza.modele;

import com.example.pizza.modele.StrategyFidelite;

public class ClientAbonnement implements StrategyFidelite {

    public ClientAbonnement() {
    }

    public double getTaux() {
        return 0.7;
    }
}
