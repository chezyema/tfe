/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be.isfce.tfe.db;



import be.isfce.tfe.metier.CarteCarburant;
import be.isfce.tfe.metier.UtilisationCarte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
      public static List<CarteCarburant> selectCarteCarburant(){
       try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from cartecarburant");
          
           ResultSet resultSet = preparedStatement.executeQuery();
            List<CarteCarburant> allCarteCarburant = new ArrayList<CarteCarburant>();
            while(resultSet.next()){
                CarteCarburant cartecarburant = new CarteCarburant();
                cartecarburant.setId(resultSet.getInt("idcarte"));
                cartecarburant.setKmUtilisation(resultSet.getInt("kmutilisation"));
                cartecarburant.setLitreCarburant(resultSet.getInt("litrecarburant"));
                cartecarburant.setLesUtilisations(selectListeUtilisationCartePourCarteCarburant(cartecarburant.getId()));
                allCarteCarburant.add(cartecarburant);
            }
             System.out.println(allCarteCarburant);
             return allCarteCarburant;
       }
            catch (Exception e){
            e.printStackTrace();
            return null;
        
        
        }
   
    }
      
       public static List<UtilisationCarte> selectListeUtilisationCartePourCarteCarburant(int carteCarburantId){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from carburant_utilisation join utilisationcarte on carburant_utilisation.idutilisation = utilisationcarte.idutilisation where idcarte = ?");
            preparedStatement.setInt(1, carteCarburantId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<UtilisationCarte> allUtilisationCarte = new ArrayList<UtilisationCarte>();
            while(resultSet.next()){
                UtilisationCarte heure = new UtilisationCarte();
                heure.setIdutilisationcarte(resultSet.getInt("idutilisation"));
                heure.setDateutilisation(resultSet.getDate("dateutilisation"));
                
                
                allUtilisationCarte.add(heure);
            }
            //System.out.println(allUtilisationCarte);
            return allUtilisationCarte;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
}
         public static boolean deleteCarteCarburant( CarteCarburant cartecarburant ){
       try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from cartecarburant");
          
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            
           return true;
       } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
    
}
}
