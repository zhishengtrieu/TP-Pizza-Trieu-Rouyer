package com.example.pizza.modele.fidelite;

public class ClientCarte implements StrategyFidelite {

    private double taux;

    /**
     * Constructeur de la classe ClientCarte
     */
    public ClientCarte() {
        this.taux = 0.9;
    }

    /**
     * Retourne le taux du prix
     * @return double le taux du prix
     */
    public double getTaux() {
        return taux;
    }
}
