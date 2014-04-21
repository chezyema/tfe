/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.controleur;

import be.isfce.tfe.metier.Arret;
import be.isfce.tfe.validation.StringValidation;

/**
 *
 * @author yema
 */
public class ArretControleur {
    
    public static void estValide(Arret arret) throws ValidationException{
        if(!(arret != null && arret.getAdresse() != null && StringValidation.VerifString(arret.getAdresse()))){
            throw new ValidationException("L'addresse n'est pas valide");
        }
    }
    
}
