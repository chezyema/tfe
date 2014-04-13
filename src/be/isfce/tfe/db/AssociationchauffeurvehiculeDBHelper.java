/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;


import java.sql.PreparedStatement;
import be.isfce.tfe.metier.MaterielUtiliser;

/**
 *
 * @author yema
 */
public class AssociationchauffeurvehiculeDBHelper {
    
     private static  AssociationchauffeurvehiculeDBHelper  uniqueInstance = new  AssociationchauffeurvehiculeDBHelper ();
        public static  AssociationchauffeurvehiculeDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addMaterielUtiliser( MaterielUtiliser materiel ){
        try{
 
            
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into utiliser (idchauffeur,id) values (? , ?)");
            preparedStatement.setLong(1,materiel.getIdchauffeur() );
            preparedStatement.setString(2,materiel.getId());
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
    
     public static boolean selectMaterielUtiliser(MaterielUtiliser materiel) {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from utiliser");
            preparedStatement.setLong(1, materiel.getIdchauffeur());
            preparedStatement.setString(2, materiel.getId());
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
}
}
