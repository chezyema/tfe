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

    public void setValiditercap(Date validitercap) {
        this.validitercap = validitercap;
    }

    public Date getValiditercap() {
        return validitercap;
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

    public void setCodepostale(int codepostale) {
        this.codepostale = codepostale;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setValiditercartechauffeur(Date validitercartechauffeur) {
        this.validitercartechauffeur = validitercartechauffeur;
    }

    public int getCodepostale() {
        return codepostale;
        
    }

    public String getVille() {
        return ville;
    }

    public Date getValiditercartechauffeur() {
        return validitercartechauffeur;
    }

    public String getEmail() {
        return email;
    }

    public Date getSelectionmedicale() {
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

    public void setSelectionMedicale(Date SelectionMedicale) {
        this.selectionmedicale = SelectionMedicale;
    }
    private long id;
    private String nomchauffeur;
    private String prenomchauffeur;
    private Date datedenaissance;
    private String adresse;
    private int codepostale;
    private String ville;
    private int numtelephone;
    private String email;
    private Date selectionmedicale;
    private Date validitercartechauffeur;
    private Date validitercap;
    private ArrayList<Circuit> lescircuits;
    private ArrayList<MaterielRoulant> lesvehicules;
    private ArrayList<DocumentsAdministratifs> lesdocuments;
}
