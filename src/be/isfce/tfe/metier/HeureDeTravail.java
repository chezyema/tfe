/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import java.util.ArrayList;



/**
 *
 * @author yema
 */

public class HeureDeTravail {
    
    private String heurededebut;
    
    private String heuredefin;
    
    private  ArrayList <Circuit> lescircuits; 

    public void setHeureDeDebut(String HeureDeDebut) {
        this.heurededebut = HeureDeDebut;
    }

    public void setHeureDeFin(String HeureDeFin) {
        this.heuredefin = HeureDeFin;
    }

    public String getHeureDeDebut() {
        return heurededebut;
    }

    public String getHeureDeFin() {
        return heuredefin;
    }

    public HeureDeTravail(String HeureDeDebut, String HeureDeFin) {
        this.heurededebut = HeureDeDebut;
        this.heuredefin = HeureDeFin;
    }

    public void setLesCircuits(ArrayList<Circuit> LesCircuits) {
        this.lescircuits = LesCircuits;
    }

    
    
}
