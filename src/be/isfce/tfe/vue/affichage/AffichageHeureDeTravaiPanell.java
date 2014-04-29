/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.HeureDeTravail;

/**
 *
 * @author yema
 */
public class AffichageHeureDeTravaiPanell  extends AffichagePanel {
    @Override
      public Class getClassToDisplay() {
        return HeureDeTravail.class;
    }

    
    @Override
    public String getTitrePanel() {
        return "Heure de travail";
    }
    
}
    

