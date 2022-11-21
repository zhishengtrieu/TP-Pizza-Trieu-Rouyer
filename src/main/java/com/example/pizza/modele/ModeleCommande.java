package com.example.pizza.modele;

import com.example.pizza.modele.decorateurs.*;
import com.example.pizza.modele.fidelite.StrategyFidelite;
import com.example.pizza.vue.Observateur;

import java.util.ArrayList;

public class ModeleCommande implements Sujet {

    private int nbPizza;
    private int numPizzaCourante;
    private ArrayList<Pizza> listPizza;
    private int numCommande;
    private double prixCommande;
    public double taux;
    private ArrayList<Observateur> listObservateur;

    /**
     * Constructeur de la classe ModeleCommande
     *
     * @param numCommande
     */
    public ModeleCommande(int numCommande) {
        this.nbPizza = 0;
        this.listPizza = new ArrayList<Pizza>();
        this.numCommande = numCommande;
        this.prixCommande = 0;
        this.listObservateur = new ArrayList<Observateur>();
        this.taux = 1;
    }

    /**
     * Met à jour le taux de réduction en fonction du type de client
     *
     * @param strategyFidelite
     */
    public void setFidelite(StrategyFidelite strategyFidelite) {
        if (strategyFidelite != null) {
            this.taux = strategyFidelite.getTaux();
        } else {
            this.taux = 1.0;
        }
    }

    /**
     * Ajoute une pizza à la commande
     *
     * @param pizza
     */
    public void ajouterPizza(String pizza) {
        //On vérifie que le nombre max de pizza n'est pas atteint pour une commande
        if (nbPizza < 4) {
            Pizza p;
            if (pizza.compareTo("Creme") == 0) {
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
    public void calculerPrixCommande() {
        double prix = 0;
        for (Pizza p : listPizza) {
            prix += p.cout() * taux;
        }
        prixCommande = prix;
    }

    /**
     * Retourne le nombre de pizza de la commande
     *
     * @return
     */
    public int getNbPizza() {
        return nbPizza;
    }

    /**
     * Retourne le prix de la commande
     *
     * @return
     */
    public double getPrixCommande() {
        calculerPrixCommande();
        return prixCommande;
    }

    /**
     * Retourne la liste de pizza
     *
     * @return
     */
    public ArrayList<Pizza> getListPizza() {
        return listPizza;
    }

    /**
     * Retourne le numéro de la pizza courante
     *
     * @return
     */
    public int getNumPizzaCourante() {
        return numPizzaCourante;
    }

    /**
     * Methode permettant d'ajouter un observateur à la liste des observateurs
     *
     * @param o
     */
    public void enregistrerObservateur(Observateur o) {
        listObservateur.add(o);
    }

    /**
     * Methode permettant de supprimer un observateur de la liste des observateurs
     *
     * @param o
     */
    public void supprimerObservateur(Observateur o) {
        int i = listObservateur.indexOf(o);
        if (i >= 0) {
            listObservateur.remove(i);
        }
    }

    /**
     * Methode permettant de notifier tous les observateurs de la liste
     */
    public void notifierObservateurs() {
        for (int i = 0; i < listObservateur.size(); i++) {
            Observateur observer = listObservateur.get(i);
            observer.actualiser(this);
        }
    }

    public void setNumPizzaCourante(int numPizza) {
        numPizzaCourante = numPizza;
    }

    public void choixIngredient(int numIngredient) {
        //on recupere la pizza courante
        Pizza pizza = listPizza.get(numPizzaCourante);
        switch (numIngredient) {
            case 0:
                pizza = new PizzaFromage(pizza);
                break;
            case 1:
                pizza = new PizzaChampignon(pizza);
                break;
            case 2:
                pizza = new PizzaChorizo(pizza);
                break;
            case 3:
                pizza = new PizzaOeuf(pizza);
                break;
            case 4:
                pizza = new PizzaOignons(pizza);
                break;
            case 5:
                pizza = new PizzaOlivesN(pizza);
                break;
            case 6:
                pizza = new PizzaOlivesV(pizza);
                break;
            case 7:
                pizza = new PizzaRoquette(pizza);
                break;
            default:
        }

        listPizza.set(numPizzaCourante, pizza);
    }
}
