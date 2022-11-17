package com.example.pizza.modele;

import com.example.pizza.modele.StrategyFidelite;

public class ClientAbonnement implements StrategyFidelite {

    private double taux;

    /**
     * Constructeur de la classe ClientAbonnement
     */
    public ClientAbonnement() {
        this.taux = 0.7;
    }

    /**
     * Retourne le taux du prix
     * @return double le taux du prix
     */
    public double getTaux() {
        return taux;
    }
}
