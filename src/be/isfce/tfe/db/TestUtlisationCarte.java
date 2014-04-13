/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.UtilisationCarte;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class TestUtlisationCarte {

    private static TestUtlisationCarte uniqueInstance = new TestUtlisationCarte();

    public static TestUtlisationCarte getInstance() {
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
    
    
   /*  public static boolean selectUtilisationCarte(UtilisationCarte carte) {
        try {
            System.out.println(carte.toString());
            Date dateSql = new Date(carte.getDateUtilisation().getTime());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from utilisationcarte");
            preparedStatement.setInt(1, carte.getIdutilisationcarte());
            preparedStatement.setDate(2, dateSql);
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }*/
}
