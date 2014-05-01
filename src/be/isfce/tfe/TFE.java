/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe;

import be.isfce.tfe.db.ArretDBHelper;
import be.isfce.tfe.db.CarteCarburantDBHelper;
import be.isfce.tfe.db.ChauffeurDBHelper;
import be.isfce.tfe.db.CircuitDBHelper;
import be.isfce.tfe.db.DocumentsAdministratifsDBHelper;
import be.isfce.tfe.db.EcoleDBHelper;
import be.isfce.tfe.db.EleveDBHelper;
import be.isfce.tfe.db.EntretienDBHelper;
import be.isfce.tfe.db.HeureDETravailDBHelper;
import be.isfce.tfe.db.MaterielRoulantDBHelper;
import be.isfce.tfe.vue.affichage.AffichageArretPanel;
import be.isfce.tfe.vue.affichage.AffichageCarteCarburantPanel;
import be.isfce.tfe.vue.affichage.AffichageCircuitPanel;
import be.isfce.tfe.vue.affichage.AffichageDocumentsPanel;
import be.isfce.tfe.vue.affichage.AffichageEcolePanel;
import be.isfce.tfe.vue.affichage.AffichageElevePanel;
import be.isfce.tfe.vue.affichage.AffichageEntretienPanel;
import be.isfce.tfe.vue.affichage.AffichageHeureDeTravaiPanell;
import be.isfce.tfe.vue.affichage.AffichageMaterielRoulantPanel;
import be.isfce.tfe.vue.affichage.AffichagePanel;
import be.isfce.tfe.vue.affichage.AffichangeChauffeurPanel;
import be.isfce.tfe.vue.ajout.AjoutArretJPanell;
import be.isfce.tfe.vue.ajout.AjoutCarteCarburantJPanell;
import be.isfce.tfe.vue.ajout.AjoutChauffeurJPanell;
import be.isfce.tfe.vue.ajout.AjoutCircuitJPanell;
import be.isfce.tfe.vue.ajout.AjoutDocumentsJPanell;
import be.isfce.tfe.vue.ajout.AjoutEcoleJPanel;
import be.isfce.tfe.vue.ajout.AjoutEleveJPanel;
import be.isfce.tfe.vue.ajout.AjoutEntretienJPanell;
import be.isfce.tfe.vue.ajout.AjoutMateielRoulantJPanell;
import be.isfce.tfe.vue.ajout.InsertionCarteUtilisationJPanel;

import be.isfce.tfe.vue.ajout.AssociationvehiculechauffeurJPanell;
import be.isfce.tfe.vue.ajout.AtravaillerJPanell;
import be.isfce.tfe.vue.ajout.CarburantUtilisationJPanell;
import be.isfce.tfe.vue.ajout.ContientJPanell;
import be.isfce.tfe.vue.ajout.EstEffectuerJPanell;
import be.isfce.tfe.vue.ajout.InsertionHeuredetravailJPanel;
import be.isfce.tfe.vue.ajout.MrutilisationJPanell;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author yema
 */
public class TFE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ceci est un test
        JPanel jp = new AjoutChauffeurJPanell();
        JPanel jpa = new AjoutCarteCarburantJPanell();
        JPanel jpb = new AjoutArretJPanell();
        JPanel jpc = new AjoutCircuitJPanell();
        JPanel jpd = new AjoutDocumentsJPanell();
        JPanel jpe = new AjoutEcoleJPanel();
        JPanel jpf = new AjoutEleveJPanel();
        JPanel jpg = new AjoutEntretienJPanell();
        JPanel jph = new AjoutMateielRoulantJPanell();
        JPanel jpi = new InsertionCarteUtilisationJPanel();
        JPanel jpj = new InsertionHeuredetravailJPanel();
        JPanel jpk = new AssociationvehiculechauffeurJPanell();
        JPanel jpl = new MrutilisationJPanell();
        JPanel jpm = new EstEffectuerJPanell();
        JPanel jpn = new ContientJPanell();
        JPanel jpo = new CarburantUtilisationJPanell();
        JPanel jpp = new AtravaillerJPanell();

        AffichagePanel aa = new AffichangeChauffeurPanel();
        AffichagePanel ab = new AffichageArretPanel();
        AffichagePanel ac = new AffichageCarteCarburantPanel();
        AffichagePanel ad = new AffichageCircuitPanel();
        AffichagePanel ae = new AffichageDocumentsPanel();
        AffichagePanel af = new AffichageEcolePanel();
        AffichagePanel ag = new AffichageElevePanel();
        AffichagePanel ah = new AffichageEntretienPanel();
        AffichagePanel ai = new AffichageHeureDeTravaiPanell();
        AffichagePanel aj = new AffichageMaterielRoulantPanel();
        /*
         ChauffeurDBHelper.selectChauffeur();
         ArretDBHelper.selectArrets();
         CarteCarburantDBHelper.selectCarteCarburant();
         CircuitDBHelper.selectCircuit();
         DocumentsAdministratifsDBHelper.selectDocuments();
         EcoleDBHelper.selectEcole();
         EleveDBHelper.selectEleve();
         EntretienDBHelper.selectEntretien();
         HeureDETravailDBHelper.selectHeureDeTravail();
         MaterielRoulantDBHelper.selectMaterielRoulant();*/


        JFrame jf = new JFrame();
        jf.add(ab);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        ArretDBHelper.selectArrets();
    }
}
