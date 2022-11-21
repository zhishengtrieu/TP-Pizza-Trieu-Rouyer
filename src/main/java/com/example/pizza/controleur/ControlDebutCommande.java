package com.example.pizza.controleur;

import com.example.pizza.modele.ModeleCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * Contrôleur qui gère l'événement d'une nouvelle base de pizza
 */
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
        //on recupere le base de pizza choisie
        Button button = (Button) actionEvent.getSource();
        String basePizza = button.getText();
        //on met a jour le modele
        if (basePizza.contains("tomate")) {
            modele.ajouterPizza("Tomate");
        } else {
            modele.ajouterPizza("Creme");
        }
        //on met a jour la vue
        modele.notifierObservateurs();
    }
}
