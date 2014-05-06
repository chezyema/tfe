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
public class UtilisationCarte {
    
    private  int idutilisationcarte;
    private Date dateutilisation;
    private List<MaterielRoulant> lesvehicules;
    private List<CarteCarburant> lescartes;
    
    
    public int getIdutilisationcarte() {
        return idutilisationcarte;
    }

    public void setIdutilisationcarte(int idutilisationcarte) {
        this.idutilisationcarte = idutilisationcarte;
    }

    public UtilisationCarte() {
    }


    public Date getDateUtilisation() {
        return dateutilisation;
    }

    public Date getDateutilisation() {
        return dateutilisation;
    }

    public void setDateutilisation(Date dateutilisation) {
        this.dateutilisation = dateutilisation;
    }

    public void setLesvehicules(List<MaterielRoulant> lesvehicules) {
        this.lesvehicules = lesvehicules;
    }

    public void setLescartes(List<CarteCarburant> lescartes) {
        this.lescartes = lescartes;
    }

    public List<MaterielRoulant> getLesvehicules() {
        return lesvehicules;
    }

    public List<CarteCarburant> getLescartes() {
        return lescartes;
    }


   

    

    @Override
    public String toString() {
        return "UtilisationCarte{" + "idutilisationcarte=" + idutilisationcarte + ", dateutilisation=" + dateutilisation + ", lesvehicules=" + lesvehicules + ", lescartes=" + lescartes + '}';
    }

   
    
    
}
