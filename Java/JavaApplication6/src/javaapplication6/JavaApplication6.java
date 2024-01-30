/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author giggysmalls
 */
import java.util.*;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double[] prices = new double[20];
        double sum = 0;
        double average;
        
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter Value:\n");
            prices[i] = scan.nextDouble();
        }
        System.out.println("DONE\n************************\n");
        
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        System.out.println("\nSum of Values = " + sum);
        average = sum/prices.length;
        System.out.println("\nAverage of Values = "+average);
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 5) {
                System.out.println(prices[i]+" is less than 5.0");
            } 
        }
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > average) {
                System.out.println(prices[i]+" is greater than the average");
            } 
        }
        
        
        
    }
    
}
