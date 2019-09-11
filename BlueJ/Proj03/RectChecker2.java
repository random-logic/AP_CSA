/**
 * Translate the rectangle from the left top corner to the bottom right corner
 *
 * @author Andrew
 * @version 2019
 */

import java.awt.Rectangle;

public class RectChecker2
{
    public static void main (String[] args) {
        Rectangle rect = new Rectangle(10, 10, 10, 50);
        int w = (int)rect.getWidth();
        int l = (int)rect.getHeight();
        rect.translate(w, l);
        
        System.out.println("Observed: " + rect.x + ", " + rect.y + ", " + w + ", " + l);
        System.out.println("Expected: 20, 60, 10, 50");
    }
}
