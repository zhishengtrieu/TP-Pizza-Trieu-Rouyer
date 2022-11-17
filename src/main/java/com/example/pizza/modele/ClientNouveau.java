package com.example.pizza.modele;

import com.example.pizza.modele.StrategyFidelite;

public class ClientNouveau implements StrategyFidelite {

    private double taux;

    /**
     * Constructeur de la classe ClientNouveau
     */
    public ClientNouveau() {
        this.taux = 1.0;
    }

    /**
     * Retourne le taux du prix
     * @return double le taux du prix
     */
    public double getTaux() {
        return taux;
    }
}
