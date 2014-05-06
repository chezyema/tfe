/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;



import be.isfce.tfe.metier.CarteCarburant;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageCarteCarburantPanel extends AffichagePanel {
    
     List<CarteCarburant> cartecarburant;
    
    String[] columnsNames = {"kilometre utilisation","Litre de carburant"};
    
     public AffichageCarteCarburantPanel() {
        super();
    }
     public void setCarteCarburant(List<CarteCarburant> cartecarburant) {
        this.cartecarburant = cartecarburant;
    }
    
    public AffichageCarteCarburantPanel(List<CarteCarburant> cartecarburant) {
        super();
        this.cartecarburant = cartecarburant;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Carte de Carburant";
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
                return cartecarburant.size();
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
                CarteCarburant carte = cartecarburant.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return carte.getKmUtilisation();
                    case 1:
                        return carte.getLitreCarburant();
                    
                    default :
                        return null;
                }
            }
        };
    }
    
    
}