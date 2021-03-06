/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.controleur;


import be.isfce.tfe.metier.Ecole;
import be.isfce.tfe.validation.CodePosalValidation;
import be.isfce.tfe.validation.EmailValidation;
import be.isfce.tfe.validation.NumTelValidation;
import be.isfce.tfe.validation.StringValidation;
import java.util.Calendar;

/**
 *
 * @author yema
 */
public class EcoleControlleur {
     public static void estValide(Ecole ecole) throws ValidationException{
        
        if(ecole == null){
            throw new ValidationException("L'ecole est invalide");
        }
        if(ecole.getAdresseecole() == null || ! StringValidation.VerifString(ecole.getAdresseecole())){
            throw new ValidationException("L'adresse n'est pas valide");
        }
        
        if(ecole.getCdpostal() == 0 ){
            throw new ValidationException("Le code postal n'est pas valide");
            
        }
        
      
        if(ecole.getVil() == null || ! StringValidation.VerifString(ecole.getVil())){
            throw new ValidationException("La ville n'est pas valide");
        }
        if(ecole.getEmailecole() == null || ! EmailValidation.validateEmailAddress(ecole.getEmailecole())){
            throw new ValidationException("Le email  n'est pas valide");
        }
       
         if(ecole.getNomecole() == null || ! StringValidation.VerifString(ecole.getNomecole())){
         throw new ValidationException("Le nom de l'ecole n'est pas valide");
        }
         
        if(ecole.getTelecole() == null ){
         throw new ValidationException("Le numero de telephone n'est pas valide");
        
        }
        if(ecole.getNomdirecteur() == null  || ! StringValidation.VerifString(ecole.getNomdirecteur())){
          throw new ValidationException("Le nom du directeur de l'ecole n'est pas valide");
        }
        
        
        }
     }
    


