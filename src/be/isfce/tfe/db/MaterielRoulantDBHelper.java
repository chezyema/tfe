/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.MaterielRoulant;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author yema
 */
public class MaterielRoulantDBHelper  {
    
    
    
        private static MaterielRoulantDBHelper  uniqueInstance = new MaterielRoulantDBHelper ();

    public static MaterielRoulantDBHelper  getInstance() {
        return uniqueInstance;
    }

    
    
    
    
    
    
    public static boolean addMaterielRoulant(MaterielRoulant vehicule){
        
        try{
             Date dateSql  = new Date(vehicule.getAnneedeconstruction().getTime());
             Date dateSqla  = new Date(vehicule.getDateexctincteur().getTime());
             



           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into materielroulant (id,marque,type,anneedeconstruction,carburant,numimmatr,nbdeplaces,kmactuel,validiterexctincteur) VALUES (? , ?, ?,?,?,?,?,?,?)");
            preparedStatement.setString(1, vehicule.getId());
                    
            preparedStatement.setString(2, vehicule.getMarque());
            preparedStatement.setString(3, vehicule.getType());
            preparedStatement.setDate(4, dateSql);
            preparedStatement.setString(5,vehicule.getCarburant());
            preparedStatement.setString(6, vehicule.getNumImmatr());
            preparedStatement.setInt(7, vehicule.getNbDePlaces());
            preparedStatement.setInt(8, vehicule.getKmactuel());
            preparedStatement.setDate(9, dateSqla);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
     public static boolean selectMaterielRoulant(MaterielRoulant vehicule){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from materielroulant");
           
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
