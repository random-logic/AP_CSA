/**
 * Purpose:
 *
 * @author Andrew
 * @version 2019
 */
public class BookCosts
{
    public static double getOrderTotal(int bp, int nb) {
        final double COST_BP = 18.95;
        final double COST_NB = 21.95;
        final double COST_BOTH = 37.95;

        if (bp + nb >= 12)
            return 14 * (bp + nb);
        if (bp + nb >= 3)
            return 15.95 * (bp + nb);

        double total_cost = 0;
        
        while (bp > 1 && nb > 1)
            total_cost += COST_BOTH;

        return total_cost;
    }

    public static void main () {
    }
}
