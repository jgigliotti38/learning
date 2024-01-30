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
public class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    //CONSTRUCTORS
    public Circle(double x) {
        radius = x;
    }
    public Circle() {
        radius = 0.0;
    }
    
    //METHODS
    public void setRadius(double x) {
        radius = x;
    }
    public double getRadius() {
        return radius;
    }
    public double area() {
        return PI*radius*radius;
    }
    public double diameter() {
        return radius*2;
    }
    public double circumference() {
        return 2*PI*radius;
    }
}
