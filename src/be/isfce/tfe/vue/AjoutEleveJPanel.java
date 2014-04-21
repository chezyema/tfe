
package be.isfce.tfe.vue;
import be.isfce.tfe.controleur.EleveControleur;
import be.isfce.tfe.controleur.ValidationException;
import be.isfce.tfe.metier.Eleve;
import be.isfce.tfe.db.EleveDBHelper;
import be.isfce.tfe.validation.ChauffeurValidation;
import be.isfce.tfe.validation.CodePosalValidation;
import be.isfce.tfe.validation.EmailValidation;
import be.isfce.tfe.validation.NumTelValidation;
import be.isfce.tfe.validation.StringValidation;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author yema
 */
public class AjoutEleveJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AjoutEleveJPanel
     */
    public AjoutEleveJPanel() {
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

        registrenational = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        nomduresponsable = new javax.swing.JLabel();
        registreNationalTextField = new javax.swing.JTextField();
        nomeleveTextField = new javax.swing.JTextField();
        prenomeleveTextField = new javax.swing.JTextField();
        adresseTextField = new javax.swing.JTextField();
        nomresponsableTextField = new javax.swing.JTextField();
        telephoneresponsable = new javax.swing.JLabel();
        telresponsableTextField = new javax.swing.JTextField();
        emailresponsable = new javax.swing.JLabel();
        emailresponsableTextField = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        enregistreleve = new javax.swing.JButton();
        annulerdonnee = new javax.swing.JButton();
        ville = new javax.swing.JLabel();
        villeTextField = new javax.swing.JTextField();
        cdpostalTextField = new javax.swing.JTextField();
        cdpostale = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eleveDateChooser = new com.toedter.calendar.JDateChooser();

        registrenational.setText("Registre National:");

        nom.setText("Nom:");

        prenom.setText("Prenom:");

        adresse.setText("Adresse:");

        nomduresponsable.setText("Nom du responsable:");

        nomeleveTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeleveTextFieldActionPerformed(evt);
            }
        });

        telephoneresponsable.setText("Telephone responsable:");

        telresponsableTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telresponsableTextFieldActionPerformed(evt);
            }
        });

        emailresponsable.setText("Email responsable:");

        emailresponsableTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailresponsableTextFieldActionPerformed(evt);
            }
        });

        reset.setText("Modifier");

        enregistreleve.setText("Enregistrer");
        enregistreleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistreleveActionPerformed(evt);
            }
        });

        annulerdonnee.setText("Annuler");

        ville.setText("Ville:");

        cdpostale.setText("Code postale:");

        jLabel1.setText("Date de naissance:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registrenational)
                            .addComponent(nom)
                            .addComponent(prenom)
                            .addComponent(adresse)
                            .addComponent(nomduresponsable)
                            .addComponent(telephoneresponsable)
                            .addComponent(ville)
                            .addComponent(cdpostale)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cdpostalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomresponsableTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(telresponsableTextField)
                                    .addComponent(eleveDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(prenomeleveTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(adresseTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(villeTextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeleveTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(registreNationalTextField))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(annulerdonnee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(enregistreleve, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailresponsable)
                                .addGap(68, 68, 68)
                                .addComponent(emailresponsableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrenational)
                    .addComponent(registreNationalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom)
                    .addComponent(nomeleveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom)
                    .addComponent(prenomeleveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(eleveDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdpostale)
                    .addComponent(cdpostalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ville))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomresponsableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomduresponsable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneresponsable)
                    .addComponent(telresponsableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailresponsable)
                    .addComponent(emailresponsableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enregistreleve)
                    .addComponent(annulerdonnee)
                    .addComponent(reset))
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomeleveTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeleveTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeleveTextFieldActionPerformed

    private void telresponsableTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telresponsableTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telresponsableTextFieldActionPerformed

    private void emailresponsableTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailresponsableTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailresponsableTextFieldActionPerformed

    private void enregistreleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistreleveActionPerformed
        // TODO add your handling code here:
         Eleve eleve = new Eleve();
        String registreNational = registreNationalTextField.getText();
      registreNational = registreNational.replace("-", "");
        registreNational = registreNational.replace(".", "");
           
          if (!ChauffeurValidation.checkRegistreNational(registreNational)) {
            //TODO Afficher dialog d'erreur
            //Check a retourné false : Le chauffeur ne peut être créé.
            System.out.println("REGISTRE NATIONAL INCORRECT");
        } else {
          
            //Sinon je peux setté son attribut avec la valeur récupérée.
            eleve.setId(String.valueOf(registreNational));
            System.out.println(registreNational);
        }

        String nomeleve = nomeleveTextField.getText();
        if(!StringValidation.VerifString(nomeleve)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            eleve.setNomEleve(String.valueOf(nomeleve));
            System.out.println(nomeleve);
        }

        String prenomeleve = prenomeleveTextField.getText();
        if(!StringValidation.VerifString(prenomeleve)){
             System.out.println(" PRENOM INCORRECT");}
        else{
            
            eleve.setPrenomEleve(String.valueOf(prenomeleve));
            System.out.println(prenomeleve);
        }
        Date dateNaissance = eleveDateChooser.getDate();
       if(dateNaissance != null){
            eleve.setDatedenaissance(dateNaissance);
            System.out.println(dateNaissance);
        }else{
            System.out.println("DATE NAISSANCE INCORRECTE");
        }
        

        String adresseeleve = adresseTextField.getText();
        eleve.setAdresseEleve(adresseeleve);
        
        String cdpostal = cdpostalTextField.getText();
         if (!CodePosalValidation.checkCodePostale(cdpostal)) {
            
            System.out.println("CODE POSTALE INCORRECT");
        } else {
            eleve.setCdpostal(Integer.valueOf(cdpostal));
            
            System.out.println("CODE POSTALE CORRECT");
            System.out.println(cdpostal);
        }
        
        
        
        
         String ville = villeTextField.getText();
         StringValidation.VerifString(ville);
         eleve.setVil(ville);
          
         String nomresponsable = nomresponsableTextField.getText();
        if(!StringValidation.VerifString(nomresponsable)){
             System.out.println(" NOM INCORRECT");}
        else{
            
            eleve.setNomResponsable(String.valueOf(nomresponsable));
            System.out.println(nomresponsable);
        }
         
          String telresponsable = telresponsableTextField.getText();
          telresponsable = telresponsable.replace("-", "");
          telresponsable = telresponsable.replace(".", "");
          telresponsable = telresponsable.replace("/", "");
          NumTelValidation.checkNumTel(telresponsable);
          eleve.setTelResponsable(Integer.valueOf(telresponsable));
          System.out.println(telresponsable);
          
          String emailresponsable = emailresponsableTextField.getText();
          if (!EmailValidation.validateEmailAddress(emailresponsable)) {
            
            System.out.println("EMAIL INCORRECT");
        } else {
            eleve.setEmailResponsable(String.valueOf(emailresponsable));
            
            System.out.println("EMAIL CORRECT");
            System.out.println(emailresponsable);  
        }
           try {
             EleveControleur.estValide(eleve);
             EleveDBHelper.addEleve(eleve);
             EleveDBHelper.selectEleve(eleve);
            } 
        catch (ValidationException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
           }
      
        
          
         
          
    }//GEN-LAST:event_enregistreleveActionPerformed
                                             
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresse;
    private javax.swing.JTextField adresseTextField;
    private javax.swing.JButton annulerdonnee;
    private javax.swing.JTextField cdpostalTextField;
    private javax.swing.JLabel cdpostale;
    private com.toedter.calendar.JDateChooser eleveDateChooser;
    private javax.swing.JLabel emailresponsable;
    private javax.swing.JTextField emailresponsableTextField;
    private javax.swing.JButton enregistreleve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nomduresponsable;
    private javax.swing.JTextField nomeleveTextField;
    private javax.swing.JTextField nomresponsableTextField;
    private javax.swing.JLabel prenom;
    private javax.swing.JTextField prenomeleveTextField;
    private javax.swing.JTextField registreNationalTextField;
    private javax.swing.JLabel registrenational;
    private javax.swing.JButton reset;
    private javax.swing.JLabel telephoneresponsable;
    private javax.swing.JTextField telresponsableTextField;
    private javax.swing.JLabel ville;
    private javax.swing.JTextField villeTextField;
    // End of variables declaration//GEN-END:variables
}
