/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.DocumentsAdministratifs;
import be.isfce.tfe.metier.MaterielRoulant;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yema
 */
public class ChauffeurDBHelper {

    private static ChauffeurDBHelper uniqueInstance = new ChauffeurDBHelper();

    public static ChauffeurDBHelper getInstance() {
        return uniqueInstance;
    }

    public static boolean addChauffeur(Chauffeur chauffeur) {

        try {
            Date dateSql = new Date(chauffeur.getDateNaissance().getTime());
            Date dateSqla = new Date(chauffeur.getSelectionmedicale().getTime());
            Date dateSqlb = new Date(chauffeur.getValiditercartechauffeur().getTime());
            Date dateSqlc = new Date(chauffeur.getValiditercap().getTime());

            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into chauffeur (idchauffeur,nom,prenom,datenaissance,adresse,codepostal,ville,numtelephone,email,selectionmedicale,validitercartechauffeur,validitercap) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, chauffeur.getId());

            preparedStatement.setString(2, chauffeur.getNomChauffeur());
            preparedStatement.setString(3, chauffeur.getPrenomChauffeur());
            preparedStatement.setDate(4, dateSql);
            preparedStatement.setString(5, chauffeur.getAdresse());
            preparedStatement.setInt(6, chauffeur.getCodepostale());
            preparedStatement.setString(7, chauffeur.getVille());
            preparedStatement.setInt(8, chauffeur.getNumTelephone());
            preparedStatement.setString(9, chauffeur.getEmail());
            preparedStatement.setDate(10, dateSqla);
            preparedStatement.setDate(11, dateSqlb);
            preparedStatement.setDate(12, dateSqlc);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Chauffeur> selectChauffeur() {

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
    
     public static List<Circuit> selectListeCircuit(){
        
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
     
      public static List<MaterielRoulant> selectListeMaterielRoulant(){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from materielroulant");
           
          ResultSet resultSet = preparedStatement.executeQuery();
            List<MaterielRoulant> allMaterielRoulant = new ArrayList<MaterielRoulant>();
            while(resultSet.next()){
                MaterielRoulant vehicule = new MaterielRoulant();
                vehicule.setId(resultSet.getString("id"));
                vehicule.setMarque(resultSet.getString("marque"));
                vehicule.setType(resultSet.getString("type"));
                vehicule.setAnneedeconstruction(resultSet.getDate("anneedeconstruction"));
                vehicule.setCarburant(resultSet.getString("carburant"));
                vehicule.setNumImmatr(resultSet.getString("numimmatr"));
                vehicule.setNbDePlaces(resultSet.getInt("nbdeplaces"));
                vehicule.setKmactuel(resultSet.getInt("kmactuel"));
                vehicule.setDateexctincteur(resultSet.getDate("validiterexctincteur"));
               
                
                allMaterielRoulant.add(vehicule);
                
                }
            System.out.println(allMaterielRoulant);
            return allMaterielRoulant;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     
       public static List<DocumentsAdministratifs> selectListeDocuments(){
        
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
     public static boolean deleteChauffeur(Chauffeur chauffeur) {

        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from chauffeur");
            
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
