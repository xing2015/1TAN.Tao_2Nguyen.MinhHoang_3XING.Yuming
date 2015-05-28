/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.List;

/**
 * @author YUMING
 * @author TAO
 * @author MINHHOANG
 */
public class Formation {

    public String nom;
    public int duree;
    public List<Module> listeModule;

    public Formation() {
    }

    /**
     *
     * @param nom
     * @param duree
     * @param listeModule
     */
    public Formation(String nom, int duree, List<Module> listeModule) {
        this.nom = nom;
        this.duree = duree;
        this.listeModule = listeModule;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @param duree
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     *
     * @param listeModule
     */
    public void setListeModule(List<Module> listeModule) {
        this.listeModule = listeModule;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return
     */
    public int getDuree() {
        return duree;
    }

    /**
     *
     * @return
     */
    public List<Module> getListeModule() {
        return listeModule;
    }

}
