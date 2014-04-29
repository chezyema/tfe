/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.MaterielRoulant;

/**
 *
 * @author yema
 */
public class AffichageMaterielRoulantPanel extends AffichagePanel{

    @Override
    public Class getClassToDisplay() {
        return MaterielRoulant.class;
    }

    @Override
    public String getTitrePanel() {
        return "Materiel roulant";
    }
    
}