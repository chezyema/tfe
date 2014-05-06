/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.metier.Eleve;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageElevePanel extends AffichagePanel{

      List<Eleve> eleves;
    
    String[] columnsNames = {"Registre national","Nom","Prénom","Date de Naissance","Adresse","Code Postal","Ville","Nom du responsable","telephone du responsable","Email du responsable"};
    
    
    public AffichageElevePanel() {
        super();
    }

    public void setEleve(List<Eleve> eleves) {
        this.eleves = eleves;
    }
    
    public AffichageElevePanel(List<Eleve> eleves) {
        super();
        this.eleves = eleves;
        displayData();
    }

    @Override
    public String getTitrePanel() {
        return "Les Eleves";
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
                return eleves.size();
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
                Eleve eleve = eleves.get(rowIndex);
                switch(columnIndex){
                    case 0: 
                        return eleve.getId();
                    case 1: 
                        return eleve.getNomEleve();
                    case 2: 
                        return eleve.getPrenomEleve();
                    case 3: 
                        return eleve.getDatedenaissance();
                    case 4: 
                        return eleve.getAdresseEleve();
                    case 5: 
                        return eleve.getCdpostal();
                    case 6: 
                        return eleve.getVil();
                    case 7: 
                        return eleve.getNomResponsable();
                    case 8:
                        return eleve.getTelResponsable();
                    case 9:
                        return eleve.getEmailResponsable();
                    default :
                        return null;
                }
            }
        };
    }
    
}