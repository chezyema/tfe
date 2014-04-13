/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.HeureDeTravail;
import java.sql.PreparedStatement;

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
            System.out.println(horaire.toString());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into heuredetravail (idheuredetravail,heurededebut,heuredefin) values( ?, ?, ?)");
            preparedStatement.setInt(1, horaire.getIdheuredetravail());
            preparedStatement.setString(2, horaire.getHeureDeDebut());
            preparedStatement.setString(3, horaire.getHeureDeFin());
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
    }
   /*  public static boolean selectHeureDeTravail( HeureDeTravail horaire){
        try{
            System.out.println(horaire.toString());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from heuredetravail");
            preparedStatement.setInt(1, horaire.getIdheuredetravail());
            preparedStatement.setString(2, horaire.getHeureDeDebut());
            preparedStatement.setString(3, horaire.getHeureDeFin());
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
     }*/
}
