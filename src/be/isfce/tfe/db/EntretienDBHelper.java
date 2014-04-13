/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Entretien;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class EntretienDBHelper {
    
        private static  EntretienDBHelper  uniqueInstance = new  EntretienDBHelper ();
        public static  EntretienDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addEntretien(Entretien entretien ){
        try{
 
             Date dateSql  = new Date(entretien.getDateEntretien().getTime());
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into entretien (identretien,description,kmentretienfait,dateentretien,id) values (? , ?, ?,?,?)");
            preparedStatement.setInt(1, entretien.getId());
            preparedStatement.setString(2, entretien.getDescription());
            preparedStatement.setInt(3, entretien.getKmEntretienFait());
            preparedStatement.setDate(4,dateSql);
            preparedStatement.setString(5, "12345678901");
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
     public static boolean selectEntretien(Entretien entretien ){
        try{
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from entretien");
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
    
}
