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
public class Rainfall {
    private double[] rainAmount;
    
    public Rainfall() {
        double[] rainAmount = new double[12];
    }
    public Rainfall(int x) {
        double[] rainAmount = new double[x];
    }

    public void addRainFall(double value) {
        for (int i = 0; i < rainAmount.length; i++) {
            System.out.println("Enter Value");
            rainAmount[i] = value;
        }
    }
    public double findTotal() {
        double total = 0;
        for (int i = 0; i < rainAmount.length; i++) {
            total+= rainAmount[i];
        }
        return total;
    }
    public double findAverage() {
        return findTotal()/rainAmount.length;
    }
    
}
