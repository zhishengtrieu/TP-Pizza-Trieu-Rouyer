package com.example.pizza;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControlDebutCommande implements EventHandler<ActionEvent> {

    private ModeleCommande modele;

    public ControlDebutCommande(ModeleCommande modele) {
        this.modele = modele;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
