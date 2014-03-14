/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue;


import be.isfce.tfe.metier.Entretien;

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

        identretien = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        kmactuel = new javax.swing.JLabel();
        dateentretien = new javax.swing.JLabel();
        identretienTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        kmactuelTextField = new javax.swing.JTextField();
        dateentretienTextField = new javax.swing.JTextField();
        ajouter = new javax.swing.JToggleButton();
        modifier = new javax.swing.JToggleButton();
        supprimer = new javax.swing.JToggleButton();

        identretien.setText("Identifiant Entretien:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(identretien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kmactuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateentretien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(identretienTextField)
                            .addComponent(descriptionTextField)
                            .addComponent(kmactuelTextField)
                            .addComponent(dateentretienTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identretien)
                    .addComponent(identretienTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmactuel)
                    .addComponent(kmactuelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateentretien)
                    .addComponent(dateentretienTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter)
                    .addComponent(modifier)
                    .addComponent(supprimer))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
        Entretien entretien = new Entretien();
        String identretien = identretienTextField.getText();
        entretien.setId(Integer.valueOf(identretien));
        System.out.println(identretien);
        
          String description = descriptionTextField.getText();
        if(!VerifString(description)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            entretien.setDescription(String.valueOf(description));
            System.out.println(description);
        }
        
        String kmactuel = kmactuelTextField.getText();
        entretien.setKmEntretienFait(Integer.valueOf(kmactuel));
        System.out.println(kmactuel);
        

        
    }//GEN-LAST:event_ajouterActionPerformed
private boolean VerifString(String caractere) {
        if (caractere == null || caractere.isEmpty()) {
            System.out.println("veuillez inserer une donnée svp");
            return false;
        }
        for (int i = 0; i < caractere.length(); i++) {
            if (caractere.charAt(i) == '1' || caractere.charAt(i) == '2' || caractere.charAt(i) == '3' || caractere.charAt(i) == '4'
                    || caractere.charAt(i) == '5' || caractere.charAt(i) == '6' || caractere.charAt(i) == '7' || caractere.charAt(i) == '8'
                    || caractere.charAt(i) == '9' || caractere.charAt(i) == '0') {
                System.out.println("veuillez rentrer une donnée correcte");

                return false;
            }
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ajouter;
    private javax.swing.JLabel dateentretien;
    private javax.swing.JTextField dateentretienTextField;
    private javax.swing.JLabel description;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel identretien;
    private javax.swing.JTextField identretienTextField;
    private javax.swing.JLabel kmactuel;
    private javax.swing.JTextField kmactuelTextField;
    private javax.swing.JToggleButton modifier;
    private javax.swing.JToggleButton supprimer;
    // End of variables declaration//GEN-END:variables
}
