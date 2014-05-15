/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Trajets;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yema
 */
public class TrajetsDBHELPER {
       private static  TrajetsDBHELPER  uniqueInstance = new  TrajetsDBHELPER ();
    public static  TrajetsDBHELPER  getInstance() {
        return uniqueInstance;
    }

    public static boolean addTrajets( Trajets horaire){
        try{
             Date dateSql = new Date(horaire.getDateTravail().getTime());
            System.out.println(horaire.toString());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into trajets (idtrajets,heurededebut,heuredefin,datetravail,idchauffeur,idcircuit,id) values( ?, ?, ?,?,?,?,?)");
            preparedStatement.setInt(1, horaire.getIdtrajets());
            preparedStatement.setString(2, horaire.getHeureDeDebut());
            preparedStatement.setString(3, horaire.getHeureDeFin());
            preparedStatement.setDate(4,dateSql);
            preparedStatement.setString(5, horaire.getIdchauffeur());
            preparedStatement.setInt(6, horaire.getIdcircuit());
            preparedStatement.setString(7, horaire.getIdmaterielroulant());
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
    }
      public static List<Trajets> selectTrajets(boolean trajetsSupprimes){
        try{
            String supprimestrajet = trajetsSupprimes ? "1" : "0"; 
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from trajets where supprimetrajets = " + supprimestrajet);
           
           ResultSet resultSet = preparedStatement.executeQuery();
            List<Trajets> allTrajets = new ArrayList<Trajets>();
            while(resultSet.next()){
                Trajets heure = new Trajets();
                heure.setIdtrajets(resultSet.getInt("idtrajets"));
                heure.setHeureDeDebut(resultSet.getString("heurededebut"));
                heure.setHeureDeFin(resultSet.getString("heuredefin"));
                heure.setDateTravail(resultSet.getDate("datetravail"));
                heure.setIdchauffeur(resultSet.getString("idchauffeur"));
                heure.setIdcircuit(resultSet.getInt("idcircuit"));
                heure.setIdmaterielroulant(resultSet.getString("id"));
                allTrajets.add(heure);
            }
            System.out.println(allTrajets);
            return allTrajets;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
      }
      
        
          
    
    
     public static boolean deleteTrajets(Trajets idtrajets){
        try{
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("update trajets set supprimetrajets = 1 where trajets.idtrajets = ?");
            preparedStatement.setInt(1,idtrajets.getIdtrajets());
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
     }
}
