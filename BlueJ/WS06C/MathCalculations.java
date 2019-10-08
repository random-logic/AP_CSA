/**
 * Purpose: Do some calculations using java math
 *
 * @author Andrew
 * @version 2019
 */

import java.lang.Math;

public class MathCalculations
{
    /**
     * Purpose: Convert temperature from Celsius to fahrenheit
     * @param temp_c The temperature in celsius
     * @return The temperature in fahrenheit
     */
    public static int cToFDeg(int temp_c) {
        return Math.round((float)9 / 5 * temp_c + 32);
    }

    /**
     * Purpose: Get the distance of two points on a 2d coordinate plane
     * @param x1 The x coordinate of point 1
     * @param y1 The y coordinate of point 1
     * @param x2 The x coordinate of point 2
     * @param y2 The y coordinate of point 2
     * @return The distance between the two points
     */
    public static double distanceFormula(double x1, double y1, double x2, double y2) {
        return Math.hypot(x2 - x1, y2 - y1);
    }

    /**
     * Purpose: Get the volume of a sphere
     * @param radius The radius of the sphere
     * @return The volume of the sphere
     */
    public static double volOfSphere(double radius) {
        return Math.PI * 4.0 / 3 * Math.pow(radius, 3);
    }

    /**
     * Purpose: Get the approximation of Euler's number
     * @param n The n value of the formula
     * @return The approximation of Euler's number
     */
    public static double approxE(int n) {
        return Math.pow(1 + 1 / (double)n, (double)n);
    }

    /**
     * Purpose: Format the time in a string
     * @param secs The total amount of seconds
     * @return String formatted in hh:mm:ss
     */
    public static String timeConverter(int secs) {
        int h = secs;
        secs %= 3600;
        h = (h - secs) / 3600;

        String h_str;
        if (h < 10) {
            h_str = "0" + h;
        }
        else {
            h_str = "" + h;
        }

        int m = secs;
        secs %= 60;
        m = (m - secs) / 60;
        String m_str;
        if (m < 10) {
            m_str = "0" + m;
        }
        else {
            m_str = "" + m;
        }

        String s_str;
        if (secs < 10) {
            s_str = "0" + secs;
        }
        else {
            s_str = "" + secs;
        }

        return h_str + ":" + m_str + ":" + s_str;
    }

    /**
     * Purpose: Test the MathCalculations class
     */
    public static void main() {
        System.out.println("Expected: 34");
        System.out.println("Observed: " + MathCalculations.cToFDeg(1));
        System.out.println("Expected: 5");
        System.out.println("Observed: " + MathCalculations.distanceFormula(0, 0, 4, 3));
        System.out.println("Expected: 4.18879020479");
        System.out.println("Observed: " + MathCalculations.volOfSphere(1));
        System.out.println("Expected: 2");
        System.out.println("Observed: " + MathCalculations.approxE(1));
        System.out.println("Expected: 01:01:01");
        System.out.println("Observed: " + MathCalculations.timeConverter(3661));
    }
}
