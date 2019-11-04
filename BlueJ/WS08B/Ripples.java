/**
 * Purpose: Calculate the total amount of money for ripples bought
 * @author Andrew
 * @version 2019
 */

import java.util.Scanner;

public class Ripples {
  /**
   * Purpose: Main method of Ripples calculator
   */
  public static void main() {
    final float PRICE = 0.26f; //The price per ripple

    Scanner keyboard = new Scanner(System.in); //Declare new input scanner
    
    char next_customer; //Checks to see if there is a next customer
    
    //Run the ripple program for the first customer, and do it until no customers
    do {
      //Get the customer quantity
      System.out.print("Enter quantity: ");
      int quantity = keyboard.nextInt();
      
      keyboard.nextLine(); //Skip the rest of the next line

      //Tell price if bought in sets of 25, otherwise prompt error
      if (quantity % 25 == 0)
        System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", quantity, PRICE * quantity);
      else
        System.out.println("Ripples can only be ordered in packs of 25.\n");
      
      //See if there is a next customer, if not clear, keep asking
      do {
        System.out.print("Next Customer: ");
        String buf = keyboard.nextLine().trim();
        if (buf.length() == 1)
          next_customer = buf.charAt(0);
        else
          next_customer = ' ';

      } while (next_customer != 'Y' && next_customer != 'y' && next_customer != 'N' && next_customer != 'n');
    } while (next_customer == 'Y' || next_customer == 'y');

    keyboard.close(); //Done with keyboard
    System.out.println("Thank you for using Ripple systems."); //Exit message
  }
}