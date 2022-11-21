package com.example.pizza.controleur;

import com.example.pizza.modele.ModeleCommande;
import com.example.pizza.modele.fidelite.ClientAbonnement;
import com.example.pizza.modele.fidelite.ClientCarte;
import com.example.pizza.modele.fidelite.ClientNouveau;
import com.example.pizza.modele.fidelite.StrategyFidelite;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

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
        //on recupere le type de fidelite selectionnee
        ComboBox combo = (ComboBox) actionEvent.getSource();
        String typeFidelite = combo.getValue().toString();
        StrategyFidelite fidelite = null;
        if (typeFidelite.equals("Nouveau client")){
            fidelite = new ClientNouveau();
        }else if (typeFidelite.equals("Client adhérent")){
            fidelite = new ClientAbonnement();
        }else {
            fidelite = new ClientCarte();
        }
        //on met a jour le modele
        modele.setFidelite(fidelite);
        System.out.println(fidelite.getTaux());
        //on met a jour la vue
        modele.notifierObservateurs();
    }
}
