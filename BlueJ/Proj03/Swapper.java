/**
 * Swaps the letter i with the letter a and visa versa
 *
 * @author Andrew
 * @version 2019
 */
public class Swapper
{
    public static void main (String[] args) {
        StringBuffer str = new StringBuffer("Cal High");
        
        System.out.println("Original: " + str);
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                str.setCharAt(i, 'i');
            }
            else if (str.charAt(i) == 'a') {
                str.setCharAt(i, 'a');
            }
        }
        
        System.out.println("Result: " + str);
        System.out.println("Expected: Cil Hagh");
    }
}
