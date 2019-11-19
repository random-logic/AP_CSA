/**
 * Purpose: To have bank accounts have certain methods and behaviors
 *
 * @author Andrew
 * @version 2019
 */

public class BankAccount
{
    private static int lastAcctID = 0;
    private int acctID;
    private double balance;
    
    /**
     * Constructs a new bank account with an initial value of 0
     */
    public BankAccount () {
        balance = 0;
        lastAcctID++;
        acctID = lastAcctID;
    }
    
    /**
     * Constructs a new bank account with an initial balance of a given value
     * @param init_amount the initial balance of a new bank account
     */
    public BankAccount (double init_amount) {
        balance = init_amount;
        lastAcctID++;
        acctID = lastAcctID;
    }
    
    /**
     * Purpose: Get the current balance
     * @return the current balance of the bank account
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Purpose: Add money to the balance
     * @param amount the amount to deposit to balance
     */
    public void deposit(double amount) {
        balance += amount;
    }
    
    /**
     * Purpose: Subtract money from the balance
     * @param amount the amount to withdraw from balance
     */
    public void withdraw(double amount) {
        if (balance < amount)
            balance -= 35;
        else
            balance -= amount;
    }
    
    /**
     * Purpose: Add the amount of interest to the balance
     * @param rate the rate of interest given to the bank account
     */
    public void addInterest(double rate) {
        balance *= 1 + rate;
    }

    /**
     * Purpose: Get the account ID
     * @return The account ID
     */
    public int getAcctID() {
        return acctID;
    }

    /**
     * Purpose: Test the bank account class
     */
    public static void main () {
        BankAccount account = new BankAccount(200);
        BankAccount account2 = new BankAccount(300);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 200");
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Expected: 300");
        
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 1200");
        account2.deposit(500);
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Expected: 800");
        
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 700");
        account2.withdraw(1000);
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Expected: 765");
        
        account.addInterest(0.1);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 770");
        account2.addInterest(0.2);
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Expected: 918");
    }
}
