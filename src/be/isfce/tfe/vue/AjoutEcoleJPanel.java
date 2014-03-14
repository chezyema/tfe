/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue;

import be.isfce.tfe.metier.Ecole;

/**
 *
 * @author yema
 */
public class AjoutEcoleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AjoutEcoleJPanel
     */
    public AjoutEcoleJPanel() {
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

        identifiantecole = new javax.swing.JLabel();
        nomecole = new javax.swing.JLabel();
        adresseecole = new javax.swing.JLabel();
        telephoneecole = new javax.swing.JLabel();
        emailecole = new javax.swing.JLabel();
        nomdirecteur = new javax.swing.JLabel();
        annescolaire = new javax.swing.JLabel();
        idecoleTextField = new javax.swing.JTextField();
        nomecoleTextField = new javax.swing.JTextField();
        adresseTextField = new javax.swing.JTextField();
        telTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        nomdirecteurTextField = new javax.swing.JTextField();
        anneescolaireTextField = new javax.swing.JTextField();
        enregistrerecole = new javax.swing.JButton();
        annulerecole = new javax.swing.JButton();
        resetecole = new javax.swing.JButton();

        identifiantecole.setText("Identifiant ecole:");

        nomecole.setText("Nom ecole:");

        adresseecole.setText("Adresse:");

        telephoneecole.setText("Telephone:");

        emailecole.setText("Email:");

        nomdirecteur.setText("Nom directeur:");

        annescolaire.setText("Annee scolaire:");

        enregistrerecole.setText("Enregistrer");
        enregistrerecole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerecoleActionPerformed(evt);
            }
        });

        annulerecole.setText("Annuler");

        resetecole.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetecole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enregistrerecole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(annulerecole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identifiantecole)
                            .addComponent(nomecole)
                            .addComponent(adresseecole)
                            .addComponent(telephoneecole)
                            .addComponent(emailecole)
                            .addComponent(nomdirecteur)
                            .addComponent(annescolaire))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idecoleTextField)
                            .addComponent(nomecoleTextField)
                            .addComponent(adresseTextField)
                            .addComponent(telTextField)
                            .addComponent(emailTextField)
                            .addComponent(nomdirecteurTextField)
                            .addComponent(anneescolaireTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identifiantecole)
                    .addComponent(idecoleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomecole)
                    .addComponent(nomecoleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresseecole)
                    .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneecole)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailecole)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomdirecteur)
                    .addComponent(nomdirecteurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annescolaire)
                    .addComponent(anneescolaireTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(enregistrerecole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerecole)
                    .addComponent(resetecole))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enregistrerecoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerecoleActionPerformed
        // TODO add your handling code here:
        Ecole ecole = new Ecole();
        String idecole = idecoleTextField.getText();
        ecole.setId(Integer.valueOf(idecole));
        System.out.println(idecole);
        
         String nomecole = nomecoleTextField.getText();
        if(!VerifString(nomecole)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            ecole.setNomecole(String.valueOf(nomecole));
            System.out.println("NOM CORRECT");
        }
        String adresseecole = adresseTextField.getText();
        ecole.setAdresseecole(adresseecole);
        System.out.println(adresseecole);
        
         String numtel = telTextField.getText();
          checkNumTel(numtel);
          numtel = numtel.replace("-", "");
          numtel = numtel.replace(".", "");
          numtel = numtel.replace("/", "");
          ecole.setTelecole(Integer.valueOf(numtel));
          System.out.println(numtel);
          
           String email = emailTextField.getText();
           ecole.setEmailecole(email);
           System.out.println(email);
           
            String nomdirecteur = nomdirecteurTextField.getText();
        if(!VerifString(nomdirecteur)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            ecole.setNomDirecteur(String.valueOf(nomdirecteur));
            System.out.println(nomdirecteur);
        }
          String anneescolaire = anneescolaireTextField.getText();
        ecole.setAnneescolaire(anneescolaire);
        System.out.println(anneescolaire);
        
          
 
    
    }//GEN-LAST:event_enregistrerecoleActionPerformed
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
  private boolean checkNumTel(String numtel) {

        if (numtel == null || numtel.isEmpty()) {
            System.out.println("veuillez inserer une donnée svp");
            return false;
        }
        if (numtel.length() != 9 || numtel.length()!= 10 ) {
            System.out.println("veuillez introduire le bon format");
            return false;
        }
        try {
            Long.valueOf(numtel);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            e.printStackTrace();
            return false;
        }
        return true;



    }                                                    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresseTextField;
    private javax.swing.JLabel adresseecole;
    private javax.swing.JTextField anneescolaireTextField;
    private javax.swing.JLabel annescolaire;
    private javax.swing.JButton annulerecole;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailecole;
    private javax.swing.JButton enregistrerecole;
    private javax.swing.JTextField idecoleTextField;
    private javax.swing.JLabel identifiantecole;
    private javax.swing.JLabel nomdirecteur;
    private javax.swing.JTextField nomdirecteurTextField;
    private javax.swing.JLabel nomecole;
    private javax.swing.JTextField nomecoleTextField;
    private javax.swing.JButton resetecole;
    private javax.swing.JTextField telTextField;
    private javax.swing.JLabel telephoneecole;
    // End of variables declaration//GEN-END:variables
}
