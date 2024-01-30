/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policesimulator;

/**
 *
 * @author giggysmalls
 */
import java.util.*;
public class PoliceSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //OFFICER INFORMATION
        String name = "Josh Gigliotti";
        int badgeNumber = 12345;
        PoliceOfficer officer = new PoliceOfficer(name,badgeNumber);
        //PARKED CAR INFORMATION
        String make = "Honda Civic";
        int model = 1998;
        String color = "Gray";
        int licenseNumber = 9898987;
        int parkedMinutes;
        
        //METER INFORMATION
        int purchasedMinutes = 120;
        
        //USER INPUT FOR PARKED MINUTES
        System.out.println("Enter Minutes Parked: ");
        parkedMinutes = scan.nextInt();
        
        ParkedCar parkedCar = new ParkedCar(make,model,color,licenseNumber,parkedMinutes);
        ParkingMeter parkingMeter = new ParkingMeter(purchasedMinutes);
        
        //WRITES UP TICKET IF CAR PARKING IS EXPIRED
        officer.carInspection(parkedCar, parkingMeter);
        
    }  
        
        
        
        
    
}
