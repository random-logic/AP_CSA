
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
     * @return the current balance of the bank account
     */
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        balance -= amount;
    }
    
    public void addInterest(double rate) {
        balance *= 1 + rate;
    }
}
