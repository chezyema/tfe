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

public class DocumentsAdministratifs {
    
     
     private int id;
     
    private String libelle;
     
    private Date DateValiditer;
    private  ArrayList <Chauffeur> leschauffeurs; 
    private  ArrayList <MaterielRoulant> lesvehicules;  

    public void setLeschauffeurs(ArrayList<Chauffeur> leschauffeurs) {
        this.leschauffeurs = leschauffeurs;
    }

    public void setLesvehicules(ArrayList<MaterielRoulant> lesvehicules) {
        this.lesvehicules = lesvehicules;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String Libelle) {
        this.libelle = Libelle;
    }

    public void setDateValiditer(Date DateValiditer) {
        this.DateValiditer = DateValiditer;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public Date getDateValiditer() {
        return DateValiditer;
    }

    public void setLesChauffeurs(ArrayList<Chauffeur> LesChauffeurs) {
        this.leschauffeurs = LesChauffeurs;
    }

    public void setLesVehicules(ArrayList<MaterielRoulant> LesVehicules) {
        this.lesvehicules = LesVehicules;
    }

    

    
    
}
