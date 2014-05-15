/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.controleur;

import be.isfce.tfe.metier.Trajets;
import be.isfce.tfe.metier.UtilisationCarte;
import java.util.Calendar;

/**
 *
 * @author yema
 */
public class HeureDeTravailControleur {
       public static void estValide(Trajets heure) throws ValidationException{
        Calendar joura = Calendar.getInstance();
        joura.add(Calendar.HOUR, 0);joura.getTime();
        //if( == null || heure.getHeureDeDebut(joura.getTime())){
        throw new ValidationException("Le date n'est pas valide");
        }
    
}

