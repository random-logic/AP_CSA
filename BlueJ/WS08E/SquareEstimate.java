/**
 * Purpose: Get an estimate of the square root of a number
 * @author Andrew
 * @version 2019
 */

public class SquareEstimate {
  /**
   * Purpose: Get an estimate of the square root of a number > 5
   * @param a The number to estimate the square root of
   * @return The approximate square root of a, -1 if a <= 5
   */
  public static double estSqrt(double a) {
    if (a <= 5)
      return 0;

    double x = a / 2;
    double diff = 0;

    do {
      x = (x + a / x) / 2;
      diff = x * x - a;
    } while (diff > 0.01 || diff < -0.01);

    return x;
  }
  
  /**
   * Purpose: Test the SquareEstimate class
   */
  public static void main(String[] args) {
    double num;

    for (int i = 0; i < 3; i++) {
      num = Math.random()*Math.pow(10,(Math.random()*4));
      System.out.printf("Square root of %7.2f is %7.2f\n", num, estSqrt(num));
    }
  }
}