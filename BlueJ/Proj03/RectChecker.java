/**
 * Output the area of a rectangle
 *
 * @author Andrew
 * @version 2019
 */
import java.awt.Rectangle; 

public class RectChecker
{    
    public static void main (String[] args) {
        Rectangle rect = new Rectangle(10, 10, 10, 50);
        
        System.out.println("Observed: " + (rect.getWidth() * rect.getHeight()));
        System.out.println("Expected: 500");
    }
}
