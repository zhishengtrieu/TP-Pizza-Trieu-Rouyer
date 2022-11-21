
package com.example.pizza.vue;

import com.example.pizza.modele.ModeleCommande;
import com.example.pizza.MyImage;
import com.example.pizza.modele.Pizza;
import com.example.pizza.modele.Sujet;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;



public class VueCommIm extends GridPane implements Observateur{

	/**
	 * Constructeur de la classe VueCommIm
	 */
	public VueCommIm(){
		super();
		this.setPadding(new Insets(15));
		this.setHgap(25);
		this.setAlignment(Pos.CENTER);
	}

	/**
	 * Methode actualisant l'image de la commande
	 * @param sujet le sujet a actualiser
	 */
	@Override
	public void actualiser(Sujet sujet) {
		ModeleCommande modele= (ModeleCommande) sujet;
		//on recupere la liste des pizzas de la commande
		ArrayList<Pizza> pizzas = modele.getListPizza();
		//on reinitialise la vue
		this.getChildren().clear();
		for(int i=0 ; i<modele.getNbPizza() ; i++){
			Pizza pizza = pizzas.get(i);
			//on recupere l'image de la pizza
			MyImage myIm= pizza.getPizzalm();
			//si la pizza est la pizza courante, on l'entoure d'un rectangle
			if (modele.getNumPizzaCourante() == i){
				Rectangle rect= new Rectangle(200,200, Color.rgb(255,255,255,0.2)); // création d'un rectangle entourant l'image
				rect.setStroke(Color.BLACK);
				this.add(rect, i, 1);
			}
			this.add(myIm.getSp(),i,1);
		}

	}
}
