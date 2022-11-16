package com.example.pizza;

public interface Sujet {

    /**
     * Ajoute un observateur à la liste des observateurs
     * @param o
     */
    public void enregistrerObservateur(Observateur o);

    /**
     * Supprime un observateur de la liste des observateurs
     * @param o
     */
    public void supprimerObservateur(Observateur o);

    /**
     * Notifie tous les observateurs de la liste
     */
    public void notifierObservateur();
}
