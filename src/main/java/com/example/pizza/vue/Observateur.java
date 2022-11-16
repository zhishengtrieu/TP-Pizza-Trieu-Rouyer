package com.example.pizza.vue;

import com.example.pizza.modele.Sujet;

public interface Observateur {

    /**
     * Met à jour l'observateur
     */
    public void actualiser(Sujet sujet);
}
