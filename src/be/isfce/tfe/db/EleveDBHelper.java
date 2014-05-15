/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Eleve;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
            preparedStatement.setString(9, eleve.getTelResponsable());
            preparedStatement.setString(10, eleve.getEmailResponsable());
                 
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

public static List<Eleve> selectEleve(){
    
    
    try{
          PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from eleve");
         ResultSet resultSet = preparedStatement.executeQuery();
            List<Eleve> allEleve = new ArrayList<Eleve>();
            while(resultSet.next()){
                Eleve eleve = new Eleve();
                eleve.setId(resultSet.getString("ideleve"));
                eleve.setNomEleve(resultSet.getString("nomeleve"));
                eleve.setPrenomEleve(resultSet.getString("prenomeleve"));
                eleve.setDatedenaissance(resultSet.getDate("datedenaissance"));
                eleve.setAdresseEleve(resultSet.getString("adresseeleve"));
                eleve.setCdpostal(resultSet.getInt("codepostal"));
                eleve.setVil(resultSet.getString("ville"));
                eleve.setNomResponsable(resultSet.getString("nomresponsable"));
                eleve.setTelResponsable(resultSet.getString("telresponsable"));
                eleve.setEmailResponsable(resultSet.getString("emailresponsable"));
                eleve.setIdcircuit(resultSet.getInt("idcircuit"));
                eleve.setIdecole(resultSet.getInt("idecole"));
                allEleve.add(eleve);
                
                }
            System.out.println(allEleve);
            return allEleve;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public static boolean deleteEleve(String ideleve){
    
    
    try{
          PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from eleve where eleve.ideleve = ?");
          preparedStatement.setString(1, ideleve);  
                    
          preparedStatement.execute();
          Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    
    
     }
}


