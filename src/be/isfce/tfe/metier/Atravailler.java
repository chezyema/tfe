/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import java.util.logging.Logger;

/**
 *
 * @author yema
 */
public class Atravailler {
     private int idtrajets;
     private long idchauffeur;

 
    public long getIdchauffeur() {
        return idchauffeur;
    }

    
    public void setIdchauffeur(long idchauffeur) {
        this.idchauffeur = idchauffeur;
    }

    public int getIdtrajets() {
        return idtrajets;
    }

    @Override
    public String toString() {
        return "Atravailler{" + "idtrajets=" + idtrajets + ", idchauffeur=" + idchauffeur + '}';
    }
    
    
     
    
}
