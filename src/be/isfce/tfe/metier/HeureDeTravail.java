/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author yema
 */
@DatabaseTable(tableName="HeureDeTravail")
public class HeureDeTravail {
    @DatabaseField
    private String HeureDeDebut;
    @DatabaseField
    private String HeureDeFin;

    public void setHeureDeDebut(String HeureDeDebut) {
        this.HeureDeDebut = HeureDeDebut;
    }

    public void setHeureDeFin(String HeureDeFin) {
        this.HeureDeFin = HeureDeFin;
    }

    public String getHeureDeDebut() {
        return HeureDeDebut;
    }

    public String getHeureDeFin() {
        return HeureDeFin;
    }

    public HeureDeTravail(String HeureDeDebut, String HeureDeFin) {
        this.HeureDeDebut = HeureDeDebut;
        this.HeureDeFin = HeureDeFin;
    }

    public HeureDeTravail() {
    }
    
}
