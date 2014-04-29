/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Contient;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class ContientDBHelper {
    
      private static  ContientDBHelper  uniqueInstance = new  ContientDBHelper ();
        public static  ContientDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addContient( Contient contient ){
        try{
 
            
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into contient (idcircuit,idarrets) values (? , ?)");
            preparedStatement.setInt(1,contient.getIdcircuit() );
            preparedStatement.setInt(2,contient.getIdarrets());
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
      public static boolean selectContient( Contient contient ){
        try{ PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from contient");
           
            
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
      
      public static boolean deleteContient( Contient contient ){
        try{ PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from contient");
           
            
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
    
    
    
}
