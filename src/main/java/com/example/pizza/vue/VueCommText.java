package com.example.pizza.vue;
import com.example.pizza.ModeleCommande;
import com.example.pizza.modele.Pizza;
import com.example.pizza.modele.Sujet;
import javafx.scene.control.Label;

import java.util.ArrayList;

/**
 * correspond à la zone de description de la commande.
 */
public class VueCommText extends Label implements Observateur {

    public VueCommText() {
        super("Aucune commande en cours");
    }

    @Override
    public void actualiser(Sujet sujet) {
        //on recupere le modele
        ModeleCommande modele = (ModeleCommande) sujet;
        //on recupere la liste des pizzas de la commande
        ArrayList<Pizza> commandes = modele.getListPizza();
        //on affiche la liste des pizzas
        String res = "Votre commande : \n";
        for (int i = 0; i < commandes.size(); i++) {
            Pizza pizza = commandes.get(i);
            res += String.format("Pizza %o : %2f\n", i,pizza.cout());
            res += pizza.getDescription() + "\n";
        }
        this.setText(res);
    }
}
