/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.db.CircuitDBHelper;
import be.isfce.tfe.metier.Circuit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageCircuitPanel extends AffichagePanel {
    
    List<Circuit> circuits;
    
    String[] columnsNames = {"Nom circuit","Temps prevu","Kilometre de depart","kilometre de fin"};
    
     public AffichageCircuitPanel() {
        super();
    }
     public void setCircuit(List<Circuit> circuits) {
        this.circuits = circuits;
         displayData();
    }
    
    public AffichageCircuitPanel(List<Circuit> circuits) {
        super();
        this.circuits = circuits;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Les Circuits";
    }
    
     public void supprimeCircuitsSelectionnes(){
        int selectedRow = jTable1.getSelectedRow();
        try{
        CircuitDBHelper.deletetCircuit(circuits.get(selectedRow));
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
                return circuits.size();
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
                Circuit trajet = circuits.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return trajet.getNomCircuit();
                    case 1:
                        return trajet.getTempsPrevu();
                    case 2:
                        return trajet.getKmDepart();
                    case 3:
                        return trajet.getKmFin();
                    
                    
                    default :
                        return null;
                }
            }
        };
    }
    
}
