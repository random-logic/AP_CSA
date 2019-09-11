/**
 * Creates a string buffer and reverses it
 *
 * @author Andrew
 * @version 2019
 */

public class StringBufferChecker
{
    public static void main (String[] args) {
        StringBuffer str = new StringBuffer("Hello World!");
        System.out.println("Original: " + str);
        System.out.println("Result: " + str.reverse());
        System.out.println("Expected: !dlroW olleH");
    }
}
