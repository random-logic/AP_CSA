/**
 * Test Circle class to make sure it functions properly
 *
 * @author Andrew
 * @version 2019
 */
public class CircleTester
{
    public static void main (String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        
        System.out.println("Expected area circle 1 (Approximately): 3.14159265359");
        System.out.println("Observed area circle 1: " + circle1.getArea());
        System.out.println("Expected area circle 2 (Approximately): 12.5663706");
        System.out.println("Observed area circle 2: " + circle2.getArea());
        
        System.out.println("Expected area circle 1 (Approximately): 6.28318530718");
        System.out.println("Observed area circle 1: " + circle1.getCircum());
        System.out.println("Expected area circle 2 (Approximately): 12.5663706");
        System.out.println("Observed area circle 2: " + circle2.getCircum());
    }
}
