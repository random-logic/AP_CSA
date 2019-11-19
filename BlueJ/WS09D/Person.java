/**
 * Purpose:
 * @author Andrew
 * @version 2019
 */

public class Person {
  private String name;
  private String email;
  private double cash;
  private BankAccount bank;

  /**
   * Purpose: Constructor
   * @param name The name of the person
   */
  public Person(String name) {
    this.name = name;
    this.email = "";
    this.cash = 0;
  }

  /**
   * Purpose: Constructor
   * @param name The name of the person
   * @param email The person's email address
   * @param cash The amount of cash the person has
   */
  public Person(String name, String email, double cash) {
    this.name = name;
    this.email = email;
    this.cash = cash;
  }

  /**
   * Purpose: Get the name of the person
   * @return The name of the person
   */
  public String getName() {
    return name;
  }

  /**
   * Purpose: Get the person's email
   * @return The person's email
   */
  public String getEmailAddrs() {
    return email;
  }

  /**
   * Purpose: Get how much money the person has (pocket money + bank account combined)
   * @return The amount of money the person has
   */
  public double getMoneyAmt() {
    double return_amt;

    if (bank != null)
      return_amt = cash + bank.getBalance();
    else
      return_amt = cash;
    
    return return_amt;
  }

  /**
   * Purpose: Update the email of the user
   * @param email The new email address of the user
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Purpose: Add an amount of cash to the person's money
   * @param cash The amount of cash to add
   */
  public void addMoney(double cash) {
    this.cash += cash;
  }

  /**
   * Purpose: Open a new bank account for this person
   */
  public void openBankAccount() {
    bank = new BankAccount();
  }

  /**
   * Purpose: Transfer pocket money into the bank account
   * @param amount The amount to transfer
   */
  public void transferToBankAcct(double amount) {
    if (bank != null) {
      cash -= amount;
      bank.deposit(amount);
    }
  }

  public String toString() {
    String return_str;
    if (bank != null)
      return_str = "Person: " + name + ", Email: " + email + ", Pocket Money: " + cash + ", Bank Account ID: " + bank.getAcctID() + ", Bank Account: " + bank.getBalance() + ", Total Money: " + (cash + bank.getBalance());
    else
      return_str = "Person: " + name + ", Email: " + email + ", Pocket Money: " + cash + ", No Bank Account Created";

    return return_str;
  }

  /**
   * Purpose: Test the class
   */
  public static void main() {
    Person person1 = new Person ("James", "hornyjames@email.com", 0);
    Person person2 = new Person ("Sam", "fatBs@email.com", 0);

    System.out.println("Expected Person 1: James hornyjames@email.com 50");
    System.out.println("Expected Person 2: Sam fatBs@email.com 100");
    System.out.println("Person 1: " + person1.getName() + " " + person1.getEmailAddrs() + " " + person1.getMoneyAmt());
    System.out.println("Person 2: " + person2.getName() + " " + person2.getEmailAddrs() + " " + person2.getMoneyAmt());

    person1.setEmail("nothornyjames@email.com");
    person2.setEmail("NOfatBs@email.com");

    person1.addMoney(50);
    person2.addMoney(100);

    System.out.println("Expected Person 1: James nothornyjames@email.com 50");
    System.out.println("Expected Person 2: Sam NOfatBs@email.com 100");
    System.out.println("Person 1: " + person1.getName() + " " + person1.getEmailAddrs() + " " + person1.getMoneyAmt());
    System.out.println("Person 2: " + person2.getName() + " " + person2.getEmailAddrs() + " " + person2.getMoneyAmt());

    person2.openBankAccount();
    person2.transferToBankAcct(50);

    System.out.println(person1);
    System.out.println(person2);
  }
}