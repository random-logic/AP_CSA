/**
 * Have a brief conversation with the user.
 * 
 * @author Andrew Jowe 
 * @version 2019
 */

import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("Where do you live? "); // Ask user
    String home_address = kboard.nextLine();         // Accept answer from user
    
    System.out.println("Ok, one day I will show up to " + home_address);
    System.out.println(" at 2am while you are sleeping!");
    
    System.out.print("\nIn how many days are you planning to go to the bank? "); // Ask user
    int days_left = kboard.nextInt();              // Accept answer from user

    System.out.println("You should plan to go to the bank in " + (days_left + 1) + " day(s) instead, ");
    System.out.println("That way, I can show up to your house in " + days_left + "day(s).");    
        
    System.out.print("\nHow much money do you have at your house? "); // Ask user
    double money_at_home = kboard.nextDouble();              // Accept answer from user
    System.out.println("$" + money_at_home + " is about to be all mine!! Hahaha");    
    
    System.out.println("\nSee you soon (insert troll face)!!");    
        
    kboard.close(); // Done using the keyboard
  }
}
