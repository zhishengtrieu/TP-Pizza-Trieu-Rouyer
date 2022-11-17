package com.example.pizza.controleur;

import com.example.pizza.ModeleCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurFidelite implements EventHandler<ActionEvent> {

    private ModeleCommande modele;

    /**
     * Constructeur de la classe ControleurFidelite
     * @param modele le modèle de la commande
     */
    public ControleurFidelite(ModeleCommande modele) {
        this.modele = modele;
    }

    /**
     * Gère l'événement de ControleurFidelite
     * @param actionEvent
     */
    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
