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
@DatabaseTable(tableName="CarteUtilisation")
public class UtilisationCarte {
    
     @DatabaseField
     private Date DateUtilisation;

    public Date getDateUtilisation() {
        return DateUtilisation;
    }

    public void setDateUtilisation(Date DateUtilisation) {
        this.DateUtilisation = DateUtilisation;
    }

    public UtilisationCarte(Date DateUtilisation) {
        this.DateUtilisation = DateUtilisation;
    }

    public UtilisationCarte() {
    }
    
}
