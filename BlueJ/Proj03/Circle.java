/**
 * Purpose: To add methods and functionality to circles such as finding the area
 *
 * @author Andrew
 * @version 2019
 */

import java.lang.Math;

public class Circle
{
    double radius;
    
    /**
     * Construct a circle with a given radius
     * @param r The radius of the circle
     */
    Circle (double r) {
        radius = r;
    }
    
    /**
     * Get the area of the circle
     * @return Area of the circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Get the circumference of the circle
     * @return Circumference of the circle
     */
    public double getCircum() {
        return Math.PI * radius * 2;
    }
}
