/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe;

import be.isfce.tfe.vue.AjoutChauffeurJPanell;
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
        JFrame jf = new JFrame();
        jf.add(jp);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        
    }
}
