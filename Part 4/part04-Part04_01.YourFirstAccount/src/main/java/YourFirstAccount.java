public class YourFirstAccount {
 
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account paulsAccount = new Account("Paul's account", 100.00);
        
        paulsAccount.deposit(20);
            System.out.println("The balance of Pauls's account is now: " + paulsAccount);
        }
    }