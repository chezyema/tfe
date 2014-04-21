/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.isfce.tfe.db;
import be.isfce.tfe.metier.Circuit;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author yema
 */
public class CircuitDBHelper {
    
      private static CircuitDBHelper uniqueInstance = new CircuitDBHelper ();

    public static CircuitDBHelper  getInstance() {
        return uniqueInstance;
    }

    
 public static boolean addCircuit(Circuit circuit){
        
        try{
            System.out.println(circuit.toString());
            Date dateSql = new Date(circuit.getDateCircuit().getTime());
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("Insert into circuit (idcircuit,nomcircuit,tempsprevu,kmdepart,kmfin,datecircuit) values ( ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, circuit.getId());
            preparedStatement.setString(2, circuit.getNomCircuit());
            preparedStatement.setString(3,circuit.getTempsPrevu());
            preparedStatement.setInt(4,circuit.getKmDepart());
            preparedStatement.setInt(5,circuit.getKmFin());
            preparedStatement.setDate(6, dateSql);
            preparedStatement.executeUpdate();
            Connexion.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
}
      public static boolean selectCircuit(Circuit circuit){
        
        try{
            PreparedStatement preparedStatement = Connexion.getInstance().getConn().prepareStatement("select * from circuit");
           
             preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
}
}
