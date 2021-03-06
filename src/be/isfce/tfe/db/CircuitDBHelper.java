/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Arret;
import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.Eleve;
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
public class CircuitDBHelper {
    
      private static CircuitDBHelper uniqueInstance = new CircuitDBHelper ();

    public static CircuitDBHelper  getInstance() {
        return uniqueInstance;
    }

    
 public static boolean addCircuit(Circuit circuit){
        
        try{
            System.out.println(circuit.toString());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into circuit (idcircuit,nomcircuit,tempsprevu,kmdepart,kmfin,idecole,id,idchauffeur) values ( ?, ?, ?, ?, ?,?,?,? )");
            preparedStatement.setInt(1, circuit.getId());
            preparedStatement.setString(2, circuit.getNomCircuit());
            preparedStatement.setString(3,circuit.getTempsPrevu());
            preparedStatement.setInt(4,circuit.getKmDepart());
            preparedStatement.setInt(5,circuit.getKmFin());
            preparedStatement.setInt(6,circuit.getIdecole());
            preparedStatement.setString(7,circuit.getIdmaterielroulant());
            preparedStatement.setString(8,circuit.getIdchauffeur());
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
}
 
  public static List<Circuit> getTousLesCircuits() {
        return getTousLesCircuits(false);
    }
    
    public static List<Circuit> getTousLesCircuitssarchives() {
        return getTousLesCircuits(true);
    }
      public static List<Circuit> getTousLesCircuits(boolean circuitsSupprimes){
        
        try{
            String supprimescircuits = circuitsSupprimes ? "1" : "0";
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from circuit where supprimecircuits = " + supprimescircuits);
           
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Circuit> allCircuit = new ArrayList<Circuit>();
            while(resultSet.next()){
                Circuit circuit = new Circuit();
                circuit.setId(resultSet.getInt("idcircuit"));
                circuit.setNomCircuit(resultSet.getString("nomcircuit"));
                circuit.setTempsPrevu(resultSet.getString("tempsprevu"));
                circuit.setKmDepart(resultSet.getInt("kmdepart"));
                circuit.setKmFin(resultSet.getInt("kmfin"));
                circuit.setIdecole(resultSet.getInt("idecole"));
                circuit.setIdmaterielroulant(resultSet.getString("id"));
                circuit.setIdchauffeur(resultSet.getString("idchauffeur"));
                circuit.setLesArrets( selectListeArretsPourCircuit(circuit.getId()));
                circuit.setLesEleves(selectListeElevePourCircuit(circuit.getId()));
                circuit.setLestrajets(selectTrajetsPourCircuit(circuit.getId()));
                allCircuit.add(circuit);
            }
            System.out.println(allCircuit);
            return allCircuit;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
}
      
        
         
         public static List<Trajets> selectTrajetsPourCircuit(int circuitIdc){
        try{
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from trajets join circuit on trajets.idcircuit = circuit.idcircuit where circuit.idcircuit = ?");
           
           ResultSet resultSet = preparedStatement.executeQuery();
           preparedStatement.setInt(1, circuitIdc);
            List<Trajets> allTrajets = new ArrayList<Trajets>();
            while(resultSet.next()){
                Trajets heure = new Trajets();
                heure.setIdtrajets(resultSet.getInt("idtrajets"));
                heure.setHeureDeDebut(resultSet.getString("heurededebut"));
                heure.setHeureDeFin(resultSet.getString("heuredefin"));
                heure.setDateTravail(resultSet.getDate("datetravail"));
                heure.setIdmaterielroulant(resultSet.getString("id"));
                heure.setIdchauffeur(resultSet.getString("idchauffeur"));
                heure.setIdcircuit(resultSet.getInt("idcircuit"));
                allTrajets.add(heure);
            }
            System.out.println(allTrajets);
            return allTrajets;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
      }
      
         
         public static List<Eleve> selectListeElevePourCircuit(int circuitIda){
    
    
    try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from eleve join circuit on eleve.idcircuit = circuit.idcircuit where circuit.idcircuit = ?");
            preparedStatement.setInt(1, circuitIda);
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
            //System.out.println(allEleve);
            return allEleve;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
         
         public static List<Arret> selectListeArretsPourCircuit(int circuitIdb) {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from contient join arrets on contient.idarrets = arrets.idarrets where idcircuit = ?");
            preparedStatement.setInt(1, circuitIdb);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Arret> allArret = new ArrayList<Arret>();
            while(resultSet.next()){
                Arret arret = new Arret();
                arret.setId(resultSet.getInt("idarrets"));
                arret.setAdresse(resultSet.getString("adressearrets"));
                
                allArret.add(arret);
            }
           // System.out.println(allArret);
            return allArret;
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
    } 

    
       public static boolean deletetCircuit(Circuit circuit){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("update circuit set supprimecircuits = 1 where circuit.idcircuit = ?");
             preparedStatement.setInt(1, circuit.getId());
             preparedStatement.execute();
             Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
}
}
