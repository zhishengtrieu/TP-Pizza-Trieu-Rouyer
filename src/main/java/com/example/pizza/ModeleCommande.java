package com.example.pizza;

import java.util.ArrayList;

public class ModeleCommande {

    private int nbPizza;
    private ArrayList<Pizza> listPizza;
    private int numCommande;
    private double prixCommande;

    public ModeleCommande(int numCommande) {
        this.nbPizza = 0;
        this.listPizza = new ArrayList<Pizza>();
        this.numCommande = numCommande;
        this.prixCommande = 0;
    }

    public void ajouterPizza (String pizza){
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

    public void calculerPrixCommande(){
        double prix = 0;
        for (Pizza p : listPizza){
            prix += p.cout();
        }
        prixCommande = prix;
    }

    public int getNbPizza() {
        return listPizza.size();
    }

    public double getPrixCommande() {
        return prixCommande;
    }

    public ArrayList<Pizza> getListPizza() {
        return listPizza;
    }

    public int getNbPizzaCourante() {
        return nbPizza;
    }
}
