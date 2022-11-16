package com.example.pizza.vue;

import com.example.pizza.modele.Sujet;
import javafx.scene.control.Label;

public class VuePrix extends Label implements Observateur {

    public VuePrix() {
        super();
    }

    @Override
    public void actualiser(Sujet sujet) {

    }
}