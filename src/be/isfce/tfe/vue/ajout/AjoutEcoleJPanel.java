/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.vue.ajout;
import be.isfce.tfe.controleur.ChauffeurControleur;
import be.isfce.tfe.controleur.EcoleControlleur;
import be.isfce.tfe.controleur.ValidationException;
import be.isfce.tfe.db.ChauffeurDBHelper;
import be.isfce.tfe.db.EcoleDBHelper;
import be.isfce.tfe.metier.Ecole;
import be.isfce.tfe.validation.CodePosalValidation;
import be.isfce.tfe.validation.EmailValidation;
import be.isfce.tfe.validation.NumTelValidation;
import be.isfce.tfe.validation.StringValidation;
import javax.swing.JOptionPane;


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

        nomecole = new javax.swing.JLabel();
        adresseecole = new javax.swing.JLabel();
        telephoneecole = new javax.swing.JLabel();
        emailecole = new javax.swing.JLabel();
        nomdirecteur = new javax.swing.JLabel();
        nomecoleTextField = new javax.swing.JTextField();
        adresseTextField = new javax.swing.JTextField();
        telTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        nomdirecteurTextField = new javax.swing.JTextField();
        enregistrerecole = new javax.swing.JButton();
        annulerecole = new javax.swing.JButton();
        modifierecole = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cdpostalTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vilTextField = new javax.swing.JTextField();

        nomecole.setText("Nom ecole:");

        adresseecole.setText("Adresse:");

        telephoneecole.setText("Telephone:");

        emailecole.setText("Email:");

        nomdirecteur.setText("Nom directeur:");

        enregistrerecole.setText("Enregistrer");
        enregistrerecole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerecoleActionPerformed(evt);
            }
        });

        annulerecole.setText("Annuler");

        modifierecole.setText("Modifier");

        jLabel1.setText("Code postal:");

        jLabel2.setText("Ville:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(adresseTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(nomecoleTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(cdpostalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomecole)
                    .addComponent(adresseecole)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(annulerecole, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telephoneecole)
                                .addComponent(emailecole)
                                .addComponent(nomdirecteur)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vilTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(telTextField)
                                    .addComponent(emailTextField)
                                    .addComponent(nomdirecteurTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(modifierecole)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(enregistrerecole)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomecole)
                    .addComponent(nomecoleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresseecole)
                    .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cdpostalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneecole)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailecole)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomdirecteur)
                    .addComponent(nomdirecteurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enregistrerecole)
                    .addComponent(modifierecole)
                    .addComponent(annulerecole))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enregistrerecoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerecoleActionPerformed
        // TODO add your handling code here:
         Ecole ecole = new Ecole();
        
        ecole.setId(0);
       
        
         String nomecole = nomecoleTextField.getText();
        if(!StringValidation.VerifString(nomecole)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            ecole.setNomecole(String.valueOf(nomecole));
            System.out.println("NOM CORRECT");
        }
        String adresseecole = adresseTextField.getText();
        ecole.setAdresseecole(adresseecole);
        System.out.println(adresseecole);
        
        
         String cdpostal = cdpostalTextField.getText();
         if (!CodePosalValidation.checkCodePostale(cdpostal)) {
            
            System.out.println("CODE POSTALE INCORRECT");
        } else {
            ecole.setCdpostal(Integer.valueOf(cdpostal));
            
            System.out.println("CODE POSTALE CORRECT");
            System.out.println(cdpostal);
        }
        
        
        
        
         String ville = vilTextField.getText();
         StringValidation.VerifString(ville);
         ecole.setVil(ville);
          
        
         String numtel = telTextField.getText();
          NumTelValidation.checkNumTel(numtel);
          numtel = numtel.replace("-", "");
          numtel = numtel.replace(".", "");
          numtel = numtel.replace("/", "");
          
          ecole.setTelecole(String.valueOf(numtel));
          System.out.println(numtel);
          
           String email = emailTextField.getText();
             if (!EmailValidation.validateEmailAddress(email)) {
            
            System.out.println("EMAIL INCORRECT");
        } else {
            ecole.setEmailEcole(String.valueOf(email));
            
            System.out.println("EMAIL CORRECT");
            System.out.println(email);  
                }
           
            String nomdirecteur = nomdirecteurTextField.getText();
                 if(!StringValidation.VerifString(nomdirecteur)){
                 System.out.println(" NOM INCORRECT");}
            else{
            
                ecole.setNomdirecteur(String.valueOf(nomdirecteur));
                System.out.println(nomdirecteur);
                }
                 
           
        
           try {
            EcoleControlleur.estValide(ecole);
            EcoleDBHelper.addEcole(ecole);
            EcoleDBHelper.getTousLesEcoles();
            
            } 
        catch (ValidationException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            
           }
         
        
    }//GEN-LAST:event_enregistrerecoleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresseTextField;
    private javax.swing.JLabel adresseecole;
    private javax.swing.JButton annulerecole;
    private javax.swing.JTextField cdpostalTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailecole;
    private javax.swing.JButton enregistrerecole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton modifierecole;
    private javax.swing.JLabel nomdirecteur;
    private javax.swing.JTextField nomdirecteurTextField;
    private javax.swing.JLabel nomecole;
    private javax.swing.JTextField nomecoleTextField;
    private javax.swing.JTextField telTextField;
    private javax.swing.JLabel telephoneecole;
    private javax.swing.JTextField vilTextField;
    // End of variables declaration//GEN-END:variables
}
