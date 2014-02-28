/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yema
 */
@DatabaseTable(tableName="Circuit")
public class Circuit {
    @DatabaseField(columnName="id",id=true)
    private int id;
    @DatabaseField
    private String NomCircuit;
    @DatabaseField
    private String TempsPrevu;
    @DatabaseField
    private int KmDepart;
    @DatabaseField
    private int KmFin;
    @DatabaseField
    private  ArrayList <Arret> LesArrets; 
    

    public Circuit() {
    }

    public Circuit(int id, String NomCircuit, String TempsPrevu, int KmDepart, int KmFin, Date DateCircuit) {
        this.id = id;
        this.NomCircuit = NomCircuit;
        this.TempsPrevu = TempsPrevu;
        this.KmDepart = KmDepart;
        this.KmFin = KmFin;
        this.DateCircuit = DateCircuit;
    }

    public int getId() {
        return id;
    }

    public String getNomCircuit() {
        return NomCircuit;
    }

    public String getTempsPrevu() {
        return TempsPrevu;
    }

    public int getKmDepart() {
        return KmDepart;
    }

    public int getKmFin() {
        return KmFin;
    }

    public Date getDateCircuit() {
        return DateCircuit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomCircuit(String NomCircuit) {
        this.NomCircuit = NomCircuit;
    }

    public void setTempsPrevu(String TempsPrevu) {
        this.TempsPrevu = TempsPrevu;
    }

    public void setKmDepart(int KmDepart) {
        this.KmDepart = KmDepart;
    }

    public void setKmFin(int KmFin) {
        this.KmFin = KmFin;
    }

    public void setDateCircuit(Date DateCircuit) {
        this.DateCircuit = DateCircuit;
    }
    @DatabaseField
    private Date DateCircuit;
    
}
