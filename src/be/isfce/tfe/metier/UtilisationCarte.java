/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yema
 */

public class UtilisationCarte {
    
     
     private Date dateutilisation;
     private  ArrayList <MaterielRoulant> lesvehicules; 
     private  ArrayList <CarteCarburant> lescartes; 

    public Date getDateUtilisation() {
        return dateutilisation;
    }

    public void setDateUtilisation(Date DateUtilisation) {
        this.dateutilisation = DateUtilisation;
    }

    public UtilisationCarte(Date DateUtilisation) {
        this.dateutilisation = DateUtilisation;
    }

    public void setLesVehicules(ArrayList<MaterielRoulant> LesVehicules) {
        this.lesvehicules = LesVehicules;
    }

    public void setLesCartes(ArrayList<CarteCarburant> LesCartes) {
        this.lescartes = LesCartes;
    }

    
    
}
