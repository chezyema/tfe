/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe;

import be.isfce.tfe.vue.AjoutArretJPanell;
import be.isfce.tfe.vue.AjoutCarteCarburantJPanell;
import be.isfce.tfe.vue.AjoutChauffeurJPanell;
import be.isfce.tfe.vue.AjoutCircuitJPanell;
import be.isfce.tfe.vue.AjoutDocumentsJPanell;
import be.isfce.tfe.vue.AjoutEcoleJPanel;
import be.isfce.tfe.vue.AjoutEleveJPanel;
import be.isfce.tfe.vue.AjoutEntretienJPanell;
import be.isfce.tfe.vue.AjoutMateielRoulantJPanell;
import be.isfce.tfe.vue.InsertionCarteUtilisationJPanel;
import be.isfce.tfe.vue.InsertionHeuredetravailJPanel;
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
        JFrame jf = new JFrame();
        jf.add(jpf);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);

    }
}
