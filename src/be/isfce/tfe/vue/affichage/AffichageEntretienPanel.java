/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.metier.Entretien;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageEntretienPanel extends AffichagePanel{


    List<Entretien> entretiens;
    
    String[] columnsNames = {"Description","Kilometrage actuel","Date entretien"};
    
     public AffichageEntretienPanel() {
        super();
    }
     public void setentretien(List<Entretien> entretiens) {
        this.entretiens = entretiens;
    }
    
    public AffichageEntretienPanel(List<Entretien> entretiens) {
        super();
        this.entretiens = entretiens;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Les entretiens des vehicules";
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
                return entretiens.size();
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
                Entretien entretien = entretiens.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return entretien.getDescription();
                    case 1:
                        return entretien.getKmEntretienFait();
                    case 2:
                        return entretien.getDateEntretien();
                    
                    
                    default :
                        return null;
                }
            }
        };
    }
}