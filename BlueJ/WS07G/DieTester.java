/** 
 * Purpose: Test the die class
 * @author Andrew
 * @version 2019
 */

public class DieTester {
    /**
     * Purpose: Roll a die from the die class
     */
    public static void main() {
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
}