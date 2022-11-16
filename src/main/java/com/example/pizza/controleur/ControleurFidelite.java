package com.example.pizza.controleur;

import com.example.pizza.ModeleCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurFidelite implements EventHandler<ActionEvent> {

    private ModeleCommande modele;

    public ControleurFidelite(ModeleCommande modele) {
        this.modele = modele;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
