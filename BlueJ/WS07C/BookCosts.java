/**
* Purpose: Get the cost of the books
*
* @author Andrew
* @version 2019
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class BookCosts
{
    /**
     * Purpose: Get the total cost of the two books
     * @param bp the number of bp books
     * @param nb the number of nb books
     * @return the total cost of the whole purchase
     */
    public static double getOrderTotal(int bp, int nb) {
        final double COST_BP = 18.95;
        final double COST_NB = 21.95;
        final double COST_BOTH = 37.95;

        if (bp + nb >= 12)
            return 14 * (bp + nb);
        if (bp + nb >= 3)
            return 15.95 * (bp + nb);

        double total_cost = 0;
        
        while (bp > 0 && nb > 0) {
            total_cost += COST_BOTH;
            bp -= 1;
            nb -= 1;
        }
            
        while (bp > 0) {
            total_cost += COST_BP;
            bp -= 1;
        }
        
        while (nb > 0) {
            total_cost += COST_NB;
            nb -= 1;
        }

        return total_cost;
    }

    /**
     * Purpose: Test the BookCosts Class
     */
    public static void main () {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Amount of Bp: ");
        int amt_bp = kb.nextInt();
        
        System.out.print("Amount of Nb: ");
        int amt_nb = kb.nextInt();
        
        DecimalFormat df = new DecimalFormat("$ #,##0.00");
        String format = df.format(BookCosts.getOrderTotal(amt_bp, amt_nb)); 
        
        System.out.println("Total Cost: " + format);
    }
}
