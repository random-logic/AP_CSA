
/**
 * Write a description of class Cylinder here.
 *
 * @author Andrew
 * @version 2019
 */

import java.lang.Math;

public class Cylinder
{
    double radius;
    double height;
    
    /**
     * Construct a cylinder with a given radius and height
     * @param r The radius of the cylinder
     * @param h The height of the cylinder
     */
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    /**
     * Get the volume of the cylinder
     * @return The volume of the cylinder
     */
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    
    /**
     * Get the surface area of the cylinder
     * @return The surface area of the cylinder
     */
    public double getSurfArea() {
        return 2 * Math.PI * radius * radius /*2 * area of the base*/ + 2 * radius * Math.PI * height /*cricumference of the base * height*/;
    }
}
