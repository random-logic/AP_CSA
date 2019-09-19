/**
 * Test the Cylinder class to make sure it functions properly
 *
 * @author Andrew
 * @version 2019
 */

public class CylinderTester
{
    public static void main (String[] args) {
        Cylinder cylinder1 = new Cylinder(1, 1);
        Cylinder cylinder2 = new Cylinder(2, 2);
        
        System.out.println("Expected volume Cylinder 1 (Approximately): 3.14159265");
        System.out.println("Observed volume Cylinder 1 (Approximately): " + cylinder1.getVolume());
        System.out.println("Expected volume Cylinder 2 (Approximately): 25.13274");
        System.out.println("Observed volume Cylinder 2 (Approximately): " + cylinder2.getVolume());
        
        System.out.println("Expected surface area Cylinder 1 (Approximately): 12.56637");
        System.out.println("Observed surface area Cylinder 1 (Approximately): " + cylinder1.getSurfArea());
        System.out.println("Expected surface area Cylinder 2 (Approximately): 50.26548");
        System.out.println("Observed surface area Cylinder 2 (Approximately): " + cylinder2.getSurfArea());
    }
}
