/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Entretien;
import be.isfce.tfe.metier.MaterielRoulant;
import be.isfce.tfe.metier.UtilisationCarte;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yema
 */
public class MaterielRoulantDBHelper  {
    
    
    
        private static MaterielRoulantDBHelper  uniqueInstance = new MaterielRoulantDBHelper ();

    public static MaterielRoulantDBHelper  getInstance() {
        return uniqueInstance;
    }

    
    
    public static boolean addMaterielRoulant(MaterielRoulant vehicule){
        
        try{
             Date dateSql  = new Date(vehicule.getAnneedeconstruction().getTime());
             Date dateSqla  = new Date(vehicule.getDateexctincteur().getTime());
             



           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into materielroulant (id,marque,type,anneedeconstruction,carburant,numimmatr,nbdeplaces,kmactuel,validiterexctincteur) VALUES (? , ?, ?,?,?,?,?,?,?)");
            preparedStatement.setString(1, vehicule.getId());
                    
            preparedStatement.setString(2, vehicule.getMarque());
            preparedStatement.setString(3, vehicule.getType());
            preparedStatement.setDate(4, dateSql);
            preparedStatement.setString(5,vehicule.getCarburant());
            preparedStatement.setString(6, vehicule.getNumImmatr());
            preparedStatement.setInt(7, vehicule.getNbDePlaces());
            preparedStatement.setInt(8, vehicule.getKmactuel());
            preparedStatement.setDate(9, dateSqla);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
   public static List<MaterielRoulant> selectMaterielRoulant(){
        
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
     public static List<Entretien> selectListeEntretien(){
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
        
         public static List<UtilisationCarte> selectListeUtilisationCarte(){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from utilisationcarte");
           
            ResultSet resultSet = preparedStatement.executeQuery();
            List<UtilisationCarte> allUtilisationCarte = new ArrayList<UtilisationCarte>();
            while(resultSet.next()){
                UtilisationCarte heure = new UtilisationCarte();
                heure.setIdutilisationcarte(resultSet.getInt("idutilisation"));
                heure.setDateutilisation(resultSet.getDate("dateutilisation"));
                
                
                allUtilisationCarte.add(heure);
            }
            System.out.println(allUtilisationCarte);
            return allUtilisationCarte;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
}
    
       public static boolean deleteMaterielRoulant(MaterielRoulant vehicule){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from materielroulant");
           
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
