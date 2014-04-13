/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Chauffeur;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author yema
 */
public class ChauffeurDBHelper {
    
    
    
        private static ChauffeurDBHelper  uniqueInstance = new ChauffeurDBHelper ();

    public static ChauffeurDBHelper  getInstance() {
        return uniqueInstance;
    }

    
    
    
    
    
    
    public static boolean addChauffeur(Chauffeur chauffeur){
        
        try{
             Date dateSql  = new Date(chauffeur.getDateNaissance().getTime());
             Date dateSqla = new Date(chauffeur.getSelectionmedicale().getTime()); 
             Date dateSqlb = new Date(chauffeur.getValiditercartechauffeur().getTime());
             Date dateSqlc = new Date(chauffeur.getValiditercap().getTime()); 



           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into chauffeur (idchauffeur,nom,prenom,datenaissance,adresse,codepostal,ville,numtelephone,email,selectionmedicale,validitercartechauffeur,validitercap) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setLong(1, chauffeur.getId());
                    
            preparedStatement.setString(2, chauffeur.getNomChauffeur());
            preparedStatement.setString(3, chauffeur.getPrenomChauffeur());
            preparedStatement.setDate(4, dateSql);
            preparedStatement.setString(5, chauffeur.getAdresse());
            preparedStatement.setInt(6, chauffeur.getCodepostale());
            preparedStatement.setString(7, chauffeur.getVille());
            preparedStatement.setInt(8, chauffeur.getNumTelephone());
            preparedStatement.setString(9, chauffeur.getEmail());
            preparedStatement.setDate(10, dateSqla);
            preparedStatement.setDate(11, dateSqlb);
            preparedStatement.setDate(12, dateSqlc);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean selectChauffeur(Chauffeur chauffeur){
        
        try{
             



           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from chauffeur");
           
                    
            
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
     
}
