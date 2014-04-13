/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue;
import be.isfce.tfe.db.TestUtlisationCarte;
import be.isfce.tfe.metier.UtilisationCarte;
import java.util.Date;

/**
 *
 * @author yema
 */
public class InsertionCarteUtilisationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsertionCarteUtilisationJPanel
     */
    public InsertionCarteUtilisationJPanel() {
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

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        dateutiliqation = new javax.swing.JLabel();
        enregistrer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        idutilisation = new javax.swing.JLabel();
        idutilisationTextField = new javax.swing.JTextField();
        datecarteutilisation = new com.toedter.calendar.JDateChooser();

        dateutiliqation.setText("Date utilisation:");

        enregistrer.setText("Enregistrer");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        jButton1.setText("Annuler");

        idutilisation.setText("Numero de transaction:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enregistrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idutilisation)
                    .addComponent(dateutiliqation))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecarteutilisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idutilisationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idutilisation)
                    .addComponent(idutilisationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateutiliqation)
                    .addComponent(datecarteutilisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(enregistrer)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
       UtilisationCarte utilisationcarte = new UtilisationCarte();
       
         String id = idutilisationTextField.getText();
        utilisationcarte.setIdutilisationcarte(0);
        System.out.println(id);
        
        Date dateUtilisationcarte = datecarteutilisation.getDate();
        if(dateUtilisationcarte!= null){
          utilisationcarte.setDateutilisation(dateUtilisationcarte);
            System.out.println(dateUtilisationcarte);
        }else{
            System.out.println("DATE UTILISATION  INCORRECTE");
        } 
         TestUtlisationCarte.addUtilisationCarte(utilisationcarte );
        // TestUtlisationCarte.selectUtilisationCarte(utilisationcarte);
    }//GEN-LAST:event_enregistrerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datecarteutilisation;
    private javax.swing.JLabel dateutiliqation;
    private javax.swing.JButton enregistrer;
    private javax.swing.JLabel idutilisation;
    private javax.swing.JTextField idutilisationTextField;
    private javax.swing.JButton jButton1;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    // End of variables declaration//GEN-END:variables
}
