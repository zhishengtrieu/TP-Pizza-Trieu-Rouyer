package com.example.pizza.vue;

import com.example.pizza.ModeleCommande;
import com.example.pizza.modele.Sujet;
import javafx.scene.control.Label;

public class VuePrix extends Label implements Observateur {

    public VuePrix() {
        super("Pas de commande en cours");
    }

    @Override
    public void actualiser(Sujet sujet) {
        //on recupere le modele
        ModeleCommande modele = (ModeleCommande) sujet;
        //on recupere le prix total de la commande
        double total = modele.getPrixCommande();
        //on affiche le prix total
        this.setText(String.format("Prix total de votre commande : %.2f euros", total));
    }
}