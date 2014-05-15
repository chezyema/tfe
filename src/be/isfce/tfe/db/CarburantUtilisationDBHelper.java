/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.CarburantUtilisation;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class CarburantUtilisationDBHelper {

    private static CarburantUtilisationDBHelper uniqueInstance = new CarburantUtilisationDBHelper();

    public static CarburantUtilisationDBHelper getInstance() {
        return uniqueInstance;
    }

    public static boolean addCarburantUtilisation(CarburantUtilisation carburantutilisation) {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into carburant_utilisation (idutilisation,idcarte) values (? , ?)");
            preparedStatement.setInt(1, carburantutilisation.getIdUtilisation());
            preparedStatement.setInt(2, carburantutilisation.getIdcarte());

            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;


        }

    }

    public static boolean selectCarburantUtilisation(CarburantUtilisation carburantutilisation) {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from carburant_utilisation");
            
            preparedStatement.execute();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
      public static boolean deleteCarburantUtilisation(int idcarburantutilisation) {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from carburant_utilisation where carburant_utilisation.idutilisation = ?");
            preparedStatement.setInt(1,idcarburantutilisation);
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
