/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Arret;
import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Circuit;
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
public class CircuitDBHelper {
    
      private static CircuitDBHelper uniqueInstance = new CircuitDBHelper ();

    public static CircuitDBHelper  getInstance() {
        return uniqueInstance;
    }

    
 public static boolean addCircuit(Circuit circuit){
        
        try{
            System.out.println(circuit.toString());
            Date dateSql = new Date(circuit.getDateCircuit().getTime());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into circuit (idcircuit,nomcircuit,tempsprevu,kmdepart,kmfin,datecircuit) values ( ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, circuit.getId());
            preparedStatement.setString(2, circuit.getNomCircuit());
            preparedStatement.setString(3,circuit.getTempsPrevu());
            preparedStatement.setInt(4,circuit.getKmDepart());
            preparedStatement.setInt(5,circuit.getKmFin());
            preparedStatement.setDate(6, dateSql);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
}
      public static List<Circuit> selectCircuit(){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from circuit");
           
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Circuit> allCircuit = new ArrayList<Circuit>();
            while(resultSet.next()){
                Circuit circuit = new Circuit();
                circuit.setId(resultSet.getInt("idcircuit"));
                circuit.setNomCircuit(resultSet.getString("nomcircuit"));
                circuit.setTempsPrevu(resultSet.getString("tempsprevu"));
                circuit.setKmDepart(resultSet.getInt("kmdepart"));
                circuit.setKmFin(resultSet.getInt("kmfin"));
                circuit.setDateCircuit(resultSet.getDate("datecircuit"));
                
                allCircuit.add(circuit);
            }
            System.out.println(allCircuit);
            return allCircuit;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
}
      
         public static List<Chauffeur> selectListeChauffeur() {

        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from chauffeur");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Chauffeur> allChauffeurs = new ArrayList<Chauffeur>();
            while(resultSet.next()){
                Chauffeur chauffeur = new Chauffeur();
                chauffeur.setId(resultSet.getString("idchauffeur"));
                chauffeur.setNomChauffeur(resultSet.getString("nom"));
                chauffeur.setPrenomChauffeur(resultSet.getString("prenom"));
                chauffeur.setDateNaissance(resultSet.getDate("datenaissance"));
                chauffeur.setAdresse(resultSet.getString("adresse"));
                chauffeur.setCodepostale(resultSet.getInt("codepostal"));
                chauffeur.setVille(resultSet.getString("ville"));
                chauffeur.setNumTelephone(resultSet.getInt("numtelephone"));
                chauffeur.setEmail(resultSet.getString("email"));
                chauffeur.setSelectionMedicale(resultSet.getDate("selectionmedicale"));
                chauffeur.setValiditercartechauffeur(resultSet.getDate("validitercartechauffeur"));
                chauffeur.setValiditercap(resultSet.getDate("validitercap"));
                allChauffeurs.add(chauffeur);
                
                }
            System.out.println(allChauffeurs);
            return allChauffeurs;
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
         
         public static List<Arret> selectListeArrets() {
        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from arrets");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Arret> allArret = new ArrayList<Arret>();
            while(resultSet.next()){
                Arret arret = new Arret();
                arret.setId(resultSet.getInt("idarrets"));
                arret.setAdresse(resultSet.getString("adressearrets"));
                
                allArret.add(arret);
            }
            System.out.println(allArret);
            return allArret;
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
    } 

    
       public static boolean deletetCircuit(Circuit circuit){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from circuit");
           
             preparedStatement.execute();
             Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
}
}
