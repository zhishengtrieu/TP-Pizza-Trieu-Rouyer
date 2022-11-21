package com.example.pizza.modele.fidelite;

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
