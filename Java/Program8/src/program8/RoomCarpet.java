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
public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;
    
    //CONSTRUCTOR
    public RoomCarpet(RoomDimension dim, double cost) {
        size = dim;
        carpetCost = cost;
    }
    
    public double getTotalCost() {
        return size.getArea()*carpetCost;
    }
    @Override
    public String toString() {
        return size.toString()+"\nCost: "+carpetCost;
    }
}
