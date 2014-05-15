/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;


import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.DocumentsAdministratifs;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
            preparedStatement.setString(5,documents.getIdchauffeur());
            //ajouter les clés étrangére
            
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
    
}
    public static List<DocumentsAdministratifs> selectDocuments(){
        
        try{
            
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from documentsadministratifs");
           
           ResultSet resultSet = preparedStatement.executeQuery();
            List<DocumentsAdministratifs> allDocuments = new ArrayList<DocumentsAdministratifs>();
            while(resultSet.next()){
                DocumentsAdministratifs documents = new DocumentsAdministratifs();
                documents.setId(resultSet.getInt("iddocument"));
                documents.setLibelle(resultSet.getString("libelle"));
                documents.setDateValiditer(resultSet.getDate("datevaliditer"));
                documents.setIdmaterielroulant(resultSet.getString("id"));
                documents.setIdchauffeur(resultSet.getString("idchauffeur"));
                
                allDocuments.add(documents);
            }
            System.out.println(allDocuments);
            return allDocuments;
                
                
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
    
}  
    
    
    
   public static boolean deleteDocumentsAdministratifs(int iddocuments){
        
        try{
            
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from documentsadministratifs where documentsadministratifs.iddocument = ?");
           preparedStatement.setInt(1, iddocuments);
           preparedStatement.execute();
           Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
    
}  
}
