/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.DocumentsAdministratifs;

/**
 *
 * @author yema
 */
public class AffichageDocumentsPanel extends AffichagePanel {
    @Override
      public Class getClassToDisplay() {
        return DocumentsAdministratifs.class;
    }

    
    @Override
    public String getTitrePanel() {
        return "documentsadministratifs";
    }
    
}