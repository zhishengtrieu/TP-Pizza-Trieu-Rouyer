package com.example.pizza;

public interface Pizza {

    /**
     * Retourne l'image de la pizza
     * @return MyImage
     */
    MyImage getPizzalm();

    /**
     * Retourne le prix de la pizza
     * @return double
     */
    double cout();

    /**
     * Retourne la description de la pizza
     * @return String
     */
    String getDescription();

}
