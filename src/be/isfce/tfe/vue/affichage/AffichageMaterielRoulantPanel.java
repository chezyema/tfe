/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.db.MaterielRoulantDBHelper;
import be.isfce.tfe.metier.MaterielRoulant;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageMaterielRoulantPanel extends AffichagePanel{

      List<MaterielRoulant> vehicules;
    
    String[] columnsNames = {"Numero de chassis","Marque","Type","Annee de construction","Carburant","Plaque","Nombre de place","Kilometre actuel"};
    
    
    public AffichageMaterielRoulantPanel() {
        super();
    }

    public void setVehicules(List<MaterielRoulant> vehicules) {
        this.vehicules = vehicules;
         displayData();
    }
    
    public AffichageMaterielRoulantPanel(List<MaterielRoulant> vehicules) {
        super();
        this.vehicules = vehicules;
        displayData();
    }

    @Override
    public String getTitrePanel() {
        return "Les vehicules";
    }

     public void supprimeVehiculesSelectionnes(){
        int selectedRow = jTable1.getSelectedRow();
        try{
        MaterielRoulantDBHelper.deleteMaterielRoulant(vehicules.get(selectedRow));
        
            JOptionPane jop1;
            jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Suppression éxecuter", "Information", JOptionPane.INFORMATION_MESSAGE);
            
           }
          catch (NumberFormatException ex) {
            
            JOptionPane jop3;
            jop3 = new JOptionPane();
            jop3.showMessageDialog(null, "Suppression échoué", "Erreur", JOptionPane.ERROR_MESSAGE);
            
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
                return vehicules.size();
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
                MaterielRoulant vehicule = vehicules.get(rowIndex);
                switch(columnIndex){
                    case 0: 
                        return vehicule.getId();
                    case 1: 
                        return vehicule.getMarque();
                    case 2: 
                        return vehicule.getType();
                    case 3: 
                        return vehicule.getAnneedeconstruction();
                    case 4: 
                        return vehicule.getCarburant();
                    case 5: 
                        return vehicule.getNumImmatr();
                    case 6: 
                        return vehicule.getNbdeplaces();
                    case 7: 
                        return vehicule.getKmactuel();
                        
                    default :
                        return null;
                }
            }
        };
    }
    
}