/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.metier.Trajets;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageTrajetsPanell  extends AffichagePanel {
    

   List<Trajets> heures;
    
    String[] columnsNames = {"heure de debut","Heure de fin","Date de travail"};
    
     public AffichageTrajetsPanell() {
        super();
    }
     public void setArret(List<Trajets> arrets) {
        this.heures = heures;
    }
    
      public AffichageTrajetsPanell(List<Trajets> heures) {
        super();
        this.heures = heures;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Les Trajets";
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
                Trajets heure = heures.get(rowIndex);
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
