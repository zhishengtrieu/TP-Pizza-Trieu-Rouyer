package com.example.pizza.modele;

import com.example.pizza.modele.decorateurs.*;
import com.example.pizza.modele.factory.*;
import com.example.pizza.modele.fidelite.StrategyFidelite;
import com.example.pizza.vue.Observateur;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;

public class ModeleCommande implements Sujet {

    private int nbPizza;
    private int numPizzaCourante;
    private ArrayList<Pizza> listPizza;
    private int numCommande;
    private double prixCommande;
    public double taux;
    private ArrayList<Observateur> listObservateur;
    public static int nbCommande = 0;

    /**
     * Constructeur de la classe ModeleCommande
     */
    public ModeleCommande() {
        nbCommande++;
        this.numCommande = nbCommande;
        this.nbPizza = 0;
        this.listPizza = new ArrayList<Pizza>();
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
            //on utilise une fabrique pour creer la pizza
            FactoryPizza factoryPizza;
            //le type de fabrique depend du type de pizza choisi
            switch (pizza) {
                case "Tomate":
                    factoryPizza = new FactoryPizzaTomate();
                    break;
                case "Fromage":
                    factoryPizza = new FactoryPizzaFromage();
                    break;
                default:
                    //on aura la fabrique de pizza creme par defaut
                    factoryPizza = new FactoryPizzaCreme();
            }
            listPizza.add(factoryPizza.creerPizza());
            nbPizza++;

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

    /**
     * Methode permettant d'ajouter un ingrédient à la pizza courante
     *
     * @param numIngredient
     */
    public void choixIngredient(int numIngredient) {
        //on execute la methode que si une pizza a ete selectionnee
        if (numPizzaCourante >= 0 && numPizzaCourante < nbPizza) {
            //on recupere la pizza courante
            Pizza pizza = listPizza.get(numPizzaCourante);
            //on ajoute l'ingredient avec un decorateur
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
            //on remplace la pizza courante par la pizza decoree
            listPizza.set(numPizzaCourante, pizza);
        }
    }

    /**
     * Methode permettant de retirer la dernire pizza de la commande
     */
    public void retirerPizza() {
        if (nbPizza > 0) {
            //on retire le dernier
            listPizza.remove(nbPizza - 1);
            nbPizza--;
        }
    }

    /**
     * Methode permettant de supprimer le dernier ingredient à la pizza courante
     */
    public void retirerIngredient() {
        //on execute la methode que si une pizza a ete selectionnee
        if (numPizzaCourante >= 0 && numPizzaCourante < nbPizza) {
            //on recupere la pizza courante
            Pizza pizza = listPizza.get(numPizzaCourante);
            //on verifie que la pizza est un decorateur
            if (pizza instanceof IngredientPizza deco) {
                //on recupere la pizza decoree
                //on prend l'objet decoree du decorateur
                pizza = deco.getPizza();
                //on suprime la derniere image qui correspond au dernier ingredient
                StackPane sp = pizza.getPizzalm().getSp();
                int taille = sp.getChildren().size();
                sp.getChildren().remove(taille - 1);
                //on remplace la pizza courante par l'ancienne pizza
                listPizza.set(numPizzaCourante, pizza);
            }
        }

    }
}
