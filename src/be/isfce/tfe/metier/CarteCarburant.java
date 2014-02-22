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
@DatabaseTable(tableName="CarteCarburant")
public class CarteCarburant {
     @DatabaseField(columnName="id",id=true)
    private int id;
     @DatabaseField
    private int KmUtilisation;
     @DatabaseField
    private int  LitreCarburant;

    public void setId(int id) {
        this.id = id;
    }

    public void setKmUtilisation(int KmUtilisation) {
        this.KmUtilisation = KmUtilisation;
    }

    public void setLitreCarburant(int LitreCarburant) {
        this.LitreCarburant = LitreCarburant;
    }

    public int getId() {
        return id;
    }

    public int getKmUtilisation() {
        return KmUtilisation;
    }

    public int getLitreCarburant() {
        return LitreCarburant;
    }

    public CarteCarburant(int id, int KmUtilisation, int LitreCarburant) {
        this.id = id;
        this.KmUtilisation = KmUtilisation;
        this.LitreCarburant = LitreCarburant;
    }

    public CarteCarburant() {
    }
    
}
