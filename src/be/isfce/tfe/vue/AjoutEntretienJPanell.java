/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue;


import be.isfce.tfe.controleur.EntretienControleur;
import be.isfce.tfe.controleur.ValidationException;
import be.isfce.tfe.db.EntretienDBHelper;
import be.isfce.tfe.metier.Entretien;
import be.isfce.tfe.validation.StringValidation;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author yema
 */
public class AjoutEntretienJPanell extends javax.swing.JPanel {

    /**
     * Creates new form AjoutEntretienJPanell
     */
    public AjoutEntretienJPanell() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        description = new javax.swing.JLabel();
        kmactuel = new javax.swing.JLabel();
        dateentretien = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        kmactuelTextField = new javax.swing.JTextField();
        ajouter = new javax.swing.JToggleButton();
        modifier = new javax.swing.JToggleButton();
        supprimer = new javax.swing.JToggleButton();
        dateentretienfait = new com.toedter.calendar.JDateChooser();

        description.setText("Description:");

        kmactuel.setText("Kilométrage actuel:");

        dateentretien.setText("Date entretien:");

        ajouter.setText("Enregistrer");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        modifier.setText("Reset");

        supprimer.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateentretien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kmactuel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(kmactuelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateentretienfait, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmactuel)
                    .addComponent(kmactuelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateentretien)
                    .addComponent(dateentretienfait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter)
                    .addComponent(modifier)
                    .addComponent(supprimer))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
        Entretien entretien = new Entretien();
       
        entretien.setId(0);
       
        
        String description = descriptionTextField.getText();
        if(!StringValidation.VerifString(description)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            entretien.setDescription(String.valueOf(description));
            System.out.println(description);
        }
        
        String kmactuel = kmactuelTextField.getText();
        entretien.setKmEntretienFait(Integer.valueOf(kmactuel));
        System.out.println(kmactuel);
        
         Date dateEntretien = dateentretienfait.getDate();
        if(dateEntretien!= null){
            entretien.setDateEntretien(dateEntretien );
            System.out.println(dateEntretien);
        }else{
            System.out.println("DATE ENTRETIEN INCORRECTE");
        } 
        
          try {
             EntretienControleur.estValide(entretien);
            EntretienDBHelper.addEntretien(entretien);
            EntretienDBHelper.selectEntretien(entretien); 
            } 
        catch (ValidationException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
           }
        
        
    }//GEN-LAST:event_ajouterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ajouter;
    private javax.swing.JLabel dateentretien;
    private com.toedter.calendar.JDateChooser dateentretienfait;
    private javax.swing.JLabel description;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel kmactuel;
    private javax.swing.JTextField kmactuelTextField;
    private javax.swing.JToggleButton modifier;
    private javax.swing.JToggleButton supprimer;
    // End of variables declaration//GEN-END:variables
}
