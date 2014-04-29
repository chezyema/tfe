/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.Entretien;

/**
 *
 * @author yema
 */
public class AffichageEntretienPanel extends AffichagePanel{

    @Override
    public Class getClassToDisplay() {
        return Entretien.class;
    }

    @Override
    public String getTitrePanel() {
        return "entretien";
    }
    
}