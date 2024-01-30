/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program8;

/**
 *
 * @author giggysmalls
 */
public class Area {

    public static double getArea(int radius, double pi) {
        return pi*radius*radius;
    }
    public static double getArea(int width, int height) {
        return width*height;
    }
    public static double getArea(int radius, int height, double pi) {
        return pi*radius*radius*height;
    }
}
