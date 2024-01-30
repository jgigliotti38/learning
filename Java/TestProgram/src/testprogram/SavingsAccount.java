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
public class SavingsAccount {
    private final double annualInterest = (0.06/100);
    private double balance;
    
    public SavingsAccount() {
        balance = 500.00;    
    }
    
    public double getBalance() {
        return balance;
    }
    public double monthlyInterest() {
        return (annualInterest/12);
    }
    public void Deposit(double input) {
        balance += input;
    }
    public void Withdrawl(double input) {
        balance -= input;
    }
}
