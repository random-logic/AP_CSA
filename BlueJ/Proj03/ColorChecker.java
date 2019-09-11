/**
 * Creates a color and brightens it
 *
 * @author Andrew
 * @version 2019
 */

import java.awt.Color;

public class ColorChecker
{
    public static void main (String[] args) {
        Color color = new Color(0, 0, 0);
        
        System.out.println("Original: " + color);
        System.out.println("Brighter: " + color.brighter());
    }
}
