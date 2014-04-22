/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.controleur;


import be.isfce.tfe.metier.DocumentsAdministratifs;
import be.isfce.tfe.validation.StringValidation;
import java.util.Calendar;

/**
 *
 * @author yema
 */
public class DocumentsAdministratifsControleur {
     public static void estValide(DocumentsAdministratifs documents) throws ValidationException{
        
        if(documents == null){
            throw new ValidationException("Le document est invalide");
        }
        if(documents.getLibelle() == null || !StringValidation.VerifString(documents.getLibelle())){
            throw new ValidationException("le  libelle n'est pas valide");
        }
        Calendar joura = Calendar.getInstance();
        joura.add(Calendar.DAY_OF_MONTH, +1);joura.getTime();
        if(documents.getDateValiditer() == null || documents.getDateValiditer().after(joura.getTime())){
        throw new ValidationException("Le date n'est pas valide");
        }
        
    
}
    
}
