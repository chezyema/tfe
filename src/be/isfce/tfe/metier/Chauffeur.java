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

public class Chauffeur {

    public Chauffeur() {
    }

    public void setLesCircuits(ArrayList<Circuit> LesCircuits) {
        this.lescircuits = LesCircuits;
    }

    public void setLesvehicules(ArrayList<MaterielRoulant> lesvehicules) {
        this.lesvehicules = lesvehicules;
    }

    public void setLesdocuments(ArrayList<DocumentsAdministratifs> lesdocuments) {
        this.lesdocuments = lesdocuments;
    }

    

    public long getId() {
        return id;
    }

    public String getNomChauffeur() {
        return nomchauffeur;
    }

    public String getPrenomChauffeur() {
        return prenomchauffeur;
    }

    public String getAdresse() {
        return adresse;
    }

    public Date getDateNaissance() {
        return datedenaissance;
    }

    public int getNumTelephone() {
        return numtelephone;
    }

    public String getEmail() {
        return email;
    }
    public Date getSelectionMesicale(){
        return selectionmedicale;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNomChauffeur(String NomChauffeur) {
        this.nomchauffeur = NomChauffeur;
    }

    public void setPrenomChauffeur(String PrenomChauffeur) {
        this.prenomchauffeur = PrenomChauffeur;
    }

    public void setAdresse(String Adresse) {
        this.adresse = Adresse;
    }

    public void setDateNaissance(Date DateNaissance) {
        this.datedenaissance = DateNaissance;
    }

    public void setNumTelephone(int NumTelephone) {
        this.numtelephone = NumTelephone;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
    public void setSelectionMedicale(Date SelectionMedicale){
        this.selectionmedicale = SelectionMedicale;
    }
      
    private long id;
   
    private String nomchauffeur;
    
    private String prenomchauffeur;
    
    
    private String adresse;
    
    private Date datedenaissance;
    
    private int numtelephone;
    
    private String email;
    
    private Date selectionmedicale;
    
    private  ArrayList <Circuit> lescircuits; 
    private  ArrayList <MaterielRoulant> lesvehicules; 
    private ArrayList <DocumentsAdministratifs> lesdocuments;
    
}
