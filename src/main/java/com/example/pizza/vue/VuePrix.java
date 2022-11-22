package com.example.pizza.vue;

import com.example.pizza.modele.ModeleCommande;
import com.example.pizza.modele.Sujet;
import javafx.scene.control.Label;

public class VuePrix extends Label implements Observateur {

    /**
     * Constructeur de la classe VuePrix
     */
    public VuePrix() {
        super("Pas de commande en cours");
    }

    /**
     * Methode actualisant le prix de la commande
     *
     * @param sujet le sujet a actualiser
     */
    @Override
    public void actualiser(Sujet sujet) {
        //on recupere le modele
        ModeleCommande modele = (ModeleCommande) sujet;
        //on recupere le prix total de la commande
        double total = modele.getPrixCommande();
        //on affiche le prix total si il y a une commande
        if (total > 0) {
            this.setText(String.format("Prix total de votre commande n° " + modele.getNumCommande() + " : %.2f euros", total));
        } else {
            this.setText("Pas de commande en cours");
        }
    }
}