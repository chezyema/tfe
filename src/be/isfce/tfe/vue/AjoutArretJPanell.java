/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue;

import be.isfce.tfe.metier.Arret;

/**
 *
 * @author yema
 */
public class AjoutArretJPanell extends javax.swing.JPanel {

    /**
     * Creates new form AjoutArretJPanell
     */
    public AjoutArretJPanell() {
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

        idarret = new javax.swing.JLabel();
        adressearret = new javax.swing.JLabel();
        ajouterarret = new javax.swing.JButton();
        supprimerarret = new javax.swing.JButton();
        idarretTextField = new javax.swing.JTextField();
        adressearretTextField = new javax.swing.JTextField();
        modifierarret = new javax.swing.JButton();

        idarret.setText("Identifiant Arret: ");

        adressearret.setText("Adresse arret:");

        ajouterarret.setText("Enregistrer");
        ajouterarret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterarretActionPerformed(evt);
            }
        });

        supprimerarret.setText("Annuler");

        modifierarret.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idarret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adressearret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idarretTextField)
                            .addComponent(adressearretTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ajouterarret, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(supprimerarret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(modifierarret, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idarret)
                    .addComponent(idarretTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressearret)
                    .addComponent(adressearretTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterarret)
                    .addComponent(supprimerarret))
                .addGap(31, 31, 31)
                .addComponent(modifierarret))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterarretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterarretActionPerformed
    
        
        // TODO add your handling code here:
        Arret arret = new Arret();
        String idarret = idarretTextField.getText();
        arret.setId(Integer.valueOf(idarret));
        System.out.println(idarret);
        
        String adressearret = adressearretTextField.getText();
        arret.setAdresse(adressearret);
        System.out.println(adressearret);
         
        
    }//GEN-LAST:event_ajouterarretActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressearret;
    private javax.swing.JTextField adressearretTextField;
    private javax.swing.JButton ajouterarret;
    private javax.swing.JLabel idarret;
    private javax.swing.JTextField idarretTextField;
    private javax.swing.JButton modifierarret;
    private javax.swing.JButton supprimerarret;
    // End of variables declaration//GEN-END:variables
}
