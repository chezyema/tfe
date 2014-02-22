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
@DatabaseTable(tableName="Ecole")
public class Ecole {
     @DatabaseField(columnName="id",id=true)
    private int id;
      @DatabaseField
    private String NomEcole;
      @DatabaseField
    private String AdresseEcole;
      @DatabaseField
    private int TelEcole;
      @DatabaseField
    private String EmailEcole;
      @DatabaseField
         
    private String NomDirecteur;
      @DatabaseField  
    private String AnneeScolaire;

    public void setId(int id) {
        this.id = id;
    }

    public void setNomEcole(String NomEcole) {
        this.NomEcole = NomEcole;
    }

    public void setAdresseEcole(String AdresseEcole) {
        this.AdresseEcole = AdresseEcole;
    }

    public void setTelEcole(int TelEcole) {
        this.TelEcole = TelEcole;
    }

    public void setEmailEcole(String EmailEcole) {
        this.EmailEcole = EmailEcole;
    }

    public void setNomDirecteur(String NomDirecteur) {
        this.NomDirecteur = NomDirecteur;
    }

    public void setAnneeScolaire(String AnneeScolaire) {
        this.AnneeScolaire = AnneeScolaire;
    }

    public int getId() {
        return id;
    }

    public String getNomEcole() {
        return NomEcole;
    }

    public String getAdresseEcole() {
        return AdresseEcole;
    }

    public int getTelEcole() {
        return TelEcole;
    }

    public String getEmailEcole() {
        return EmailEcole;
    }

    public String getNomDirecteur() {
        return NomDirecteur;
    }

    public String getAnneeScolaire() {
        return AnneeScolaire;
    }

    public Ecole(int id, String NomEcole, String AdresseEcole, int TelEcole, String EmailEcole, String NomDirecteur, String AnneeScolaire) {
        this.id = id;
        this.NomEcole = NomEcole;
        this.AdresseEcole = AdresseEcole;
        this.TelEcole = TelEcole;
        this.EmailEcole = EmailEcole;
        this.NomDirecteur = NomDirecteur;
        this.AnneeScolaire = AnneeScolaire;
    }

    public Ecole() {
    }
    
}
