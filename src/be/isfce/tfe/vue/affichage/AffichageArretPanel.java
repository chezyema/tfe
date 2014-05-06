/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;

import be.isfce.tfe.metier.Arret;
import be.isfce.tfe.metier.Chauffeur;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageArretPanel extends AffichagePanel {
    
     List<Arret> arrets;
    
    String[] columnsNames = {"Adresse des Arret"};
    
     public AffichageArretPanel() {
        super();
    }
     public void setArret(List<Arret> arrets) {
        this.arrets = arrets;
    }
    
    public AffichageArretPanel(List<Arret> arrets) {
        super();
        this.arrets = arrets;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Arret";
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
                return arrets.size();
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
                Arret arret = arrets.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return arret.getAdresse();
                    
                    default :
                        return null;
                }
            }
        };
    }
    
}
