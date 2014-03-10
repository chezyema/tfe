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
public class MaterielRoulant {
    
    private int id;
    
    private String marque;
   
    private String type;
   
    private String carburant;
    
    private String numImmatr;
     
    private int nbdeplaces;
    
    private  ArrayList <Entretien> lesentretiens; 
    private  ArrayList <Chauffeur> Leschauffeurs; 
    private  ArrayList <Circuit> lescircuits; 
    private  ArrayList <UtilisationCarte> lesmemos; 

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String Marque) {
        this.marque = Marque;
    }

    public void setType(String Type) {
        this.type = Type;
    }

    public void setCarburant(String Carburant) {
        this.carburant = Carburant;
    }

    public void setNumImmatr(String NumImmatr) {
        this.numImmatr = NumImmatr;
    }

    public void setNbDePlaces(int NbDePlaces) {
        this.nbdeplaces = NbDePlaces;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getType() {
        return type;
    }

    public String getCarburant() {
        return carburant;
    }

    public String getNumImmatr() {
        return numImmatr;
    }

    public int getNbDePlaces() {
        return nbdeplaces;
    }

    public void setLesEntretiens(ArrayList<Entretien> LesEntretiens) {
        this.lesentretiens = LesEntretiens;
    }

    public void setLesChauffeurs(ArrayList<Chauffeur> LesChauffeurs) {
        this.Leschauffeurs = LesChauffeurs;
    }

    public void setLesCircuits(ArrayList<Circuit> LesCircuits) {
        this.lescircuits = LesCircuits;
    }

    public void setLesMemos(ArrayList<UtilisationCarte> LesMemos) {
        this.lesmemos = LesMemos;
    }

    

    
    
}
