/**
 * Test the car class using the tester class
 *
 * @author Andrew
 * @version 2019
 */

import java.awt.Color;
import java.util.Random;

public class CarTester
{
    public static void main (String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("BMW", "Model B", 2017, Color.BLUE, 100, 200);
        
        System.out.println("Expected: ");
        System.out.println("Observed: " + car1.getMake());
        System.out.println("Expected: ");
        System.out.println("Observed: " + car1.getModel());
        System.out.println("Expected: 0");
        System.out.println("Observed: " + car1.getYear());
        System.out.println("Expected: Color.BLACK");
        System.out.println("Observed: " + car1.getColor());
        System.out.println("Expected: 0");
        System.out.println("Observed: " + car1.getSpeed());
        System.out.println("Expected: 0");
        System.out.println("Observed: " + car1.getHp());
        
        car1.make = "Honda";
        car1.model = "Model A";
        car1.year = 2015;
        car1.color = Color.WHITE;
        car1.speed = 65;
        car1.hp = 150;
        
        System.out.println("Expected: Honda");
        System.out.println("Observed: " + car1.getMake());
        System.out.println("Expected: Model A");
        System.out.println("Observed: " + car1.getModel());
        System.out.println("Expected: 2015");
        System.out.println("Observed: " + car1.getYear());
        System.out.println("Expected: Color.WHITE");
        System.out.println("Observed: " + car1.getColor());
        System.out.println("Expected: 65");
        System.out.println("Observed: " + car1.getSpeed());
        System.out.println("Expected: 150");
        System.out.println("Observed: " + car1.getHp());
        
        System.out.println("Expected: BMW");
        System.out.println("Observed: " + car2.getMake());
        System.out.println("Expected: Model B");
        System.out.println("Observed: " + car2.getModel());
        System.out.println("Expected: 2017");
        System.out.println("Observed: " + car2.getYear());
        System.out.println("Expected: Color.BLUE");
        System.out.println("Observed: " + car2.getColor());
        System.out.println("Expected: 100");
        System.out.println("Observed: " + car2.getSpeed());
        System.out.println("Expected: 200");
        System.out.println("Observed: " + car2.getHp());
        
        Random rand = new Random();
        int rand_speed_up = rand.nextInt(5) + 1;
        car2.speedUp(rand_speed_up);
        System.out.println("Expected: 100 + " + rand_speed_up);
        System.out.println("Observed: " + car2.getSpeed());
        
        int rand_speed_down = rand.nextInt(5) + 1;
        car2.speedDown(rand_speed_down);
        System.out.println("Expected: 100 + " + rand_speed_up + " - " + rand_speed_down);
        System.out.println("Observed: " + car2.getSpeed());
    }
}
