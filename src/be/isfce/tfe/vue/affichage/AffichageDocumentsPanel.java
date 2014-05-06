/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.affichage;


import be.isfce.tfe.metier.DocumentsAdministratifs;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yema
 */
public class AffichageDocumentsPanel extends AffichagePanel {

  List<DocumentsAdministratifs> documents;
    
    String[] columnsNames = {"Libelle","Date validiter"};
    
     public AffichageDocumentsPanel() {
        super();
    }
     public void setDocuments(List<DocumentsAdministratifs> documents) {
        this.documents = documents;
    }
    
    public AffichageDocumentsPanel(List<DocumentsAdministratifs> documents) {
        super();
        this.documents = documents;
        displayData();
    }

    
    @Override
    public String getTitrePanel() {
        return "Les documents administratifs";
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
                return documents.size();
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
                DocumentsAdministratifs doc = documents.get(rowIndex);
                switch(columnIndex){
               
                    case 0: 
                        return doc.getLibelle();
                    case 1:
                        return doc.getDateValiditer();
                    
                    
                    default :
                        return null;
                }
            }
        };
    }
    
}