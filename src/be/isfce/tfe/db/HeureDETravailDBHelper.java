/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.HeureDeTravail;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yema
 */
public class HeureDETravailDBHelper {
       private static  HeureDETravailDBHelper  uniqueInstance = new  HeureDETravailDBHelper ();
    public static  HeureDETravailDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addHeureDeTravail( HeureDeTravail horaire){
        try{
             Date dateSql = new Date(horaire.getDateTravail().getTime());
            System.out.println(horaire.toString());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into heuredetravail (idheuredetravail,heurededebut,heuredefin,datetravail) values( ?, ?, ?,?)");
            preparedStatement.setInt(1, horaire.getIdheuredetravail());
            preparedStatement.setString(2, horaire.getHeureDeDebut());
            preparedStatement.setString(3, horaire.getHeureDeFin());
            preparedStatement.setDate(4,dateSql);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
    }
      public static List<HeureDeTravail> selectHeureDeTravail(){
        try{
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from heuredetravail");
           
           ResultSet resultSet = preparedStatement.executeQuery();
            List<HeureDeTravail> allHeureDeTravail = new ArrayList<HeureDeTravail>();
            while(resultSet.next()){
                HeureDeTravail heure = new HeureDeTravail();
                heure.setIdheuredetravail(resultSet.getInt("idheuredetravail"));
                heure.setHeureDeDebut(resultSet.getString("heurededebut"));
                heure.setHeureDeFin(resultSet.getString("heuredefin"));
                heure.setDateTravail(resultSet.getDate("datetravail"));
                heure.setLeschauffeurs(selectListeChauffeurPourHeureDeTravail(heure.getIdheuredetravail()));
                allHeureDeTravail.add(heure);
            }
            System.out.println(allHeureDeTravail);
            return allHeureDeTravail;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
      }
      
         public static List<Chauffeur> selectListeChauffeurPourHeureDeTravail(int heureDeTravailId) {

        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from atravailler join chauffeur on atravailler.idchauffeur = chauffeur.idchauffeur where idheuredetravail = ? ");
             preparedStatement.setInt(1, heureDeTravailId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Chauffeur> allChauffeurs = new ArrayList<Chauffeur>();
            while(resultSet.next()){
                Chauffeur chauffeur = new Chauffeur();
                chauffeur.setId(resultSet.getString("idchauffeur"));
                chauffeur.setNomChauffeur(resultSet.getString("nom"));
                chauffeur.setPrenomChauffeur(resultSet.getString("prenom"));
                chauffeur.setDateNaissance(resultSet.getDate("datenaissance"));
                chauffeur.setAdresse(resultSet.getString("adresse"));
                chauffeur.setCodepostale(resultSet.getInt("codepostal"));
                chauffeur.setVille(resultSet.getString("ville"));
                chauffeur.setNumTelephone(resultSet.getInt("numtelephone"));
                chauffeur.setEmail(resultSet.getString("email"));
                chauffeur.setSelectionMedicale(resultSet.getDate("selectionmedicale"));
                chauffeur.setValiditercartechauffeur(resultSet.getDate("validitercartechauffeur"));
                chauffeur.setValiditercap(resultSet.getDate("validitercap"));
                allChauffeurs.add(chauffeur);
                
                }
           // System.out.println(allChauffeurs);
            return allChauffeurs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
     public static boolean deleteHeureDeTravail( HeureDeTravail horaire){
        try{
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from heuredetravail");
           
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
     }
}
