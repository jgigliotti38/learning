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
import java.util.*;
import java.io.*;
public class TestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        File deposit = new File("/Users/giggysmalls/Documents/Deposits.txt");
        File withdrawl = new File("/Users/giggysmalls/Documents/Withdrawls.txt");
        SavingsAccount SA = new SavingsAccount();
        
        try {
            Scanner depositFile = new Scanner(deposit);
            Scanner withdrawlFile = new Scanner(withdrawl);
            
            System.out.println("\n*****DEPOSITS*****\n");
            while (depositFile.hasNext()) {
                double input = depositFile.nextDouble();
                System.out.println("$"+input);
                SA.Deposit(input); 
            }
            System.out.println("\n*****WITHDRAWLS*****\n");
            while (withdrawlFile.hasNext()) {
                double input = withdrawlFile.nextDouble();
                System.out.println("$"+input);
                SA.Withdrawl(input);
            }
            depositFile.close();
            withdrawlFile.close();
        } 
        catch (IOException e) {
           System.out.println("File Not Found");     
        }
        
        System.out.println("\nMONTHLY INTEREST = $"+SA.monthlyInterest()*SA.getBalance());
        System.out.println("ENDING BALANCE = $"+(SA.getBalance()+SA.monthlyInterest()));
    }
    
}
