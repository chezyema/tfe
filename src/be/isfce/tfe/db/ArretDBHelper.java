/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Arret;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class ArretDBHelper {

    private static ArretDBHelper uniqueInstance = new ArretDBHelper();

    public static ArretDBHelper getInstance() {
        return uniqueInstance;
    }

    public static boolean addArret(Arret arret) {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into arrets (idarrets,adressearrets) values ( ?, ?)");
            preparedStatement.setInt(1, arret.getId());
            preparedStatement.setString(2, arret.getAdresse());
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean selectArret(Arret arret) {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select  idarrets,adressearrets from arrets");
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    } 
}

