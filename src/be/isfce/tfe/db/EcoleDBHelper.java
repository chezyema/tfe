/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Ecole;
import java.sql.PreparedStatement;



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

public static boolean selectEcole(Ecole ecole){
    
    
    try{
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from ecole");
            
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    
    
    
 }
}


