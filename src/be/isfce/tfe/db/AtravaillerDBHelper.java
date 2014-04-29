/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Atravailler;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class AtravaillerDBHelper {
    
      private static  AtravaillerDBHelper  uniqueInstance = new AtravaillerDBHelper ();
        public static  AtravaillerDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addAtravailler(Atravailler heuredetravail ){
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into atravailler (idheuredetravail,idchauffeur) values (? , ?)");
            preparedStatement.setInt(1,heuredetravail.getIdheuredetravail());
            preparedStatement.setLong(2,heuredetravail.getIdchauffeur() );
            
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
       public static boolean selectAtravailler(Atravailler heuredetravail ){
        try{
               PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select*from atravailler");
          
               preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
       
      public static boolean deleteAtravailler(Atravailler heuredetravail ){
        try{
               PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from atravailler");
          
               preparedStatement.execute();
               Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
    
}
