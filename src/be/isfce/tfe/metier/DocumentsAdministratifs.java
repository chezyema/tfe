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
@DatabaseTable(tableName="DocumentsAdministratifs")
public class DocumentsAdministratifs {
    
     @DatabaseField(columnName="id",id=true)
     private int id;
     @DatabaseField
    private String Libelle;
     @DatabaseField
    private Date DateValiditer;

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public void setDateValiditer(Date DateValiditer) {
        this.DateValiditer = DateValiditer;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return Libelle;
    }

    public Date getDateValiditer() {
        return DateValiditer;
    }

    public DocumentsAdministratifs(int id, String Libelle, Date DateValiditer) {
        this.id = id;
        this.Libelle = Libelle;
        this.DateValiditer = DateValiditer;
    }

    public DocumentsAdministratifs() {
    }
    
}
