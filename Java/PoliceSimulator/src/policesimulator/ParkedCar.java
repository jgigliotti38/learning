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
public class ParkedCar {
    private String make;
    private int model;
    private String color;
    private int licenseNumber;
    protected int minutes;
    
    //CONSTRUCTOR
    public ParkedCar(String make,int model,
    String color,int licenseNumber,int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutes = minutesParked;
    }
    
    @Override
    public String toString() {
        return "Make: "+this.make+"\nModel:"+this.model+"\nColor: "+
                this.color+"\nLicense Number: "+this.licenseNumber+
                "\nMinutes Parked: "+this.minutes;
    }
}
