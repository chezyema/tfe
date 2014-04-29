/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.Eleve;

/**
 *
 * @author yema
 */
public class AffichageElevePanel extends AffichagePanel{

    @Override
    public Class getClassToDisplay() {
        return Eleve.class;
    }

    @Override
    public String getTitrePanel() {
        return "eleve";
    }
    
}