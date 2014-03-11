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
    private int telecole;
    private String emailecole;
    private String nomdirecteur;
    private String anneescolaire;
    private ArrayList<Eleve> leseleves;

    public void setNomecole(String nomecole) {
        this.nomecole = nomecole;
    }

    public void setAdresseecole(String adresseecole) {
        this.adresseecole = adresseecole;
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

    public void setNomDirecteur(String NomDirecteur) {
        this.nomdirecteur = NomDirecteur;
    }

    public void setAnneeScolaire(String AnneeScolaire) {
        this.anneescolaire = AnneeScolaire;
    }

    public int getId() {
        return id;
    }
}
