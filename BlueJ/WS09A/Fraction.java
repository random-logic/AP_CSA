/**
 * Purpose: Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * @author Andrew
 * @version 2019
 */

public class Fraction
{

  // ******************  Instance variables  ******************

  private int num;
  private int denom;

  // *********************  Constructors  *********************
  /**
   * Purpose: no-args constructor
   */
  public Fraction()
  {
    num = 0;
    denom = 1;
  }

  /**
   * Purpose: Construct a fraction with a numerator / 1
   * @param n the numerator of the fraction
   */
  public Fraction(int n)
  {
    num = n;
    denom = 1;
  }

  /**
   * Purpose: Construct a fraction with a numerator / denominator
   * @param n the numerator of the fraction
   * @param d the denominator of the fraction
   */
  public Fraction(int n, int d)
  {
    if (d != 0)
    {
      num = n;
      denom = d;
      reduce();
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }

  /**
   * Purpose: Copy constructor
   * @param other The other fraction to copy
   */
  public Fraction(Fraction other)
  {
    num = other.num;
    denom = other.denom;
  }

  // ********************  Public methods  ********************

  /**
   * Purpose: Add two fractions
   * @param other the other fraction to add to the fraction
   * @return the sum of this fraction and other
   */
  public Fraction add(Fraction other)
  {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  /**
   * Purpose: Add two fractions
   * @param m the other number to add to the fraction
   * @return the sum of this fraction and m
   */
  public Fraction add(int m)
  {
    return new Fraction(num + m * denom, denom);
  }

  /**
   * Purpose: subtract the fraction by a number
   * @param other the fraction to subtract the fraction by
   * @return the difference of this fraction and other
   */
  public Fraction subtract(Fraction other)
  {
    int newNum = num * other.denom - denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  /**
   * Purpose: subtract the fraction by a number
   * @param m the number to subtract the fraction by
   * @return the difference of this fraction and m
   */
  public Fraction subtract(int m)
  {
    return new Fraction(num - m * denom, denom);
  }

  /**
   * Purpose: multiply the fraction by a number
   * @param other the fraction to multiply the fraction by
   * @return the product of this fraction and other
   */
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  /**
   * Purpose: multiply the fraction by a number
   * @param m the number to multiply the fraction by
   * @return the product of this fraction and m
   */
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom);
  }

  /**
   * Purpose: divide the fraction by a number
   * @param other the fraction to divide this fraction by
   * @return the quotient of this fraction and other
   */
  public Fraction divide(Fraction other)
  {
    int newNum = num * other.denom;
    int newDenom = denom * other.num;
    return new Fraction(newNum, newDenom);
  }

  /**
   * Purpose: divide the fraction by a number
   * @param m the number to divide this fraction by
   * @return the quotient of this fraction and m
   */
  public Fraction divide(int m)
  {
    return new Fraction(num, denom * m);
  }

  /**
   * Purpose: get the decimal value of the fraction
   * @return the value of this fraction as a double
   */
  public double getValue()
  {
    return (double)num / (double)denom;
  }

  /**
   * Purpose: Display fraction as a string
   * @return a string representation of this fraction
   */
  public String toString()
  {
    if (denom < 0) {
      num *= -1;
      denom *= -1;
    }
    return num + "/" + denom;
  }

  // *******************  Private methods  ********************
  /**
   * Purpose: Reduces this fraction by the gcf and makes denom > 0
   */
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;
  }

  /**
   * Purpose: Get the greatest common factor of two positive integers
   * @return the greatest common factor of two positive integers
   */
  private int gcf(int n, int d)
  {
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    if (n % d == 0)
      return d;
    else if (d % n == 0)
      return n;
    else
      return gcf(n % d, d % n);
  }

  /**
   * Purpose: Test the fraction class
   */
  public static void main() {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(-3, -4);
    Fraction f3 = new Fraction(5, -6);
    Fraction f4 = new Fraction(-7, 8);
    
    System.out.println("Test to string");
    System.out.println("Expected: 1/2");
    System.out.println("Observed: " + f1.toString());
    System.out.println("Expected: 3/4");
    System.out.println("Observed: " + f2.toString());
    System.out.println("Expected: -5/6");
    System.out.println("Observed: " + f3.toString());
    System.out.println("Expected: -7/8");
    System.out.println("Observed: " + f4.toString());

    Fraction f1_plus_f2 = f1.add(f2);
    Fraction f1_minus_f2 = f1.subtract(f2);
    Fraction f1_times_f2 = f1.multiply(f2);
    Fraction f1_over_f2 = f1.divide(f2);
    Fraction f1_plus_f3 = f1.add(f3);
    Fraction f1_minus_f3 = f1.subtract(f3);
    Fraction f1_times_f3 = f1.multiply(f3);
    Fraction f1_over_f3 = f1.divide(f3);
    Fraction f1_plus_f4 = f1.add(f4);
    Fraction f1_minus_f4 = f1.subtract(f4);
    Fraction f1_times_f4 = f1.multiply(f4);
    Fraction f1_over_f4 = f1.divide(f4);

    System.out.println("Test +-/* two fractions");
    System.out.println("Expected: 5/4");
    System.out.println("Observed: " + f1_plus_f2);
    System.out.println("Expected: -1/4");
    System.out.println("Observed: " + f1_minus_f2);
    System.out.println("Expected: 3/8");
    System.out.println("Observed: " + f1_times_f2);
    System.out.println("Expected: 2/3");
    System.out.println("Observed: " + f1_over_f2);
    System.out.println("Expected: -1/3");
    System.out.println("Observed: " + f1_plus_f3);
    System.out.println("Expected: 4/3");
    System.out.println("Observed: " + f1_minus_f3);
    System.out.println("Expected: -5/12");
    System.out.println("Observed: " + f1_times_f3);
    System.out.println("Expected: -3/5");
    System.out.println("Observed: " + f1_over_f3);
    System.out.println("Expected: -3/8");
    System.out.println("Observed: " + f1_plus_f4);
    System.out.println("Expected: 11/8");
    System.out.println("Observed: " + f1_minus_f4);
    System.out.println("Expected: -7/16");
    System.out.println("Observed: " + f1_times_f4);
    System.out.println("Expected: -4/7");
    System.out.println("Observed: " + f1_over_f4);

    int m = 2;
    Fraction f1_plus_m = f1.add(m);
    Fraction f1_minus_m = f1.subtract(m);
    Fraction f1_times_m = f1.multiply(m);
    Fraction f1_over_m = f1.divide(m);

    System.out.println("Test +-/* a fractions");
    System.out.println("Expected: 5/2");
    System.out.println("Observed: " + f1_plus_m);
    System.out.println("Expected: -3/2");
    System.out.println("Observed: " + f1_minus_m);
    System.out.println("Expected: 1/1");
    System.out.println("Observed: " + f1_times_m);
    System.out.println("Expected: 1/4");
    System.out.println("Observed: " + f1_over_m);
  }
}
