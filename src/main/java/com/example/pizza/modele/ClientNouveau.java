package com.example.pizza.modele;

import com.example.pizza.modele.StrategyFidelite;

public class ClientNouveau implements StrategyFidelite {

    public ClientNouveau() {
    }

    public double getTaux() {
        return 1.0;
    }
}
