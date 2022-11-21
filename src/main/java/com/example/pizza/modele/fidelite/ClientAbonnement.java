package com.example.pizza.modele.fidelite;

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
