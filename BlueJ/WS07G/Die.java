/**
 * Purpose: Create a die
 * @author Andrew
 * @version 2019
 */

import java.util.Random;

public class Die {
    private int num_of_dots = 0; //The number of dots from the last roll

    /**
     * Purpose: Roll a die
     */
    public void roll() {
        Random random = new Random();
        num_of_dots = random.nextInt(6) + 1;
    }

    /**
     * Purpose: Return the number of dots from the last roll
     * @return The number of dots from the last rolll
     */
    public int getNumDots() {
        return num_of_dots;
    }
}