/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.metier;

/**
 *
 * @author yema
 */
public class Eleve {

    private long id;
    private String nomeleve;
    private String prenomeleve;
    private String adresseeleve;
    private int cdpostal;
    private String vil;
    private String nomresponsable;
    private int telresponsable;
    private String emailresponsable;
    private Ecole coordonnee;
    private Circuit empreinter;

    public void setId(long id) {
        this.id = id;
    }

    public void setNomEleve(String NomEleve) {
        this.nomeleve = NomEleve;
    }

    public void setPrenomEleve(String PrenomEleve) {
        this.prenomeleve = PrenomEleve;
    }

    public void setAdresseEleve(String AdresseEleve) {
        this.adresseeleve = AdresseEleve;
    }

    public void setNomResponsable(String NomResponsable) {
        this.nomresponsable = NomResponsable;
    }

    public void setTelResponsable(int TelResponsable) {
        this.telresponsable = TelResponsable;
    }

    public void setEmailResponsable(String EmailResponsable) {
        this.emailresponsable = EmailResponsable;
    }

    public void setCoordonnee(Ecole Coordonnee) {
        this.coordonnee = Coordonnee;
    }

    public void setEmpreinter(Circuit Empreinter) {
        this.empreinter = Empreinter;
    }

    public long getId() {
        return id;
    }

    public String getNomEleve() {
        return nomeleve;
    }

    public String getPrenomEleve() {
        return prenomeleve;
    }

    public String getAdresseEleve() {
        return adresseeleve;
    }

    public int getCdpostal() {
        return cdpostal;
    }

    public void setCdpostal(int cdpostal) {
        this.cdpostal = cdpostal;
    }

    public void setVil(String vil) {
        this.vil = vil;
    }

    public String getVil() {
        return vil;
    }

    public String getNomResponsable() {
        return nomresponsable;
    }

    public int getTelResponsable() {
        return telresponsable;
    }

    public String getEmailResponsable() {
        return emailresponsable;
    }

    public Ecole getCoordonnee() {
        return coordonnee;
    }

    public Circuit getEmpreinter() {
        return empreinter;

    }
}
