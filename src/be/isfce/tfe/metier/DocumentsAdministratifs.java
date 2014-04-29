/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import be.isfce.tfe.db.DocumentsAdministratifsDBHelper;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yema
 */
public class DocumentsAdministratifs {

    @Override
    public String toString() {
        return "DocumentsAdministratifs{" + "id=" + id + ", libelle=" + libelle + ", DateValiditer=" + DateValiditer + ", idmaterielroulant=" + idmaterielroulant + ", idchauffeur=" + idchauffeur + ", leschauffeurs=" + leschauffeurs + ", vehicule=" + vehicule + '}';
    }

    public void setIdmaterielroulant(String idmaterielroulant) {
        this.idmaterielroulant = idmaterielroulant;
    }

    public void setIdchauffeur(String idchauffeur) {
        this.idchauffeur = idchauffeur;
    }

    private int id;
    private String libelle;
    private Date DateValiditer;
    private String idmaterielroulant;
    private String idchauffeur;
    private ArrayList<Chauffeur> leschauffeurs;
    private MaterielRoulant vehicule;

    public String getIdmaterielroulant() {
        return idmaterielroulant;
    }

    public String getIdchauffeur() {
        return idchauffeur;
    }

    public void setLeschauffeurs(ArrayList<Chauffeur> leschauffeurs) {
        this.leschauffeurs = leschauffeurs;
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

    public ArrayList<Chauffeur> getLeschauffeurs() {
        return leschauffeurs;
    }

    

    public MaterielRoulant getVehicule() {
        return vehicule;
    }

    public void setDocument(MaterielRoulant vehicule) {
        this.vehicule = vehicule;
    }

    
}
