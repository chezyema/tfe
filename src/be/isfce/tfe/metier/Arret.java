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

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
