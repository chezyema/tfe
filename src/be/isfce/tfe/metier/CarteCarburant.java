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
public class CarteCarburant {

    private int id;
    private int kmutilisation;
    private int litrecarburant;
    private ArrayList<UtilisationCarte> lesutilisations;

    public void setId(int id) {
        this.id = id;
    }

    public void setKmUtilisation(int KmUtilisation) {
        this.kmutilisation = KmUtilisation;
    }

    public void setLitreCarburant(int LitreCarburant) {
        this.litrecarburant = LitreCarburant;
    }

    public int getId() {
        return id;
    }

    public int getKmUtilisation() {
        return kmutilisation;
    }

    public int getLitreCarburant() {
        return litrecarburant;
    }

    public void setLesUtilisations(ArrayList<UtilisationCarte> LesUtilisations) {
        this.lesutilisations = LesUtilisations;
    }
}
