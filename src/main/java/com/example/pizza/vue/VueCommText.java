package com.example.pizza.vue;

import com.example.pizza.modele.ModeleCommande;
import com.example.pizza.modele.factory.Pizza;
import com.example.pizza.modele.Sujet;
import javafx.scene.control.Label;

import java.util.ArrayList;

/**
 * correspond à la zone de description de la commande.
 */
public class VueCommText extends Label implements Observateur {

    /**
     * Constructeur de la classe VueCommText
     */
    public VueCommText() {
        super("Aucune commande en cours");
    }

    /**
     * Methode actualisant le texte decrivant de la commande
     *
     * @param sujet le sujet a actualiser
     */
    @Override
    public void actualiser(Sujet sujet) {
        //on recupere le modele
        ModeleCommande modele = (ModeleCommande) sujet;
        //on recupere la liste des pizzas de la commande
        ArrayList<Pizza> commandes = modele.getListPizza();
        //on affiche la liste des pizzas si il y en a
        if (commandes.size() > 0) {
            String res = "Votre commande n° " + modele.getNumCommande() + " : \n";
            for (int i = 0; i < commandes.size(); i++) {
                Pizza pizza = commandes.get(i);
                res += String.format("Pizza %o : %.2f\n", i + 1, pizza.cout());
                res += pizza.getDescription() + "\n";
            }
            this.setText(res);
        } else {
            this.setText("Aucune commande en cours");
        }
    }
}
