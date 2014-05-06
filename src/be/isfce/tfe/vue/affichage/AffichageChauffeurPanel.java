/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.db.ChauffeurDBHelper;
import be.isfce.tfe.metier.Chauffeur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageChauffeurPanel extends AffichagePanel{
    List<Chauffeur> chauffeurs;
    
    String[] columnsNames = {"Nom","Prénom","Date de Naissance","Adresse","Code Postal","Ville","Email","Selection Médicale","Validiter Carte Chauffeur","Validiter Cap"};
    
    
    public AffichageChauffeurPanel() {
        super();
    }

    public void setChauffeurs(List<Chauffeur> chauffeurs) {
        this.chauffeurs = chauffeurs;
    }
    
    public AffichageChauffeurPanel(List<Chauffeur> chauffeurs) {
        super();
        this.chauffeurs = chauffeurs;
        displayData();
    }

    @Override
    public String getTitrePanel() {
        return "Chauffeurs";
    }

    @Override
    public AbstractTableModel getTableModel() {
        return new AbstractTableModel() {

            @Override
            public String getColumnName(int col) {
                return columnsNames[col].toString();
            }
            @Override
            public int getRowCount() {
                return chauffeurs.size();
            }

            @Override
            public int getColumnCount() {
                return columnsNames.length;
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return true;
            }

             
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                Chauffeur chauffeur = chauffeurs.get(rowIndex);
                switch(columnIndex){
                    case 0: 
                        return chauffeur.getNomChauffeur();
                    case 1: 
                        return chauffeur.getPrenomChauffeur();
                    case 2: 
                        return chauffeur.getDateNaissance();
                    case 3: 
                        return chauffeur.getAdresse();
                    case 4: 
                        return chauffeur.getCodepostale();
                    case 5: 
                        return chauffeur.getVille();
                    case 6: 
                        return chauffeur.getEmail();
                    case 7: 
                        return chauffeur.getSelectionmedicale();
                    case 8:
                        return chauffeur.getValiditercartechauffeur();
                    case 9:
                        return chauffeur.getValiditercap();
                    default :
                        return null;
                }
            }
        };
    }
    
}
