/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.String;

/**
 *
 * @author xing
 */
public class Module {
    private String nom;
    private String abbreviation;
    private String couleur;
    private int nbSeance;
    private int duree;

    /**
     *
     * @param nom
     * @param abbreviation
     * @param couleur
     * @param nbSeance
     * @param duree La durée en heures est affichée pour chaque module. 
     */
    public Module(String nom, String abbreviation, String couleur, int nbSeance,int duree) {
    this.nom = nom;
    this.abbreviation = abbreviation;
    this.couleur = couleur;
    this.nbSeance = nbSeance;
    this.duree = duree;
    }

  
    public Module() {
    }

   
    public String getNom() {
        return nom;
    }

   
    public void setNom(String nom) {
        this.nom = nom;
    }

 
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

  
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

  
    public int getNbSeance() {
        return nbSeance;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

  
    public void setNbSeance(int nbSeance) {
        this.nbSeance = nbSeance;
    }
    
}
