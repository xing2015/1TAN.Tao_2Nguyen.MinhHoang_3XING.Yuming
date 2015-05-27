/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author xing
 */
public class Seance {
   // private int dureeSeance;
    private String date;
    private String heure;/*matin or après-midi**/
    private String module;
    private String formation;
    
    public Seance(String date, String heure, String module, String formation) {
        //this.dureeSeance = dureeSeance;
        this.date = date;
        this.heure = heure;
        this.module = module;
        this.formation = formation;
    }
   
    
    public Seance() {
    }

    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }
   

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getModule() {
        return module;
    }

    public String getFormation() {
        return formation;
    }


    
    
    
    
}
