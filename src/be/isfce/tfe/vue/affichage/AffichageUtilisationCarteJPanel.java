/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.metier.UtilisationCarte;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageUtilisationCarteJPanel extends AffichagePanel {

    
    List<UtilisationCarte> utilisations;
    
    String[] columnsNames = {"Date utilisation"};
    
     public AffichageUtilisationCarteJPanel() {
        super();
    }
     public void setUtilisationCarte(List<UtilisationCarte> utilisationcarte) {
        this.utilisations = utilisationcarte;
    }
    
    public AffichageUtilisationCarteJPanel(List<UtilisationCarte> utilisationcarte) {
        super();
        this.utilisations = utilisationcarte;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Carte utilisation";
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
                return utilisations.size();
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
                UtilisationCarte utilisation = utilisations.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return utilisation.getDateUtilisation();
                    
                    default :
                        return null;
                }
            }
        };
    }
    
}
