
/**
 * Write a description of class E02PerimeterTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
/**
 Constructs a Rectangle object and then computes and prints its perimeter.
*/
public class E02PerimeterTester
{
 public static void main(String[] args)
 {
 Rectangle r1 = new Rectangle(5, 10, 20, 30);
 double perimeter = 2 * r1.getWidth() + 2 * r1.getHeight();
 System.out.println("Perimeter: " + perimeter);
 System.out.println("Expected: 100");
 }
}
