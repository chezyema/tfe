/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

/**
 *
 * @author yema
 */
@DatabaseTable(tableName="Entretien")
public class Entretien {

    public Entretien() {
    }
    @DatabaseField(columnName="id",id=true)
    private int id;
    @DatabaseField
    private  String description ;
    @DatabaseField
    private  int kmEntretienFait;
    @DatabaseField
    private Date dateEntretien; 

  

    public Entretien(int id, String description, int kmEntretienFait, Date dateEntretien) {
        this.id = id;
        this.description = description;
        this.kmEntretienFait = kmEntretienFait;
        this.dateEntretien = dateEntretien;
    }

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
    
    
    
}
