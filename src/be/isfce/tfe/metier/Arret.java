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
@DatabaseTable
public class Arret {
    
    @DatabaseField(columnName="id",id=true)
    private int id;
    @DatabaseField
    private String adresse;

    public Arret() {
    }

    public Arret(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
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
