/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.controleur;

import be.isfce.tfe.metier.UtilisationCarte;
import java.util.Calendar;

/**
 *
 * @author yema
 */
public class UtilisationControleur {
    public static void estValide(UtilisationCarte carte) throws ValidationException{
     Calendar joura = Calendar.getInstance();
        joura.add(Calendar.DAY_OF_MONTH, 0);joura.getTime();
        if(carte.getDateUtilisation() == null || carte.getDateUtilisation() .after(joura.getTime())){
        throw new ValidationException("Le date n'est pas valide");
        }
    
}
}
