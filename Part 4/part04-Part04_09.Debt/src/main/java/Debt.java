/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    
    public Debt(double initialBalance, double initialIntrestRate) {
        this.balance = initialBalance;
        this.interestRate = initialIntrestRate;
    }
    public void printBalance() {
        System.out.println(balance);
        
    }
    public void waitOneYear() {
        this.balance = balance * interestRate;         
    }
    
  
  
}
 
