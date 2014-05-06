/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.metier.HeureDeTravail;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageHeureDeTravaiPanell  extends AffichagePanel {
    

   List<HeureDeTravail> heures;
    
    String[] columnsNames = {"heure de debut","Heure de fin","Date de travail"};
    
     public AffichageHeureDeTravaiPanell() {
        super();
    }
     public void setArret(List<HeureDeTravail> arrets) {
        this.heures = heures;
    }
    
    public AffichageHeureDeTravaiPanell(List<HeureDeTravail> heures) {
        super();
        this.heures = heures;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Les heures de travail";
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
                return heures.size();
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
                HeureDeTravail heure = heures.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return heure.getHeureDeDebut();
                    case 1:
                        return heure.getHeureDeFin();
                    case 2:
                        return heure.getDateTravail();
                    
                    default :
                        return null;
                }
            }
        };
    }
    
}
