/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.CarteCarburant;

/**
 *
 * @author yema
 */
public class AffichageCarteCarburantPanel extends AffichagePanel {
    @Override
      public Class getClassToDisplay() {
        return CarteCarburant.class;
    }

    
    @Override
    public String getTitrePanel() {
        return "CarteCarburant";
    }
    
}