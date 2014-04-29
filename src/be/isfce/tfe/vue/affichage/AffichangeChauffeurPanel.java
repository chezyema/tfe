/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.Chauffeur;

/**
 *
 * @author yema
 */
public class AffichangeChauffeurPanel extends AffichagePanel{

    @Override
    public Class getClassToDisplay() {
        return Chauffeur.class;
    }

    @Override
    public String getTitrePanel() {
        return "Chauffeurs";
    }
    
}
