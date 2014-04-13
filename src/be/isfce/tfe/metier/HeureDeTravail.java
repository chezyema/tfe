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

    public void setIdheuredetravail(int idheuredetravail) {
        this.idheuredetravail = idheuredetravail;
    }

    

    public int getIdheuredetravail() {
        return idheuredetravail;
    }
     private int idheuredetravail;
    private String heurededebut;
    private String heuredefin;
    private ArrayList<Circuit> lescircuits;

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

    @Override
    public String toString() {
        return "HeureDeTravail{" + "idheuredetravail=" + idheuredetravail + ", heurededebut=" + heurededebut + ", heuredefin=" + heuredefin + ", lescircuits=" + lescircuits + '}';
    }

    

    public void setLesCircuits(ArrayList<Circuit> LesCircuits) {
        this.lescircuits = LesCircuits;
    }
}
