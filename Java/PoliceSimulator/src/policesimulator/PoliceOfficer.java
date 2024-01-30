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

public class PoliceOfficer {
    private String name;
    private int badgeNumber;
    //private ParkingTicket parkingTicket;
    private ParkedCar parkedCar;
    private ParkingMeter parkingMeter;
      
    public PoliceOfficer(String name,int badgeNumber) {
        this.name=name;
        this.badgeNumber=badgeNumber;
    }
    //TESTS TO SEE IF CAR METER EXPIRED
    public void carInspection(ParkedCar input1,ParkingMeter input2) {
        this.parkedCar=input1;
        this.parkingMeter=input2;
        
        if(parkedCar.minutes-parkingMeter.minutes >=0) {
            ParkingTicket ticket = new ParkingTicket();
            ticket.issueTicket(parkedCar, parkingMeter, this);
        }
        else
            System.out.println("NO TICKET ISSUED");
    }
            
    @Override
    public String toString() {
        return "Officer Name: "+name+"\nBadge Number: "+this.badgeNumber;
    }
}
