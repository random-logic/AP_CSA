
/**
 * Create a class that models a cylinder in the real world
 *
 * @author Andrew
 * @version 2019
 */

import java.lang.Math;

public class Cylinder
{
    Circle circle;
    double radius;
    double height;
    
    /**
     * Construct a cylinder with a given radius and height
     * @param r The radius of the cylinder
     * @param h The height of the cylinder
     */
    Cylinder(double r, double h) {
        radius = r;
        circle = new Circle(r);
        height = h;
    }
    
    /**
     * Get the volume of the cylinder
     * @return The volume of the cylinder
     */
    public double getVolume() {
        return circle.getArea() * height;
    }
    
    /**
     * Get the surface area of the cylinder
     * @return The surface area of the cylinder
     */
    public double getSurfArea() {
        return 2 * circle.getArea() /*2 * area of the base*/ + circle.getCircum() * height /*cricumference of the base * height*/;
    }
}
