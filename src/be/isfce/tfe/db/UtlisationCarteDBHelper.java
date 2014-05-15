/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.CarteCarburant;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.MaterielRoulant;
import be.isfce.tfe.metier.UtilisationCarte;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yema
 */
public class UtlisationCarteDBHelper {

    private static UtlisationCarteDBHelper uniqueInstance = new UtlisationCarteDBHelper();

    public static UtlisationCarteDBHelper getInstance() {
        return uniqueInstance;
    }

    public static boolean addUtilisationCarte(UtilisationCarte carte) {
        try {
            System.out.println(carte.toString());
            Date dateSql = new Date(carte.getDateUtilisation().getTime());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into utilisationcarte (idutilisation,dateutilisation) values (? , ?)");
            preparedStatement.setInt(1, carte.getIdutilisationcarte());
            preparedStatement.setDate(2, dateSql);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
     public static List<UtilisationCarte> selectUtilisationCarte(){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from utilisationcarte");
           
            ResultSet resultSet = preparedStatement.executeQuery();
            List<UtilisationCarte> allUtilisationCarte = new ArrayList<UtilisationCarte>();
            while(resultSet.next()){
                UtilisationCarte heure = new UtilisationCarte();
                heure.setIdutilisationcarte(resultSet.getInt("idutilisation"));
                heure.setDateutilisation(resultSet.getDate("dateutilisation"));
                heure.setIdvehicule(resultSet.getString("id"));
                heure.setIdcartecarburant(resultSet.getInt("idcarte"));
                
                allUtilisationCarte.add(heure);
            }
            System.out.println(allUtilisationCarte);
            return allUtilisationCarte;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
}
     
    
       public static boolean deleteUtilisationCarte(int idutilisation) {
        try {
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from utilisationcarte where utilisationcarte.idutilisation = ?");
             preparedStatement.setInt(1, idutilisation);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
