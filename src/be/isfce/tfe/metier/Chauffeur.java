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
@DatabaseTable(tableName="Chauffeur")
public class Chauffeur {

    public Chauffeur() {
    }

    public Chauffeur(int id, String NomChauffeur, String PrenomChauffeur, String Adresse, Date DateNaissance, int NumTelephone, String Email,Date SelectionMedicale) {
        this.id = id;
        this.NomChauffeur = NomChauffeur;
        this.PrenomChauffeur = PrenomChauffeur;
        this.Adresse = Adresse;
        this.DateNaissance = DateNaissance;
        this.NumTelephone = NumTelephone;
        this.Email = Email;
        this.SelectionMedicale = SelectionMedicale;
    }

    public int getId() {
        return id;
    }

    public String getNomChauffeur() {
        return NomChauffeur;
    }

    public String getPrenomChauffeur() {
        return PrenomChauffeur;
    }

    public String getAdresse() {
        return Adresse;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public int getNumTelephone() {
        return NumTelephone;
    }

    public String getEmail() {
        return Email;
    }
    public Date getSelectionMesicale(){
        return SelectionMedicale;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomChauffeur(String NomChauffeur) {
        this.NomChauffeur = NomChauffeur;
    }

    public void setPrenomChauffeur(String PrenomChauffeur) {
        this.PrenomChauffeur = PrenomChauffeur;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setDateNaissance(Date DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public void setNumTelephone(int NumTelephone) {
        this.NumTelephone = NumTelephone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setSelectionMedicale(Date SelectionMedicale){
        this.SelectionMedicale = SelectionMedicale;
    }
    @DatabaseField(columnName="id",id=true)  
    private int id;
    @DatabaseField
    private String NomChauffeur;
    @DatabaseField
    private String PrenomChauffeur;
    @DatabaseField
    
    private String Adresse;
    @DatabaseField
    private Date DateNaissance;
    @DatabaseField
    private int NumTelephone;
    @DatabaseField
    private String Email;
    @DatabaseField
    private Date SelectionMedicale;
    
}
