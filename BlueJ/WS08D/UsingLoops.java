/**
 * Purpose: Use loops
 * @author Andrew
 * @version 2019
 */

public class UsingLoops {
  /**
   * Purpose: To get the future year of when the population reaches the given year
   * @param year The initial year
   * @param init_pop The initial population
   * @param future_pop The target population
   * @param rate The rate (%) determining how much the population increases per year
   * @return
   */
  public static int popGrowth (int year, double init_pop, double future_pop, double rate) {
    while (init_pop < future_pop) {
      year++;
      init_pop *= 1 + rate;
    }

    return year;
  }

  /**
   * Purpose: Gets the sum of numbers from 3 to a given number inclusive
   * @param n The given number
   * @return The sum
   */
  public static int addMultOf3 (int n) {
    int sum = 0;
    for (int i = 3; i <= n; i += 3)
      sum += i;
    
    return sum;
  }

  /**
   * Purpose: The number of chairs in a row in a theater is k more than the number of chairs in the
   * row before it. Given the number of chairs in certain row, calculate the number of chairs in another
   * row (before or after that row). 
   * @param rowNum1 row number, with count1 chairs 
   * @param count1 number of chairs in rowNum1
   * @param k difference in number of chairs between 2 consecutive rows
   * @param rowNum2 row number where the number of chairs is to be calculated 
   * @return number of chairs in rowNum2
   */
  public static int calcChairs (int rowNum1, int count1, int k, int rowNum2) {
    if (rowNum1 < rowNum2)
      for (; rowNum1 < rowNum2; rowNum1++)
        count1 += k;
    else
      for (; rowNum1 > rowNum2; rowNum1--)
        count1 -= k;
    
    return count1;
  }

  /**
   * Purpose: Calculate the number of months when a student achieves certain percentage of the
   * knowledge from studying certain material. 
   * @param rate rate (of type double) of knowledge gained after one month
   * @param target desired % of knowledge of material (of type double)
   * @return number of months (of type double) to obtain the desired % of knowledge of material 
   */
  public static double knowledgeGrowth (double rate, double target) {
    double months = 0;
    
    for (double knowledge = 0; knowledge < target; knowledge += (1 - knowledge) * rate)
      months++;
    
      return months;
  }

  /**
   * Purpose: Estimate the value of pi, based on the Gregory Series
   * @param n the number of terms to estimate pi 
   * @return estimated pi value
   */
  public static double estPi (int n) {
    double pi_over_4 = 1;

    for (int i = 2, bottom = 3; i <= n; i += 2, bottom += 4)
      pi_over_4 -= 1.0 / bottom;

    for (int i = 3, bottom = 5; i <= n; i += 2, bottom += 4)
      pi_over_4 += 1.0 / bottom;

    return 4 * pi_over_4;
  }

  /**
   * Purpose: Display, in the Terminal/Console Window, a triangle similar to the following, where the
   * first line has one “X” and the last has (2n-1) “X”s
   * @param n Number of lines
   */
  public static void starTriangle (int n) {
    System.out.println("Star Triangle:");

    int x = 1;

    for (; n > 0; n--) {
      for (int i = 0; i < n - 1; i++)
        System.out.print(" ");

      for (int i = 0; i < x; i++)
        System.out.print("X");

      System.out.print("\n");

      x += 2;
    }
  }

  /**
   * Purpose: Display, in the Terminal/Console Window, an n n  identity matrix, where the diagonal
   * is 1s and the rest is 0s
   * @param n The number of rows and columns
   */
  public static void identMatrix (int n) {
    System.out.println("Identity matrix:");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j)
          System.out.print("1");
        else
          System.out.print("0");
        System.out.print(" ");
      }

      System.out.print("\n");
    }
  }

  /**
   * Purpose: Test the class methods
   */
  public static void main () {
    System.out.println("popGrowth year = 2000, init_pop = 5000, future_pop = 10000, rate = 0.2");
    System.out.println("Expected: 2004");
    System.out.println("Observed: " + popGrowth(2000, 5000, 10000, 0.2));
    System.out.println();
    System.out.println("calcChairs rowNum1 = 10, count1 = 20, k = 4, rowNum2 = 8");
    System.out.println("Expected: 12");
    System.out.println("Observed: " + calcChairs(10, 20, 4, 8));
    System.out.println("calcChairs rowNum1 = 8, count1 = 20, k = 4, rowNum2 = 10");
    System.out.println("Expected: 28");
    System.out.println("Observed: " + calcChairs(8, 20, 4, 10));
    System.out.println();
    System.out.println("knowledgeGrowth rate = 0.4, target = 0.85");
    System.out.println("Expected: 4");
    System.out.println("Observed: " + knowledgeGrowth(0.4, 0.85));
    System.out.println();
    System.out.println("estPi n = 5");
    System.out.println("Expected: 3.33968254");
    System.out.println("Observed: " + estPi(5));
    System.out.println();
    System.out.println("starTriangle n = 4");
    System.out.println("Expected:");
    System.out.println("   X");
    System.out.println("  XXX");
    System.out.println(" XXXXX");
    System.out.println("XXXXXXX");
    System.out.println("Observed:");
    starTriangle(4);
    System.out.println();
    System.out.println("idenMatrix n = 3");
    System.out.println("Expected:");
    System.out.println("1 0 0");
    System.out.println("0 1 0");
    System.out.println("0 0 1");
    System.out.println("Observed:");
    identMatrix(3);
  }
}