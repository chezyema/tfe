/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.Circuit;

/**
 *
 * @author yema
 */
public class AffichageCircuitPanel extends AffichagePanel {
    @Override
      public Class getClassToDisplay() {
        return Circuit.class;
    }

    
    @Override
    public String getTitrePanel() {
        return "Circuit";
    }
    
}