/**
 * Replace 'i' with '!' in a string
 *
 * @author Andrew
 * @version 2019
 */

public class StringChecker
{
    public static void main (String[] args) {
        String str = "California";
        System.out.println("Original: " + str);
        System.out.println("Observed: " + str.replace('i', '!'));
        System.out.println("Expected: Cal!forn!a");
    }
}
