package com.example.pizza.controleur;

import com.example.pizza.ModeleCommande;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * Contrôleur qui recupere les coordonnées (x,y) du clic de la souris et communique
 * ensuite le numéro de la pizza sélectionnée avec la souris.
 */
public class ControlPizzaCour implements EventHandler<MouseEvent> {

    private ModeleCommande modele;

    /**
     * Constructeur de la classe ControlPizzaCour
     * @param modele le modèle de la commande
     */
    public ControlPizzaCour(ModeleCommande modele) {
        this.modele = modele;
    }

    /**
     * Gère l'événement de ControlPizzaCour
     * @param event
     */
    @Override
    public void handle(MouseEvent event) {
        //on recupere la position du clic de la souris
        int x = (int) event.getX();
        int y = (int) event.getY();
        //on calcule le numero de la pizza selectionnee
        int numPizzaSelec = x/225;
        //si le clic se situe bien sur une pizza on met a jour le modele
        if (y>20 && y<220) {
            //modele.setNumPizzaCourante(numPizzaSelec);
        }
    }
}