
/**
 * Write a description of class BankAccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class BankAccountTester
{
    public static void main (String[] args) {
        BankAccount account = new BankAccount(200);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 200");
        
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 1200");
        
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 700");
        
        account.addInterest(0.1);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 770");
    }
}
