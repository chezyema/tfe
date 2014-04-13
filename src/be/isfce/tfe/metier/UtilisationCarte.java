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
    
    private  int idutilisationcarte;
    private Date dateutilisation;
    public int getIdutilisationcarte() {
        return idutilisationcarte;
    }

    public void setIdutilisationcarte(int idutilisationcarte) {
        this.idutilisationcarte = idutilisationcarte;
    }

    public UtilisationCarte() {
    }

    private ArrayList<MaterielRoulant> lesvehicules;
    private ArrayList<CarteCarburant> lescartes;

    public Date getDateUtilisation() {
        return dateutilisation;
    }

    public Date getDateutilisation() {
        return dateutilisation;
    }

    public void setDateutilisation(Date dateutilisation) {
        this.dateutilisation = dateutilisation;
    }

    public void setLesvehicules(ArrayList<MaterielRoulant> lesvehicules) {
        this.lesvehicules = lesvehicules;
    }

    public void setLescartes(ArrayList<CarteCarburant> lescartes) {
        this.lescartes = lescartes;
    }

    public ArrayList<MaterielRoulant> getLesvehicules() {
        return lesvehicules;
    }

    public ArrayList<CarteCarburant> getLescartes() {
        return lescartes;
    }


    public void setLesVehicules(ArrayList<MaterielRoulant> LesVehicules) {
        this.lesvehicules = LesVehicules;
    }

    public void setLesCartes(ArrayList<CarteCarburant> LesCartes) {
        this.lescartes = LesCartes;
    }

    @Override
    public String toString() {
        return "UtilisationCarte{" + "idutilisationcarte=" + idutilisationcarte + ", dateutilisation=" + dateutilisation + ", lesvehicules=" + lesvehicules + ", lescartes=" + lescartes + '}';
    }
    
    
}
