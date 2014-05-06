/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.CarteCarburant;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.MaterielRoulant;
import be.isfce.tfe.metier.UtilisationCarte;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yema
 */
public class UtlisationCarteDBHelper {

    private static UtlisationCarteDBHelper uniqueInstance = new UtlisationCarteDBHelper();

    public static UtlisationCarteDBHelper getInstance() {
        return uniqueInstance;
    }

    public static boolean addUtilisationCarte(UtilisationCarte carte) {
        try {
            System.out.println(carte.toString());
            Date dateSql = new Date(carte.getDateUtilisation().getTime());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into utilisationcarte (idutilisation,dateutilisation) values (? , ?)");
            preparedStatement.setInt(1, carte.getIdutilisationcarte());
            preparedStatement.setDate(2, dateSql);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
     public static List<UtilisationCarte> selectUtilisationCarte(){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from utilisationcarte");
           
            ResultSet resultSet = preparedStatement.executeQuery();
            List<UtilisationCarte> allUtilisationCarte = new ArrayList<UtilisationCarte>();
            while(resultSet.next()){
                UtilisationCarte heure = new UtilisationCarte();
                heure.setIdutilisationcarte(resultSet.getInt("idutilisation"));
                heure.setDateutilisation(resultSet.getDate("dateutilisation"));
                heure.setLescartes(selectListeCarteCarburantPourUtilisationCarte(heure.getIdutilisationcarte()));
                heure.setLesvehicules(selectListeMaterielRoulantPourUtilisationCarte(heure.getIdutilisationcarte()));
                
                allUtilisationCarte.add(heure);
            }
            System.out.println(allUtilisationCarte);
            return allUtilisationCarte;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    
    
}
     
      public static List<MaterielRoulant> selectListeMaterielRoulantPourUtilisationCarte(int utilisationCarteId){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from mr_utilisation join materielroulant on mr_utilisation.id = materielroulant.id where idutilisation = ?");
            preparedStatement.setInt(1, utilisationCarteId);
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
           // System.out.println(allMaterielRoulant);
            return allMaterielRoulant;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      
         public static List<CarteCarburant> selectListeCarteCarburantPourUtilisationCarte(int utilisationCarteIda){
       try{
           PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from carburant_utilisation join cartecarburant on carburant_utilisation.idcarte = cartecarburant.idcarte where idutilisation = ? ");
           preparedStatement.setInt(1, utilisationCarteIda);
           ResultSet resultSet = preparedStatement.executeQuery();
            List<CarteCarburant> allCarteCarburant = new ArrayList<CarteCarburant>();
            while(resultSet.next()){
                CarteCarburant cartecarburant = new CarteCarburant();
                cartecarburant.setId(resultSet.getInt("idcarte"));
                cartecarburant.setKmUtilisation(resultSet.getInt("kmutilisation"));
                cartecarburant.setLitreCarburant(resultSet.getInt("litrecarburant"));
                   
                allCarteCarburant.add(cartecarburant);
            }
            // System.out.println(allCarteCarburant);
             return allCarteCarburant;
       }
            catch (Exception e){
            e.printStackTrace();
            return null;
        
        
        }
   
    }
       public static boolean deleteUtilisationCarte(UtilisationCarte carte) {
        try {
            
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("delete * from utilisationcarte");
           
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
