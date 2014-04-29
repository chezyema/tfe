/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Ecole;
import be.isfce.tfe.metier.Eleve;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author yema
 */
public class EcoleDBHelper {
    private static EcoleDBHelper  uniqueInstance = new EcoleDBHelper ();

    public static EcoleDBHelper  getInstance() {
        return uniqueInstance;
    
}

public static boolean addEcole(Ecole ecole){
    
    
    try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into ecole (idecole,nomecole,adresseecole,cdpostal,vil,telecole,emailecole,nomdirecteur,anneescolaire) VALUES (? , ?, ?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,ecole.getId());
            preparedStatement.setString(2, ecole.getNomecole());
            preparedStatement.setString(3, ecole.getAdresseecole());
            preparedStatement.setInt(4, ecole.getCdpostal());
            preparedStatement.setString(5, ecole.getVil());
            preparedStatement.setInt(6, ecole.getTelecole());
            preparedStatement.setString(7, ecole.getEmailecole());
            preparedStatement.setString(8, ecole.getNomdirecteur());
            preparedStatement.setString(9, ecole.getAnneescolaire());
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    
    
   }

public static List<Ecole> selectEcole(){
    
    try{
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from ecole");
            
            List<Ecole> allEcole = new ArrayList<Ecole>();
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Ecole ecole = new Ecole();
                ecole.setId(resultSet.getInt("idecole"));
                ecole.setNomecole(resultSet.getString("nomecole"));
                ecole.setAdresseecole(resultSet.getString("adresseecole"));
                ecole.setCdpostal(resultSet.getInt("cdpostal"));
                ecole.setVil(resultSet.getString("vil"));
                ecole.setTelecole(resultSet.getInt("telecole"));
                ecole.setEmailecole(resultSet.getString("emailecole"));
                ecole.setNomdirecteur(resultSet.getString("nomdirecteur"));
                ecole.setAnneescolaire(resultSet.getString("anneescolaire"));
                
                allEcole.add(ecole);
                
                }
            System.out.println(allEcole);
            return allEcole;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public static List<Eleve> selectListeEleve(){
    
    
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
                eleve.setTelResponsable(resultSet.getInt("telresponsable"));
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


public static boolean deleteEcole(Ecole ecole){
    
    try{
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from ecole");
            
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    
    
    
 }
}


