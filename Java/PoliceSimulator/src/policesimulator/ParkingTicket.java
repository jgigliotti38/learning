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
public class ParkingTicket {
    private ParkedCar parkedCar;
    private ParkingMeter parkingMeter;
    private PoliceOfficer officer;
    private double fine;
    
    //ISSUES A TICKET BASED ON CAR AND METER INFORMATION
    public void issueTicket(ParkedCar input1,ParkingMeter input2,PoliceOfficer input3) {
        parkedCar = input1;
        parkingMeter = input2;
        officer = input3;
        
        System.out.println("Ticket ISSUED!\n");
        getOfficer();
        getCar();
        getFine();
    }
     //GETS CAR INFORMATION       
    public void getCar() {
        System.out.println(parkedCar.toString());
    }
    //GETS OFFICER INFORMATION
    public void getOfficer() {
        System.out.println(officer.toString());
    }
    //RETRIEVES FINE
    public void getFine() {
        int timeExpired = (parkedCar.minutes-parkingMeter.minutes);
        fine = 25;
        while ((timeExpired-60)>0) {
            fine+=10;
            timeExpired-=60;
        }
        System.out.println("Your Fine is: $"+fine);
    }
    
    

}
