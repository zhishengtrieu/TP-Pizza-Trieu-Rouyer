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
        String choix = button.getId();
        //on met a jour le modele
        switch (choix){
            case "Creme" :
                modele.ajouterPizza("Creme");
                break;
            case "Tomate" :
                modele.ajouterPizza("Tomate");
                break;
            case "Retirer" :
                modele.retirerPizza();
                break;
            default:

        }
        //on met a jour la vue
        modele.notifierObservateurs();
    }
}
