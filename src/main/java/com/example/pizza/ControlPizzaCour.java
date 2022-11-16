package com.example.pizza;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * ce contrôleur récupère des informations, en
 * particulier la position des coordonnées (x,y) du clic de la souris et communique
 * ensuite le numéro de la pizza sélectionnée avec la souris. Chaque image de pizza
 * ayant une largeur de 200 pixels et étant séparée de 25 pixels de l’image de pizza
 * suivante, vous pourrez utiliser la relation suivante :
 * int numPizzaSelec = x/225;
 */
public class ControlPizzaCour implements EventHandler<MouseEvent> {

    private ModeleCommande modele;

    public ControlPizzaCour(ModeleCommande modele) {
        this.modele = modele;
    }

    @Override
    public void handle(MouseEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        int numPizzaSelec = x/225;
        if (y>20 && y<220) {
            modele.setNumPizzaCourante(numPizzaSelec);
        }

    }
}