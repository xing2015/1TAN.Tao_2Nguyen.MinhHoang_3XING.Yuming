/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author xing
 */
public class Planning extends Observable implements Serializable{
        private Formation formation;	
        private List<Seance> listS;
       
        
    public Planning() {
       formation = new Formation();
       listS = new ArrayList<Seance>();
       setFormation();      
    }

    public void setListSeance(){
        listS.add(new Seance("2015-09-01","Matin",this.formation.getListeModule().get(0).getNom(),this.formation.getNom()));
        listS.add(new Seance("2015-09-02","Matin",this.formation.getListeModule().get(0).getNom(),this.formation.getNom()));
        listS.add(new Seance("2015-09-03","Matin",this.formation.getListeModule().get(0).getNom(),this.formation.getNom()));
        listS.add(new Seance("2015-09-04","Matin",this.formation.getListeModule().get(0).getNom(),this.formation.getNom()));
        listS.add(new Seance("2015-09-05","Matin",this.formation.getListeModule().get(0).getNom(),this.formation.getNom()));
    }
    
    public void setFormation(){
        List<Module> listM = new ArrayList<Module>();
        listM.add( new Module("Java","java","red",10,150));
        listM.add( new Module("Base de données","BD","blue",10,150));
        listM.add( new Module("C++","c++","yellow",10,150));
       
        formation.setNom("L3-FI");
        formation.setDuree(500);
        formation.setListeModule(listM);
    }
    
   
}
