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
public class Circuit {

    private int id;
    private String nomcircuit;
    private String tempsprevu;
    private int kmdepart;
    private int kmfin;
    private List<Arret> lesarrets;
    private List<Chauffeur> leschauffeurs;
    private List<Eleve> leseleves;

    public void setLesArrets(List<Arret> LesArrets) {
        this.lesarrets = LesArrets;
    }

    public void setLesChauffeurs(List<Chauffeur> LesChauffeurs) {
        this.leschauffeurs = LesChauffeurs;
    }

    public void setLesEleves(List<Eleve> LesEleves) {
        this.leseleves = LesEleves;
    }

    public int getId() {
        return id;
    }

    public String getNomCircuit() {
        return nomcircuit;
    }

    public String getTempsPrevu() {
        return tempsprevu;
    }

    public int getKmDepart() {
        return kmdepart;
    }

    public int getKmFin() {
        return kmfin;
    }

    public Date getDateCircuit() {
        return DateCircuit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomCircuit(String NomCircuit) {
        this.nomcircuit = NomCircuit;
    }

    public void setTempsPrevu(String TempsPrevu) {
        this.tempsprevu = TempsPrevu;
    }

    public void setKmDepart(int KmDepart) {
        this.kmdepart = KmDepart;
    }

    public void setKmFin(int KmFin) {
        this.kmfin = KmFin;
    }

    public void setDateCircuit(Date DateCircuit) {
        this.DateCircuit = DateCircuit;
    }

    public List<Arret> getLesarrets() {
        return lesarrets;
    }

    public List<Chauffeur> getLeschauffeurs() {
        return leschauffeurs;
    }

    public List<Eleve> getLeseleves() {
        return leseleves;
    }
    private Date DateCircuit;

    @Override
    public String toString() {
        return "Circuit{" + "id=" + id + ", nomcircuit=" + nomcircuit + ", tempsprevu=" + tempsprevu + ", kmdepart=" + kmdepart + ", kmfin=" + kmfin + ", lesarrets=" + lesarrets + ", leschauffeurs=" + leschauffeurs + ", leseleves=" + leseleves + ", DateCircuit=" + DateCircuit + '}';
    }

  
}
