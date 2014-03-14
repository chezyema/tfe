/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue;

import be.isfce.tfe.metier.Circuit;

/**
 *
 * @author yema
 */
public class AjoutCircuitJPanell extends javax.swing.JPanel {

    /**
     * Creates new form AjoutCircuitJPanell
     */
    public AjoutCircuitJPanell() {
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

        identifiant = new javax.swing.JLabel();
        nomoducircuit = new javax.swing.JLabel();
        tempsprevu = new javax.swing.JLabel();
        kmdedepart = new javax.swing.JLabel();
        idcircuitTextField = new javax.swing.JTextField();
        nomcircuitTextField = new javax.swing.JTextField();
        tempsprevuTextField = new javax.swing.JTextField();
        kmdedepartTextField = new javax.swing.JTextField();
        kmdefin = new javax.swing.JLabel();
        kmdefinTextField = new javax.swing.JTextField();
        dateeffectuer6 = new javax.swing.JLabel();
        dateeffectuerTextField = new javax.swing.JTextField();
        enregistercircuit = new javax.swing.JToggleButton();
        modifiercircuit = new javax.swing.JToggleButton();
        supprimercircuit = new javax.swing.JToggleButton();

        identifiant.setText("Identifiant:");

        nomoducircuit.setText("Nom du circuit:");

        tempsprevu.setText("Temps prevu:");

        kmdedepart.setText("Km de depart:");

        kmdefin.setText("Km de fin:");

        dateeffectuer6.setText("Date effectuer:");

        enregistercircuit.setText("Enregistrer");
        enregistercircuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistercircuitActionPerformed(evt);
            }
        });

        modifiercircuit.setText("Reset");
        modifiercircuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifiercircuitActionPerformed(evt);
            }
        });

        supprimercircuit.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identifiant)
                            .addComponent(nomoducircuit)
                            .addComponent(tempsprevu)
                            .addComponent(kmdedepart)
                            .addComponent(kmdefin)
                            .addComponent(dateeffectuer6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kmdefinTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kmdedepartTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tempsprevuTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomcircuitTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                            .addComponent(dateeffectuerTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idcircuitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifiercircuit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(supprimercircuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enregistercircuit, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identifiant)
                    .addComponent(idcircuitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomoducircuit)
                    .addComponent(nomcircuitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempsprevu)
                    .addComponent(tempsprevuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmdedepart)
                    .addComponent(kmdedepartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmdefin)
                    .addComponent(kmdefinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(dateeffectuer6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateeffectuerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addComponent(enregistercircuit)
                .addGap(27, 27, 27)
                .addComponent(modifiercircuit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(supprimercircuit)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modifiercircuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifiercircuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifiercircuitActionPerformed

    private void enregistercircuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistercircuitActionPerformed
        // TODO add your handling code here:
        Circuit circuit = new Circuit();
        String id = idcircuitTextField.getText();
        circuit.setId(Integer.valueOf(id));
        System.out.println(id);
        
         String nomcircuit = nomcircuitTextField.getText();
        if(!VerifString(nomcircuit)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            circuit.setNomCircuit(String.valueOf(nomcircuit));
            System.out.println("NOM CORRECT");
        }
         String tempsprevu = tempsprevuTextField.getText();
         circuit.setTempsPrevu(tempsprevu);
         System.out.println(tempsprevu);
         
         String kmdepart = kmdedepartTextField.getText();
         circuit.setKmDepart(Integer.valueOf(kmdepart));
         System.out.println(kmdepart);
         
         String kmdefin = kmdefinTextField.getText();
         circuit.setKmFin(Integer.valueOf(kmdefin));
         System.out.println(kmdefin);

        
    }//GEN-LAST:event_enregistercircuitActionPerformed

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
    private javax.swing.JLabel dateeffectuer6;
    private javax.swing.JTextField dateeffectuerTextField;
    private javax.swing.JToggleButton enregistercircuit;
    private javax.swing.JTextField idcircuitTextField;
    private javax.swing.JLabel identifiant;
    private javax.swing.JLabel kmdedepart;
    private javax.swing.JTextField kmdedepartTextField;
    private javax.swing.JLabel kmdefin;
    private javax.swing.JTextField kmdefinTextField;
    private javax.swing.JToggleButton modifiercircuit;
    private javax.swing.JTextField nomcircuitTextField;
    private javax.swing.JLabel nomoducircuit;
    private javax.swing.JToggleButton supprimercircuit;
    private javax.swing.JLabel tempsprevu;
    private javax.swing.JTextField tempsprevuTextField;
    // End of variables declaration//GEN-END:variables
}
