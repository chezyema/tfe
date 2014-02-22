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
@DatabaseTable(tableName="MaterielRoulant")
public class MaterielRoulant {
    @DatabaseField(columnName="id",id=true)
    private int id;
    @DatabaseField
    private String Marque;
    @DatabaseField
    private String Type;
    @DatabaseField
    private String Carburant;
    @DatabaseField
    private String NumImmatr;
    @DatabaseField 
    private int NbDePlaces;

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String Marque) {
        this.Marque = Marque;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setCarburant(String Carburant) {
        this.Carburant = Carburant;
    }

    public void setNumImmatr(String NumImmatr) {
        this.NumImmatr = NumImmatr;
    }

    public void setNbDePlaces(int NbDePlaces) {
        this.NbDePlaces = NbDePlaces;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return Marque;
    }

    public String getType() {
        return Type;
    }

    public String getCarburant() {
        return Carburant;
    }

    public String getNumImmatr() {
        return NumImmatr;
    }

    public int getNbDePlaces() {
        return NbDePlaces;
    }

    public MaterielRoulant(int id, String Marque, String Type, String Carburant, String NumImmatr, int NbDePlaces) {
        this.id = id;
        this.Marque = Marque;
        this.Type = Type;
        this.Carburant = Carburant;
        this.NumImmatr = NumImmatr;
        this.NbDePlaces = NbDePlaces;
    }

    public MaterielRoulant() {
    }
    
}
