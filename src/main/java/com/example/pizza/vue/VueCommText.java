package com.example.pizza.vue;
import com.example.pizza.modele.Sujet;
import javafx.scene.control.Label;

/**
 * correspond à la zone de description de la commande.
 */
public class VueCommText extends Label implements Observateur {

    public VueCommText() {
        super();
    }

    @Override
    public void actualiser(Sujet sujet) {

    }
}
