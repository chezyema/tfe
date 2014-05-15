/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;

import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.metier.Circuit;
import be.isfce.tfe.metier.DocumentsAdministratifs;
import be.isfce.tfe.metier.Trajets;
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
            preparedStatement.setString(8, chauffeur.getNumTelephone());
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

    public static List<Chauffeur> getTousLesChauffeurs() {
        return getTousLesChauffeurs(false);
    }

    public static List<Chauffeur> getTousLesChauffeursarchives() {
        return getTousLesChauffeurs(true);
    }

    private static List<Chauffeur> getTousLesChauffeurs(boolean chauffeursSupprimes) {

        try {
            String supprimes = chauffeursSupprimes ? "1" : "0";
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from chauffeur where supprime = " + supprimes);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Chauffeur> allChauffeurs = new ArrayList<Chauffeur>();
            while (resultSet.next()) {
                Chauffeur chauffeur = new Chauffeur();
                chauffeur.setId(resultSet.getString("idchauffeur"));
                chauffeur.setNomChauffeur(resultSet.getString("nom"));
                chauffeur.setPrenomChauffeur(resultSet.getString("prenom"));
                chauffeur.setDateNaissance(resultSet.getDate("datenaissance"));
                chauffeur.setAdresse(resultSet.getString("adresse"));
                chauffeur.setCodepostale(resultSet.getInt("codepostal"));
                chauffeur.setVille(resultSet.getString("ville"));
                chauffeur.setNumTelephone(resultSet.getString("numtelephone"));
                chauffeur.setEmail(resultSet.getString("email"));
                chauffeur.setSelectionMedicale(resultSet.getDate("selectionmedicale"));
                chauffeur.setValiditercartechauffeur(resultSet.getDate("validitercartechauffeur"));
                chauffeur.setValiditercap(resultSet.getDate("validitercap"));
                chauffeur.setLesCircuits(selectListeCircuitPourChauffeur(chauffeur.getId()));
                chauffeur.setLesdocuments(selectListeDocumentsPourChauffeur(chauffeur.getId()));
                chauffeur.setLesheures(selectListeTrajetsPourChauffeur(chauffeur.getId()));
                allChauffeurs.add(chauffeur);

            }
            System.out.println(allChauffeurs);
            return allChauffeurs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static List<Circuit> selectListeCircuitPourChauffeur(String chauffeurId) {

        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from circuit where idchauffeur = ?");
            preparedStatement.setString(1, chauffeurId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Circuit> allCircuit = new ArrayList<Circuit>();
            while (resultSet.next()) {
                Circuit circuit = new Circuit();
                circuit.setId(resultSet.getInt("idcircuit"));
                circuit.setNomCircuit(resultSet.getString("nomcircuit"));
                circuit.setTempsPrevu(resultSet.getString("tempsprevu"));
                circuit.setKmDepart(resultSet.getInt("kmdepart"));
                circuit.setKmFin(resultSet.getInt("kmfin"));


                allCircuit.add(circuit);
            }
            //System.out.println(allCircuit);
            return allCircuit;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }


    public static List<DocumentsAdministratifs> selectListeDocumentsPourChauffeur(String chauffeurIdb) {

        try {

            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from documentsadministratifs join chauffeur on  documentsadministratifs.idchauffeur = chauffeur.idchauffeur  where chauffeur.idchauffeur = ?");
            preparedStatement.setString(1, chauffeurIdb);
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
            //System.out.println(allDocuments);
            return allDocuments;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }



    }

    public static List<Trajets> selectListeTrajetsPourChauffeur(String chauffeurIdc) {
        try {

            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from trajets where idchauffeur = ?");
            preparedStatement.setString(1, chauffeurIdc);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Trajets> allHeureDeTravail = new ArrayList<Trajets>();
            while (resultSet.next()) {
                Trajets heure = new Trajets();
                heure.setIdtrajets(resultSet.getInt("idtrajets"));
                heure.setHeureDeDebut(resultSet.getString("heurededebut"));
                heure.setHeureDeFin(resultSet.getString("heuredefin"));
                heure.setDateTravail(resultSet.getDate("datetravail"));

                allHeureDeTravail.add(heure);
            }
            //  System.out.println(allHeureDeTravail);
            return allHeureDeTravail;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean deleteChauffeur(Chauffeur chauffeur) {

        try {
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("update chauffeur set supprime = 1 where chauffeur.idchauffeur = ?");
            preparedStatement.setString(1, chauffeur.getId());
            preparedStatement.execute();
            Connexion.getInstance().getConn().commit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
