/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import java.sql.PreparedStatement;
import be.isfce.tfe.metier.MrUtilisation;

/**
 *
 * @author yema
 */
public class MrutilisationDBHelper {
    
      private static MrutilisationDBHelper uniqueInstance = new  MrutilisationDBHelper ();
        public static  MrutilisationDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addMrUtilisation( MrUtilisation mrutilisation ){
        try{
 
            
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into mr_utilisation (id,idutilisation) values (? , ?)");
            preparedStatement.setString(1,mrutilisation.getId() );
            preparedStatement.setInt(2,mrutilisation.getIdutilisation());
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
       public static boolean selectMrUtilisation( MrUtilisation mrutilisation ){
        try{
 
            
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from mr_utilisation");
            preparedStatement.setString(1,mrutilisation.getId() );
            preparedStatement.setInt(2,mrutilisation.getIdutilisation());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
    
    
}
