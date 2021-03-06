/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.DocumentsAdministratifs;
import be.isfce.tfe.metier.Entretien;
import be.isfce.tfe.metier.MaterielRoulant;
import be.isfce.tfe.metier.Trajets;
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
public class MaterielRoulantDBHelper {

    private static MaterielRoulantDBHelper uniqueInstance = new MaterielRoulantDBHelper();

    public static MaterielRoulantDBHelper getInstance() {
        return uniqueInstance;
    }

    public static boolean addMaterielRoulant(MaterielRoulant vehicule) {

        try {
            Date dateSql = new Date(vehicule.getAnneedeconstruction().getTime());
            Date dateSqla = new Date(vehicule.getDateexctincteur().getTime());




            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into materielroulant (id,marque,type,anneedeconstruction,carburant,numimmatr,nbdeplaces,kmactuel,validiterexctincteur) VALUES (? , ?, ?,?,?,?,?,?,?)");
            preparedStatement.setString(1, vehicule.getId());

            preparedStatement.setString(2, vehicule.getMarque());
            preparedStatement.setString(3, vehicule.getType());
            preparedStatement.setDate(4, dateSql);
            preparedStatement.setString(5, vehicule.getCarburant());
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

    public static List<MaterielRoulant> getTousLesVehicules() {
        return getTousLesMaterielRoulant(false);
    }

    public static List<MaterielRoulant> getTousLesVehiculesarchives() {
        return getTousLesMaterielRoulant(true);
    }

    public static List<MaterielRoulant> getTousLesMaterielRoulant(boolean vehiculeSupprimes) {

        try {
            String supprimesmateriel = vehiculeSupprimes ? "1" : "0";
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from materielroulant where supprimematerielroulant = " + supprimesmateriel);

            ResultSet resultSet = preparedStatement.executeQuery();
            List<MaterielRoulant> allMaterielRoulant = new ArrayList<MaterielRoulant>();
            while (resultSet.next()) {
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
                vehicule.setLesEntretiens(selectListeEntretienPourMaterielRoulant(vehicule.getId()));
                vehicule.setLesdocuments(selectListeDocumentsPourMaterielRoulant(vehicule.getId()));
                vehicule.setLesMemos(selectListeUtilisationCartePourMaterielRoulant(vehicule.getId()));

                allMaterielRoulant.add(vehicule);

            }
            System.out.println(allMaterielRoulant);
            return allMaterielRoulant;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Entretien> selectListeEntretienPourMaterielRoulant(String materielRoulantId) {
        try {

            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from entretien join materielroulant on entretien.id = materielroulant.id where materielroulant.id = ?");
            preparedStatement.setString(1, materielRoulantId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Entretien> allEntretien = new ArrayList<Entretien>();
            while (resultSet.next()) {
                Entretien entretien = new Entretien();
                entretien.setId(resultSet.getInt("identretien"));
                entretien.setDescription(resultSet.getString("description"));
                entretien.setKmEntretienFait(resultSet.getInt("kmentretienfait"));
                entretien.setDateEntretien(resultSet.getDate("dateentretien"));
                entretien.setIdmaterielroulant(resultSet.getString("id"));

                allEntretien.add(entretien);
            }
            //System.out.println(allEntretien);
            return allEntretien;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    public static List<UtilisationCarte> selectListeUtilisationCartePourMaterielRoulant(String materielRoulantIdb) {

        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from utilisationcarte where id = ?");
            preparedStatement.setString(1, materielRoulantIdb);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<UtilisationCarte> allUtilisationCarte = new ArrayList<UtilisationCarte>();
            while (resultSet.next()) {
                UtilisationCarte heure = new UtilisationCarte();
                heure.setIdutilisationcarte(resultSet.getInt("idutilisation"));
                heure.setDateutilisation(resultSet.getDate("dateutilisation"));


                allUtilisationCarte.add(heure);
            }
            // System.out.println(allUtilisationCarte);
            return allUtilisationCarte;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    public static List<DocumentsAdministratifs> selectListeDocumentsPourMaterielRoulant(String materielRoulantIdc) {

        try {

            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from  documentsadministratifs join  materielroulant  on documentsadministratifs.id = materielroulant.id where materielroulant.id = ?");
            preparedStatement.setString(1, materielRoulantIdc);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<DocumentsAdministratifs> allDocuments = new ArrayList<DocumentsAdministratifs>();
            while (resultSet.next()) {
                DocumentsAdministratifs documents = new DocumentsAdministratifs();
                documents.setId(resultSet.getInt("iddocument"));
                documents.setLibelle(resultSet.getString("libelle"));
                documents.setDateValiditer(resultSet.getDate("datevaliditer"));
                documents.setIdmaterielroulant(resultSet.getString("id"));
                documents.setIdchauffeur(resultSet.getString("idchauffeur"));

                allDocuments.add(documents);
            }
            //  System.out.println(allDocuments);
            return allDocuments;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }



    }

    public static List<Circuit> getTousLesCircuitsPourMaterielRoulants(String materielroulantId) {

        try {

            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from circuit join materielroulant on circuit.idcircuit = materielroulant.id where materielroulant.id = ?");

            ResultSet resultSet = preparedStatement.executeQuery();
            List<Circuit> allCircuit = new ArrayList<Circuit>();
            while (resultSet.next()) {
                Circuit circuit = new Circuit();
                circuit.setId(resultSet.getInt("idcircuit"));
                circuit.setNomCircuit(resultSet.getString("nomcircuit"));
                circuit.setTempsPrevu(resultSet.getString("tempsprevu"));
                circuit.setKmDepart(resultSet.getInt("kmdepart"));
                circuit.setKmFin(resultSet.getInt("kmfin"));
                circuit.setIdmaterielroulant(resultSet.getString("id"));
                allCircuit.add(circuit);
            }
            System.out.println(allCircuit);
            return allCircuit;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    public static List<Trajets> selectTrajetsPourMaterielRoulant(String materielroulantID) {



        try {

            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from trajets join materielroulant on trajets.idtrajets= materielroulant.id where materielroulant.id = ?");

            ResultSet resultSet = preparedStatement.executeQuery();
            List<Trajets> allTrajets = new ArrayList<Trajets>();
            while (resultSet.next()) {
                Trajets heure = new Trajets();
                heure.setIdtrajets(resultSet.getInt("idtrajets"));
                heure.setHeureDeDebut(resultSet.getString("heurededebut"));
                heure.setHeureDeFin(resultSet.getString("heuredefin"));
                heure.setDateTravail(resultSet.getDate("datetravail"));
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

    public static boolean deleteMaterielRoulant(MaterielRoulant vehicule) {

        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("update materielroulant set supprimematerielroulant = 1 where materielroulant.id= ?");
            preparedStatement.setString(1, vehicule.getId());
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
