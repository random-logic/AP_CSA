/**
 * Purpose: Do Chapter 7 Question 13 - Compare two dates
 * @author Andrew
 * @version 2019
 */ 

import java.util.Scanner;

public class Dates
{
  /**
   * Purpose: Find if the first date is later than the second date
   * @param month1 The month of the first date
   * @param day1 The day of the first date
   * @param year1 The year of the first date
   * @param month2 The month of the second date
   * @param day2 The day of the second date
   * @param year2 The year of the second date
   * @return true if month1/day1/year1 is later than month2/day2/year2; otherwise false
   */
  public static boolean isLater(int month1, int day1, int year1,
                                int month2, int day2, int year2)
  {
      if (year1 > year2)
        return true;
      if (year1 < year2)
        return false;
      if (month1 > month2)
        return true;
      if (month1 < month2)
        return false;
      if (day1 > day2)
        return true;
      return false;      
  }

  /**
   * Purpose: Test the Dates class
   */
  public static void main()
  {
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter the first date  (month day year): ");
    int month1 = kb.nextInt();
    int day1 = kb.nextInt();
    int year1 = kb.nextInt();

    System.out.print("Enter the second date (month day year): ");
    int month2 = kb.nextInt();
    int day2 = kb.nextInt();
    int year2 = kb.nextInt();

    System.out.println();  // blank line

    String msg = month1 + "/" + day1 + "/" + year1;
    if (isLater(month1, day1, year1, month2, day2, year2))
      msg += " IS ";
    else
      msg += " is NOT ";
    msg += "later than " + month2 + "/" + day2 + "/" + year2;
    System.out.println(msg);
    kb.close();
  }
}

