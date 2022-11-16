package com.example.pizza;

import com.example.pizza.modele.Pizza;
import com.example.pizza.modele.PizzaCreme;
import com.example.pizza.modele.PizzaTomate;

import java.util.ArrayList;

public class ModeleCommande {

    private int nbPizza;
    private ArrayList<Pizza> listPizza;
    private int numCommande;
    private double prixCommande;
    public double taux;

    /**
     * Constructeur de la classe ModeleCommande
     * @param numCommande
     */
    public ModeleCommande(int numCommande) {
        this.nbPizza = 0;
        this.listPizza = new ArrayList<Pizza>();
        this.numCommande = numCommande;
        this.prixCommande = 0;
    }

    /**
     * Met à jour le taux de réduction en fonction du type de client
     * @param strategyFidelite
     */
    public void setTaux (StrategyFidelite strategyFidelite) {
        if (strategyFidelite != null) {
            this.taux = strategyFidelite.getTaux();
        } else {
            this.taux = 1.0;
        }
    }

    /**
     * Ajoute une pizza à la commande
     * @param pizza
     */
    public void ajouterPizza (String pizza){
        //On vérifie que le nombre max de pizza n'est pas atteint pour une commande
        if (nbPizza < 4){
            Pizza p;
            if (pizza.compareTo("Creme") == 0){
                p = new PizzaCreme();
            } else {
                p = new PizzaTomate();
            }
            nbPizza++;
            listPizza.add(p);

        }
    }

    /**
     * Methode permettant de calculer le prix de la commande
     */
    public void calculerPrixCommande(){
        double prix = 0;
        for (Pizza p : listPizza){
            prix += p.cout() * taux;
        }
        prixCommande = prix;
    }

    /**
     * Retourne le nombre de pizza de la commande
     * @return
     */
    public int getNbPizza() {
        return listPizza.size();
    }

    /**
     * Retourne le prix de la commande
     * @return
     */
    public double getPrixCommande() {
        return prixCommande;
    }

    /**
     * Retourne la liste de pizza
     * @return
     */
    public ArrayList<Pizza> getListPizza() {
        return listPizza;
    }

    /**
     * Retourne le numéro de la pizza courante
     * @return
     */
    public int getNbPizzaCourante() {
        return nbPizza;
    }
}
