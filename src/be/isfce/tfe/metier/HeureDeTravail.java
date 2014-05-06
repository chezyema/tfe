/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yema
 */
public class HeureDeTravail {

    public void setIdheuredetravail(int idheuredetravail) {
        this.idheuredetravail = idheuredetravail;
    }

    public void setDateTravail(Date dateTravail) {
        this.dateTravail = dateTravail;
    }

    

    public int getIdheuredetravail() {
        return idheuredetravail;
    }
     private int idheuredetravail;
    private String heurededebut;
    private String heuredefin;
    private Date dateTravail;
    private List<Chauffeur> leschauffeurs;

    public Date getDateTravail() {
        return dateTravail;
    }

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

    public List<Chauffeur> getLeschauffeurs() {
        return leschauffeurs;
    }
    
    

    public void setLeschauffeurs(List<Chauffeur> leschauffeurs) {
        this.leschauffeurs = leschauffeurs;
    }

    @Override
    public String toString() {
        return "HeureDeTravail{" + "idheuredetravail=" + idheuredetravail + ", heurededebut=" + heurededebut + ", heuredefin=" + heuredefin + ", dateTravail=" + dateTravail + ", leschauffeurs=" + leschauffeurs + '}';
    }

   
   
   
    
}
