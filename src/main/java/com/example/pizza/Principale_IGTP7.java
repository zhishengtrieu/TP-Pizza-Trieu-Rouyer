package com.example.pizza;

import com.example.pizza.controleur.*;
import com.example.pizza.modele.ModeleCommande;
import com.example.pizza.vue.VueCommIm;
import com.example.pizza.vue.VueCommText;
import com.example.pizza.vue.VuePrix;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Principale_IGTP7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        ModeleCommande modele = new ModeleCommande();
        String[] ingredients = {"Fromage", "Champignons", "Chorizo", "Oeuf", "Oignons", "Olives noires", "Olives vertes", "Roquette"};
        String[] fidelite = {"Nouveau client", "Cliente avec carte", "Client adhérent"};
        Button[] bIngr;
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10));


        // Panneau situe au nord de l'IG contenant les 2 boutons
        // permettant le choix de la base des pizzas et le niveau de fidelite du client
        HBox pnord = new HBox(20);
        pnord.setPadding(new Insets(10));
        pnord.setAlignment(Pos.CENTER);

        //zone 1
        ComboBox<String> choixFidelite = new ComboBox<String>();
        choixFidelite.getItems().addAll(fidelite);
        choixFidelite.setValue("Nouveau client");
        choixFidelite.setOnAction(new ControleurFidelite(modele));

        Button addPizzaCreme = new Button("Ajouter une pizza fond creme");
        addPizzaCreme.setId("Creme");
        addPizzaCreme.setOnAction(new ControlCommande(modele));
        Button addPizzaTomate = new Button("Ajouter une pizza fond tomate");
        addPizzaTomate.setId("Tomate");
        addPizzaTomate.setOnAction(new ControlCommande(modele));
        Button addPizzaFromage = new Button("Ajouter une pizza fond fromage blanc");
        addPizzaFromage.setId("Fromage");
        addPizzaFromage.setOnAction(new ControlCommande(modele));

        //Un bouton pour retirer la dernière pizza
        Button removePizza = new Button("Retirer la derniere pizza");
        removePizza.setId("Retirer");
        removePizza.setOnAction(new ControlCommande(modele));
        pnord.getChildren().addAll(choixFidelite, addPizzaCreme, addPizzaTomate, addPizzaFromage, removePizza);
        bp.setTop(pnord); //place pnord en haut de l'IG

        // Panneau au centre de l'IG contenant la vision du choix des pizzas
        // ainsi que les boutons pour ajouter des ingredients
        BorderPane pcentral = new BorderPane();
        pcentral.setMaxHeight(300);

        //--> Le panneau avec la vision des images des pizzas
        VueCommIm visionComm = new VueCommIm();
        pcentral.setLeft(visionComm);
        modele.enregistrerObservateur(visionComm);
        //--> Le panneau contenant les boutons des ingredrients
        GridPane pingr = new GridPane();
        pingr.setAlignment(Pos.CENTER);
        pingr.setHgap(10);
        bIngr = new Button[8];
        for (int i = 0; i < ingredients.length; i++) {
            bIngr[i] = new Button(ingredients[i]);
            bIngr[i].setId(String.valueOf(i));
            bIngr[i].setMinSize(100, 40);
            bIngr[i].setOnAction(new ControlIngredients(modele));
            pingr.add(bIngr[i], i, 0);
        }
        //Un bouton dans pour retirer le dernier ingredient ajoute à la pizza courante
        Button removeIngr = new Button("Retirer le dernier ingredient");
        removeIngr.setId("RetirerIngr");
        removeIngr.setOnAction(new ControlIngredients(modele));
        pingr.add(removeIngr, 8, 0);
        // pingr.setPreferredSize(new Dimension(935,50));
        pcentral.setBottom(pingr);
        bp.setCenter(pcentral); //place pcentral au centre de l'IG

        // Panneau au sud de l'IG dans lequel se trouve l'affichage
        // du contenu de la commande et son prix
        BorderPane psud = new BorderPane();
        psud.setMinHeight(300);

        VueCommText commtxt = new VueCommText();
        commtxt.setFont(new Font("Times", 14));
        //  commtxt.setPreferredSize(new Dimension(935,200));
        modele.enregistrerObservateur(commtxt);
        psud.setCenter(commtxt);
        //Mettre un panneau VBox
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);

        VuePrix txtBas = new VuePrix();
        txtBas.setFont(new Font("Times", 16));
        txtBas.setTextAlignment(TextAlignment.CENTER);
        modele.enregistrerObservateur(txtBas);
        vb.getChildren().add(txtBas);

        //Un bouton pour valider la commande
        Button valider = new Button("Valider la commande");
        valider.setId("Valider");
        valider.setOnAction(new ControlCommande(modele));
        vb.getChildren().add(valider);

        psud.setBottom(vb);
        bp.setBottom(psud);


        Scene scene = new Scene(bp, 1035, 670);
        scene.setOnMouseClicked(new ControlPizzaCour(modele));
        stage.setTitle("Commande de pizzas");
        stage.setScene(scene);
        stage.show();
    }
}
