/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.EstEffectuer;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class EstEffectuerDBHelper {
    
     private static EstEffectuerDBHelper uniqueInstance = new  EstEffectuerDBHelper ();
        public static EstEffectuerDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addEstEffectuer(EstEffectuer esteffectuer ){
        try{
 
            
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into esteffectuer (idchauffeur,idcircuit) values (? , ?)");
            preparedStatement.setLong(1,esteffectuer.getIdchauffeur());
            preparedStatement.setInt(2,esteffectuer.getIdcircuit());
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
     public static boolean selectEstEffectuer(EstEffectuer esteffectuer ){
        try{ 
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from esteffectuer");
            
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
     
      public static boolean deleteEstEffectuer(String idesteffectuer ){
        try{ 
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from esteffectuer where esteffectuer.idchauffeur = ?");
            preparedStatement.setString(1,idesteffectuer );
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
}
    
    
    

