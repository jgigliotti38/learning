/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram;

/**
 *
 * @author giggysmalls
 */
public class Car {
    //FIELDS
    private int yearModel;
    private String make;
    private int speed;
    
    //CONSTRUCTORS
    public Car (int x, String str) {
        yearModel = x;
        make = str;
        speed = 0;
    }
    //ACCESOR METHODS
    public int getYearModel() {
        return yearModel;
    }
    public String getMake() {
        return make;
    }
    public int getSpeed() {
        return speed;
    }
    //ACCELERATE and BRAKE METHODS
    public void Accelerate() {
        speed += 5;
    }
    public void Brake() {
        speed -= 5;
    }
    
}
