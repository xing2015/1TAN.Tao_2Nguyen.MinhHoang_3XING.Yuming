package controler;

import java.util.Calendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author TAN
 */
public class Calendrier {
	private int annee;
        private int mois;

    public Calendrier(){}
    
    public Calendrier(int annee, int mois){
        this.annee = annee;
        this.mois = mois;
    }
    
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getAnnee() {
        return this.annee;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getMois() {
        return mois;
    }

    public String[] getCalendrier() {
        String a[] = new String[42];
        Calendar date = Calendar.getInstance();
        date.set(annee, mois - 1, 1);
        int week = date.get(Calendar.DAY_OF_WEEK) - 2;
        if (week < 0) {
			week = 6;
		}
        int jour = 0;

        //les mois de 31 jours  
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7
                || mois == 8 || mois == 10 || mois == 12) {
            jour = 31;
        }

        //les mois de 30 jours 
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            jour = 30;
        }

        //le mois de fevrier
        if (mois == 2) {
            if (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0)) {
                jour = 29;
            } else {
                jour = 28;
            }
        }

        for (int i = week, n = 1; i < week + jour; i++) {
            a[i] = String.valueOf(n);
            n++;
        }
        return a;
    }
}
