/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import java.util.Date;

/**
 *
 * @author yema
 */
public class Entretien {

    private int id;
    private String description;
    private int kmEntretienFait;
    private Date dateEntretien;
    private MaterielRoulant coordonnee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKmEntretienFait() {
        return kmEntretienFait;
    }

    public void setKmEntretienFait(int kmEntretienFait) {
        this.kmEntretienFait = kmEntretienFait;
    }

    public Date getDateEntretien() {
        return dateEntretien;
    }

    public void setDateEntretien(Date dateEntretien) {
        this.dateEntretien = dateEntretien;
    }

    public MaterielRoulant getCoordonnee() {
        return coordonnee;
    }

    public void setCoordonnee(MaterielRoulant Coordonnee) {
        this.coordonnee = Coordonnee;
    }
}
