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
public class RoomDimension {
    private int length;
    private int width;
    
    //Constructor
    public RoomDimension(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public int getArea() {
        return length*width;
    }
    @Override 
    public String toString() {
        return "Room Dimension: "+this.length+" x "+this.width;
    }
    
}
