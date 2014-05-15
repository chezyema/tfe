/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.Entretien;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yema
 */
public class EntretienDBHelper {
    
        private static  EntretienDBHelper  uniqueInstance = new  EntretienDBHelper ();
        public static  EntretienDBHelper  getInstance() {
        return uniqueInstance;
    }

    public static boolean addEntretien(Entretien entretien ){
        try{
 
             Date dateSql  = new Date(entretien.getDateEntretien().getTime());
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into entretien (identretien,description,kmentretienfait,dateentretien,id) values (? , ?, ?,?,?)");
            preparedStatement.setInt(1, entretien.getId());
            preparedStatement.setString(2, entretien.getDescription());
            preparedStatement.setInt(3, entretien.getKmEntretienFait());
            preparedStatement.setDate(4,dateSql);
            preparedStatement.setString(5, "12345678901");
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
        
        }
   
    }
     public static List<Entretien> selectEntretien(){
        try{
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from entretien");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Entretien> allEntretien = new ArrayList<Entretien>();
            while(resultSet.next()){
                Entretien entretien = new Entretien();
                entretien.setId(resultSet.getInt("identretien"));
                entretien.setDescription(resultSet.getString("description"));
                entretien.setKmEntretienFait(resultSet.getInt("kmentretienfait"));
                entretien.setDateEntretien(resultSet.getDate("dateentretien"));
                entretien.setIdmaterielroulant(resultSet.getString("id"));
                
                allEntretien.add(entretien);
            }
            System.out.println(allEntretien);
            return allEntretien;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
}
     
       public static boolean deleteEntretien(int identretien ){
        try{
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from entretien where entretien.identretien = ?");
              preparedStatement.setInt(1, identretien);
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        
              }
         }
    
    
}
