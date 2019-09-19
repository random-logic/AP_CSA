/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.Math;

public class Circle
{
    double radius;
    
    Circle (double r) {
        radius = r;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getCircumference() {
        return Math.PI * radius * 2;
    }
}
