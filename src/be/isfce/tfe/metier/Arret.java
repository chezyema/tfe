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
public class Arret {

    private int id;
    private String adresse;
    private ArrayList<Circuit> lescircuits;

    public ArrayList<Circuit> getLescircuits() {
        return lescircuits;
    }

    public void setLesCircuits(ArrayList<Circuit> lesCircuits) {
        this.lescircuits = lesCircuits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return "Arret{" + "id=" + id + ", adresse=" + adresse + ", lescircuits=" + lescircuits + '}';
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
