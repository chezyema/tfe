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
public class Ecole {

    private int id;
    private String nomecole;
    private String adresseecole;
    private int cdpostal;
    private String vil;
    private int telecole;
    private String emailecole;
    private String nomdirecteur;
    private String anneescolaire;
    private ArrayList<Eleve> leseleves;


    public int getCdpostal() {
        return cdpostal;
    }

    public void setCdpostal(int cdpostal) {
        this.cdpostal = cdpostal;
    }

    public void setVil(String vil) {
        this.vil = vil;
    }

    public String getVil() {
        return vil;
    }
   

    public void setNomecole(String nomecole) {
        this.nomecole = nomecole;
    }

    public void setAdresseecole(String adresseecole) {
        this.adresseecole = adresseecole;
    }

    public String getNomecole() {
        return nomecole;
    }

    public String getAdresseecole() {
        return adresseecole;
    }

    public int getTelecole() {
        return telecole;
    }

    public String getEmailecole() {
        return emailecole;
    }

    public String getNomdirecteur() {
        return nomdirecteur;
    }

    public String getAnneescolaire() {
        return anneescolaire;
    }

    public ArrayList<Eleve> getLeseleves() {
        return leseleves;
    }

    public void setTelecole(int telecole) {
        this.telecole = telecole;
    }

    public void setEmailecole(String emailecole) {
        this.emailecole = emailecole;
    }

    public void setNomdirecteur(String nomdirecteur) {
        this.nomdirecteur = nomdirecteur;
    }

    public void setAnneescolaire(String anneescolaire) {
        this.anneescolaire = anneescolaire;
    }

    public void setLeseleves(ArrayList<Eleve> leseleves) {
        this.leseleves = leseleves;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmailEcole(String EmailEcole) {
        this.emailecole = EmailEcole;
    }

    @Override
    public String toString() {
        return "Ecole{" + "id=" + id + ", nomecole=" + nomecole + ", adresseecole=" + adresseecole + ", cdpostal=" + cdpostal + ", vil=" + vil + ", telecole=" + telecole + ", emailecole=" + emailecole + ", nomdirecteur=" + nomdirecteur + ", anneescolaire=" + anneescolaire + ", leseleves=" + leseleves + '}';
    }

    

   

    public int getId() {
        return id;
    }
}
