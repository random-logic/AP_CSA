/**
 * Purpose: Make a poem for the user
 * @author Andrew
 * @version 2019
 */

import java.util.Scanner;

public class Poem {
    /**
     * Purpose: Main method with all of the code
     */
    public static void main() {
        Scanner kboard = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int input = kboard.nextInt();
            

            switch (input) {
                case 1: case 2:
                    System.out.println("Buckle your shoe.");
                    break;
                case 3: case 4:
                    System.out.println("Open the door.");
                    break;
                case 5: case 6:
                    System.out.println("Pick up sticks.");
                    break;
                case 7: case 8:
                    System.out.println("Lay them straight.");
                    break;
                case 9: case 10:
                    System.out.println("Do it again!");
                    break;
                default:
                    kboard.close();
                    return;
            }
        }
    }
}