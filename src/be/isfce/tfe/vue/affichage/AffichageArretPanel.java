/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.Arret;

/**
 *
 * @author yema
 */
public class AffichageArretPanel extends AffichagePanel {
    @Override
      public Class getClassToDisplay() {
        return Arret.class;
    }

    
    @Override
    public String getTitrePanel() {
        return "Arret";
    }
    
}
