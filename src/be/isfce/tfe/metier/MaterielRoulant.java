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
public class MaterielRoulant {

    private String id;
    private String marque;
    private String type;
    private String carburant;
    private String numImmatr;
    private int nbdeplaces;
    private int kmactuel;
    private Date anneedeconstruction;
    private Date dateexctincteur;
    private ArrayList<Entretien> lesentretiens;
    private ArrayList<Chauffeur> Leschauffeurs;
    private ArrayList<Circuit> lescircuits;
    private ArrayList<UtilisationCarte> lesmemos;
    
    
    public int getKmactuel() {
        return kmactuel;
    }

    public void setKmactuel(int kmactuel) {
        this.kmactuel = kmactuel;
    }

    public void setId(String id) {
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

    public Date getAnneedeconstruction() {
        return anneedeconstruction;
    }

    public Date getDateexctincteur() {
        return dateexctincteur;
    }

    public void setAnneedeconstruction(Date anneedeconstruction) {
        this.anneedeconstruction = anneedeconstruction;
    }

    public void setDateexctincteur(Date dateexctincteur) {
        this.dateexctincteur = dateexctincteur;
    }
    
    

    public String getId() {
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
