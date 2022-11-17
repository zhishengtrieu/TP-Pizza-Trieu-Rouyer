package com.example.pizza.controleur;

import com.example.pizza.ModeleCommande;
import com.example.pizza.modele.ClientAbonnement;
import com.example.pizza.modele.ClientCarte;
import com.example.pizza.modele.ClientNouveau;
import com.example.pizza.modele.StrategyFidelite;
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
        //on recupere le type de fidelite selectionnee
        String typeFidelite = actionEvent.getSource().toString();
        StrategyFidelite fidelite = null;
        if (typeFidelite.equals("Nouveau client")){
            fidelite = new ClientNouveau();
        }else if (typeFidelite.equals("Client adhérent")){
            fidelite = new ClientAbonnement();
        }else if (typeFidelite.equals("Cliente avec carte")) {
            fidelite = new ClientCarte();
        }
        //on met a jour le modele
        modele.setFidelite(fidelite);
        //on met a jour la vue
        modele.notifierObservateurs();
    }
}
