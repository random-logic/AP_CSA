
/**
 * Purpose: To have bank accounts have certain methods and behaviors
 *
 * @author Andrew
 * @version 2019
 */
public class BankAccount
{
    private double balance;
    
    public BankAccount () {}
    
    /**
     * @param init_amount the initial balance of a new bank account
     */
    public BankAccount (double init_amount) {
        balance = init_amount;
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
        balance -= amount;
    }
    
    /**
     * Purpose: Add the amount of interest to the balance
     * @param rate the rate of interest given to the bank account
     */
    public void addInterest(double rate) {
        balance *= 1 + rate;
    }
}
