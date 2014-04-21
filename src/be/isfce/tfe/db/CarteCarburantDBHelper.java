/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.isfce.tfe.db;


import be.isfce.tfe.metier.CarteCarburant;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class CarteCarburantDBHelper {
    
        private static  CarteCarburantDBHelper  uniqueInstance = new  CarteCarburantDBHelper ();
        public static  CarteCarburantDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addCarteCarburant( CarteCarburant cartecarburant ){
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into cartecarburant (idcarte,kmutilisation,litrecarburant) values (? , ?, ?)");
            preparedStatement.setInt(1, cartecarburant.getId());
            preparedStatement.setInt(2, cartecarburant.getKmUtilisation());
            preparedStatement.setInt(3, cartecarburant.getLitreCarburant());
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
      public static boolean selectCarteCarburant( CarteCarburant cartecarburant ){
       try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from cartecarburant");
          
            preparedStatement.execute();
            
           return true;
       } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }     
    
}
