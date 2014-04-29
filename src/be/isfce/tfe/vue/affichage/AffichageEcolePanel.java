/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.Ecole;

/**
 *
 * @author yema
 */
public class AffichageEcolePanel  extends AffichagePanel{

    @Override
    public Class getClassToDisplay() {
        return Ecole.class;
    }

    @Override
    public String getTitrePanel() {
        return "ecole";
    }
    
}