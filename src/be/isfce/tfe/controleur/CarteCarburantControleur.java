/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.controleur;
import be.isfce.tfe.metier.CarteCarburant;


/**
 *
 * @author yema
 */
public class CarteCarburantControleur {
    
       public static void estValide(CarteCarburant cartecarburant) throws ValidationException{
        
        if(cartecarburant == null){
            throw new ValidationException("La carte est invalide");
        }
        if(cartecarburant.getId() == 0){
            throw new ValidationException("La carte n'est pas valide");
        }
          if(cartecarburant.getKmUtilisation() == 0 ){
            throw new ValidationException("Le kilométrage n'est pas valide");
        }
           if(cartecarburant.getLitreCarburant() == 0 ){
            throw new ValidationException("Les litres de carburant ne sont pas valide");
        }
        
    
}
    }

