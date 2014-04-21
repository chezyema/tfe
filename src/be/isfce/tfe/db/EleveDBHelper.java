/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Eleve;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class EleveDBHelper {
    private static EleveDBHelper  uniqueInstance = new EleveDBHelper ();

    public static EleveDBHelper  getInstance() {
        return uniqueInstance;
    
}

public static boolean addEleve(Eleve eleve){
    
    
    try{
             Date dateSql  = new Date(eleve.getDatedenaissance().getTime());



            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into eleve (ideleve,nomeleve,prenomeleve,datedenaissance,adresseeleve,codepostal,ville,nomresponsable,telresponsable,emailresponsable) VALUES (? , ?, ?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,eleve.getId());
            preparedStatement.setString(2, eleve.getNomEleve());
            preparedStatement.setString(3, eleve.getPrenomEleve());
            preparedStatement.setDate(4,dateSql);
            preparedStatement.setString(5, eleve.getAdresseEleve());
            preparedStatement.setInt(6, eleve.getCdpostal());
            preparedStatement.setString(7, eleve.getVil());
            preparedStatement.setString(8, eleve.getNomResponsable());
            preparedStatement.setInt(9, eleve.getTelResponsable());
            preparedStatement.setString(10, eleve.getEmailResponsable());
                 
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

public static boolean selectEleve(Eleve eleve){
    
    
    try{
          PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from eleve");
            
                    
          preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    
    
     }
}


