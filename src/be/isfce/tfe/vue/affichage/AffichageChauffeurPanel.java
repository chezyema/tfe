/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.db.ChauffeurDBHelper;
import be.isfce.tfe.metier.Chauffeur;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageChauffeurPanel extends AffichagePanel implements Observer{
    List<Chauffeur> chauffeurs;
    
    String[] columnsNames = {"Nom","Prénom","Date de Naissance","Adresse","Code Postal","Ville","Email","Selection Médicale","Validiter Carte Chauffeur","Validiter Cap"};
    
    
    public AffichageChauffeurPanel() {
        super();
    }

    public void setChauffeurs(List<Chauffeur> chauffeurs) {
        this.chauffeurs = chauffeurs;
        displayData();
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
    
    public void supprimeChauffeursSelectionnes(){
        int selectedRow = jTable1.getSelectedRow();
        //TODO Ajouter message validation
        try{
        ChauffeurDBHelper.deleteChauffeur(chauffeurs.get(selectedRow));
        
            }
          catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
           }
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

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
