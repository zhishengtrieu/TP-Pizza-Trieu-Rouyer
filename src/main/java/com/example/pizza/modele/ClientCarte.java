package com.example.pizza.modele;

import com.example.pizza.modele.StrategyFidelite;

public class ClientCarte implements StrategyFidelite {

    public ClientCarte() {
    }

    public double getTaux() {
        return 0.9;
    }
}
