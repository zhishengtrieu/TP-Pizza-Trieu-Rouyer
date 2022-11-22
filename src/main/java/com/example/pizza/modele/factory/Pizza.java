package com.example.pizza.modele.factory;

import com.example.pizza.MyImage;

public interface Pizza {

    /**
     * Methode affichant l'image de la pizza
     * @return l'image de la pizza
     */
    MyImage getPizzalm();

    /**
     * Methode permettant de recuperer le prix de la pizza
     * @return le prix de la pizza
     */
    double cout();

    /**
     * Methode permettant de recuperer la description de la pizza
     * @return la description de la pizza
     */
    String getDescription();

}
