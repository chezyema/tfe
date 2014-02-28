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
@DatabaseTable(tableName="Eleve")
public class Eleve {
      @DatabaseField(columnName="id",id=true)
    private int id;
      @DatabaseField
      
    private String NomEleve;
      @DatabaseField
    private String PrenomEleve;
      @DatabaseField
    private String AdresseEleve;
      @DatabaseField
    private String NomResponsable;
      @DatabaseField
    private int TelResponsable;
      @DatabaseField
    private String EmailResponsable;
      @DatabaseField
     private Ecole Coordonnee;
       @DatabaseField
      private Circuit Empreinter; 
      

    public void setId(int id) {
        this.id = id;
    }

    public void setNomEleve(String NomEleve) {
        this.NomEleve = NomEleve;
    }

    public void setPrenomEleve(String PrenomEleve) {
        this.PrenomEleve = PrenomEleve;
    }

    public void setAdresseEleve(String AdresseEleve) {
        this.AdresseEleve = AdresseEleve;
    }

    public void setNomResponsable(String NomResponsable) {
        this.NomResponsable = NomResponsable;
    }

    public void setTelResponsable(int TelResponsable) {
        this.TelResponsable = TelResponsable;
    }

    public void setEmailResponsable(String EmailResponsable) {
        this.EmailResponsable = EmailResponsable;
    }
    public void setCoordonnee(Ecole Coordonnee){
        this.Coordonnee = Coordonnee;
    }
    public void setEmpreinter(Circuit Empreinter){
        this.Empreinter = Empreinter;
    }

    public int getId() {
        return id;
    }

    public String getNomEleve() {
        return NomEleve;
    }

    public String getPrenomEleve() {
        return PrenomEleve;
    }

    public String getAdresseEleve() {
        return AdresseEleve;
    }

    public String getNomResponsable() {
        return NomResponsable;
    }

    public int getTelResponsable() {
        return TelResponsable;
    }

    public String getEmailResponsable() {
        return EmailResponsable;
    }
    public Ecole getCoordonnee(){
        return Coordonnee;
    }
    public Circuit getEmpreinter(){
        return Empreinter;
    
    }

    public Eleve(int id, String NomEleve, String PrenomEleve, String AdresseEleve, String NomResponsable, int TelResponsable, String EmailResponsable,Ecole Coordonnee,Circuit Empreinter) {
        this.id = id;
        this.NomEleve = NomEleve;
        this.PrenomEleve = PrenomEleve;
        this.AdresseEleve = AdresseEleve;
        this.NomResponsable = NomResponsable;
        this.TelResponsable = TelResponsable;
        this.EmailResponsable = EmailResponsable;
        this.Coordonnee = Coordonnee;
        this.Empreinter = Empreinter;
    }

    public Eleve() {
    }
    
}
