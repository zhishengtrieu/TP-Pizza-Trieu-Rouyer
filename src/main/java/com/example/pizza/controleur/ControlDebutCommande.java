package com.example.pizza.controleur;

import com.example.pizza.ModeleCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControlDebutCommande implements EventHandler<ActionEvent> {

    private ModeleCommande modele;

    /**
     * Constructeur de la classe ControlDebutCommande
     * @param modele le modèle de la commande
     */
    public ControlDebutCommande(ModeleCommande modele) {
        this.modele = modele;
    }

    /**
     * Gère l'événement de ControlDebutCommande
     * @param actionEvent
     */
    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
