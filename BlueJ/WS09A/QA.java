/**
* FractionTesterQA is to QA the Fraction class
*
* @author Anh Nguyen
* @version 2.0
*/

public class QA
{
  public static int[][] n = {{3, 7, 29, 25, 51, 29, 23, 49, 2, 3, 47, 9, 7, 35, 23, 2},
                             {6, 9, 109, 35, 11, 53, 17, 2, 3, 4, 37, 27,       9, 18, 14, 53},
                             {7, 3, 25, 29, 29, 51, 49, 23, 3, 2, 9, 47, 35, 7, 2, 23},
                             {9, 6, 35, 109, 53, 11, 2, 17, 4, 3, 27, 37,       18, 9, 53, 14}
                            };
  public static int[][] d = {{8, 8,  6, 18,  4,  6, 12, 12, 5, 4,  6, 2, 4,  8,  3, 9},
                             {5, 5,  12,  4,  2,  6,  5, 5, 7, 3,  9,  8,       25, 35, 11, 22},
                             {8, 8, 18, 6, 6, 4, 12, 12, 4, 5, 2, 6, 8, 4, 9, 3},
                             {5, 5, 4, 12, 6, 2, 5, 5, 3, 7, 8, 9,       35, 25, 22, 11}
                            };
   
  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(10);
    Fraction f3 = new Fraction(5, -30);
    Fraction f4 = new Fraction(f3);

    System.out.println("CONSTRUCT:");
    System.out.println("   f1 = " + f1);
    System.out.println("   f2 = " + f2);
    System.out.println("   f3 = " + f3);
    System.out.println("   f4 = " + f4);
    System.out.println();
  }
 
  public static void calc(int num1, int denom1, int num2, int denom2, int op)
  {
      Fraction fr1 = new Fraction(num1, denom1);
      Fraction fr2 = new Fraction(num2, denom2);
      Fraction fr3 = null;
      switch (op){
      case 1:
        System.out.println("ADD: ");
        fr3 = fr1.add(fr2);
        break;
      case 2:
        System.out.println("SUBTRACT: ");
        fr3 = fr1.subtract(fr2);
        break;
      case 3:
        System.out.println("MULTIPLY: ");
        fr3 = fr1.multiply(fr2);
        break;
      case 4:
        System.out.println("DIVIDE: ");
        fr3 = fr1.divide(fr2);
        break;
      default:
        System.out.println("Operator not recognized: ");
        break;
    }
      System.out.println("   fr1 = " + fr1);
      System.out.println("   fr2 = " + fr2);     
      System.out.println("   fr3 = " + fr3);
      System.out.println();
    }

  public static void main(String[] args)
  {
      testConstructors();
     
      int r = (int)(Math.random()*4);
     
      int i = 0;
      calc(n[r][i], d[r][i], n[r][i+1], d[r][i+1], 1);
      calc(n[r][i+2], d[r][i+2], n[r][i+3], d[r][i+3], 1);
      i += 4;
      calc(n[r][i], d[r][i], n[r][i+1], d[r][i+1], 2);
      calc(n[r][i+2], d[r][i+2], n[r][i+3], d[r][i+3], 2);
      i += 4;
      calc(n[r][i], d[r][i], n[r][i+1], d[r][i+1], 3);
      calc(n[r][i+2], d[r][i+2], n[r][i+3], d[r][i+3], 3);
      i += 4;
      calc(n[r][i], d[r][i], n[r][i+1], d[r][i+1], 4);
      calc(n[r][i+2], d[r][i+2], n[r][i+3], d[r][i+3], 4);
     
  }
}