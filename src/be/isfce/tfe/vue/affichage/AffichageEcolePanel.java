/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.metier.Ecole;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageEcolePanel  extends AffichagePanel{


     List<Ecole> ecoles;
    
    String[] columnsNames = {"Nom ecole","Adresse ecole","Code postal","Ville"," Telephone","email","Nom du directeur","Annee scolaire"};
    
     public AffichageEcolePanel() {
        super();
    }
     public void setEcole(List<Ecole> ecoles) {
        this.ecoles = ecoles;
    }
    
    public AffichageEcolePanel(List<Ecole> etablissement) {
        super();
        this.ecoles = etablissement;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "les Etablissements";
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
                return ecoles.size();
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
                Ecole ecole = ecoles.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return ecole.getNomecole();
                    case 1:
                        return ecole.getAdresseecole();
                    case 2:
                        return ecole.getCdpostal();
                    case 3:
                        return ecole.getVil();
                    case 4:
                        return ecole.getTelecole();
                    case 5:
                        return ecole.getEmailecole();
                    case 6:
                        return ecole.getNomdirecteur();
                    case 7:
                        return ecole.getAnneescolaire();
                            
                    
                    default :
                        return null;
                }
            }
        };
    }
    
}