/**
 * Write a description of class CircleTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleTester
{
    public static void main (String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        
        System.out.println("Expected area circle 1 (Approximately): 12.5663706");
        System.out.println("Observed area circle 1: " + circle1.getArea());
        System.out.println("Expected area circle 2 (Approximately): 12.5663706");
        System.out.println("Observed area circle 2: " + circle2.getArea());
        
    }
}
