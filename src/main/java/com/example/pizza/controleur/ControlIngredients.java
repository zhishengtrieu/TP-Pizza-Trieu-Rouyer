package com.example.pizza.controleur;

import com.example.pizza.modele.ModeleCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ControlIngredients implements EventHandler<ActionEvent> {

    private ModeleCommande modele;

    /**
     * Constructeur de la classe ControlIngredients
     *
     * @param modele le modèle de la commande
     */
    public ControlIngredients(ModeleCommande modele) {
        this.modele = modele;
    }

    /**
     * Gère l'événement de ControlIngredients
     *
     * @param actionEvent
     */
    @Override
    public void handle(ActionEvent actionEvent) {
        //on recupere l'ingredient choisi
        Button button = (Button) actionEvent.getSource();
        String choix = button.getId();
        //on met a jour le modele
        switch (choix){
            //dans le cas ou on doit retirer un ingredient
            case "RetirerIngr" :
                modele.retirerIngredient();
                break;
            default:
                //le cas ou on doit ajouter un ingredient
                //on recupere l'id de l'ingredient
                int ingredient = Integer.parseInt(choix);
                modele.choixIngredient(ingredient);
        }
        //on met a jour la vue
        modele.notifierObservateurs();
    }
}
