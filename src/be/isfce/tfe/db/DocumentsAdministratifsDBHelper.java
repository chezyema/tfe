/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;


import be.isfce.tfe.metier.DocumentsAdministratifs;
import java.sql.Date;
import java.sql.PreparedStatement;
/**
 *
 * @author yema
 */

public class DocumentsAdministratifsDBHelper {
      private static  DocumentsAdministratifsDBHelper uniqueInstance = new  DocumentsAdministratifsDBHelper();

    public static  DocumentsAdministratifsDBHelper  getInstance() {
        return uniqueInstance;
    }

  public static boolean addDocumentsAdministratifs(DocumentsAdministratifs documents){
        
        try{
            Date dateSql = new Date(documents.getDateValiditer().getTime());
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into documentsadministratifs (iddocument,libelle,datevaliditer,id,idchauffeur) VALUES(? , ?, ?,?,?)");
           
            preparedStatement.setInt(1, documents.getId());
            preparedStatement.setString(2, documents.getLibelle());
            preparedStatement.setDate (3, dateSql);
            preparedStatement.setString(4,documents.getIdmaterielroulant());
            preparedStatement.setLong(5,documents.getIdchauffeur());
            //ajouter les clés étrangére
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
    
}
   public static boolean selectDocumentsAdministratifs(DocumentsAdministratifs documents){
        
        try{
            
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from documentsadministratifs");
           
           preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
    
}  
}
