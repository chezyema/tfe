/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.controleur;


import be.isfce.tfe.metier.Chauffeur;
import be.isfce.tfe.validation.ChauffeurValidation;
import be.isfce.tfe.validation.CodePosalValidation;
import be.isfce.tfe.validation.EmailValidation;
import be.isfce.tfe.validation.NumTelValidation;
import be.isfce.tfe.validation.StringValidation;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author yema
 */
public class ChauffeurControleur {
        
    public static void estValide(Chauffeur chauffeur) throws ValidationException{
        
        if(chauffeur == null){
            throw new ValidationException("Le chauffeur est invalide");
        }
        if(chauffeur.getAdresse() == null || StringValidation.VerifString(chauffeur.getAdresse())){
            throw new ValidationException("L'adresse n'est pas valide");
        }
        if(chauffeur.getCodepostale() == 0 || CodePosalValidation.checkCodePostale(null)){
            throw new ValidationException("Le code postal n'est pas valide");
            //ajouter argument
        }
        
        Calendar auj = Calendar.getInstance();
        auj.add(Calendar.YEAR, -21);auj.getTime();
        if(chauffeur.getDateNaissance() == null|| chauffeur.getDateNaissance().before(auj.getTime())){
            throw new ValidationException("Le chauffeur doit avoir plus de 21 ans");
             //ajouter argument
        }
        if(chauffeur.getVille() == null || StringValidation.VerifString(chauffeur.getVille())){
            throw new ValidationException("La ville n'est pas valide");
        }
        if(chauffeur.getEmail() == null || EmailValidation.validateEmailAddress(chauffeur.getEmail())){
            throw new ValidationException("Le email  n'est pas valide");
        }
       
         if(chauffeur.getPrenomChauffeur() == null || StringValidation.VerifString(chauffeur.getPrenomChauffeur())){
         throw new ValidationException("Le prenom n'est pas valide");
        }
         
        if(chauffeur.getNumTelephone() == 0 || NumTelValidation.checkNumTel(null)){
         throw new ValidationException("Le numero de telephone n'est pas valide");
          //ajouter argument
         
        }
        Calendar joura = Calendar.getInstance();
        joura.add(Calendar.DAY_OF_MONTH, +1);joura.getTime();
        if(chauffeur.getSelectionmedicale() == null || chauffeur.getSelectionmedicale().after(joura.getTime())){
        throw new ValidationException("Le date n'est pas valide");
        }
        
        Calendar jourb = Calendar.getInstance();
        jourb.add(Calendar.DAY_OF_MONTH, +1);jourb.getTime();
        if(chauffeur.getValiditercartechauffeur() == null || chauffeur.getValiditercartechauffeur().after(jourb.getTime())){
        throw new ValidationException("Le date n'est pas valide");
        }
        
        Calendar jourc = Calendar.getInstance();
        jourc.add(Calendar.DAY_OF_MONTH, +1);jourc.getTime();
        if(chauffeur.getValiditercap() == null || chauffeur.getValiditercartechauffeur().after(jourc.getTime())){
        throw new ValidationException("Le date n'est pas valide");
        }
         
         if(chauffeur.getId() == 0 || ChauffeurValidation.checkRegistreNational(null) ){
            throw new ValidationException("Le registre national n'est pas valide");
             //ajouter argument
            
        }
}
}