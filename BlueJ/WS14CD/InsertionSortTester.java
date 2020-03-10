public class InsertionSortTester
{
    public static void main (String[] args)
    {
        // Generate an scoresay of random integers
        int count = 8, low = 11, high = 99;
        int[] scores = new int[count];
        System.out.println("COUNT = " + count + " , between " + low + " & " + high);       
        for (int i = 0; i < count; i++)
        {
            scores[i] = (int) (Math.random() * (high-low+1)) + low;
            System.out.println(scores[i]);
        }
        
        // Do insertion sort to sort "scores", with "count" elements
        for (int k = 1 ; k < count; k++) // loc 0 is OK now
        {
            int temp = scores[k];
            int i = k;
            while (i > 0 && scores [i-1] > temp) {
                scores[i] = scores[i - 1]; // shift right
                i--;
            }
            scores[i] = temp;
        }
        
        // Print resulting scoresay
        System.out.print("Resulting Array in Increasing Order:");
        for (int score : scores)
            System.out.print(" " + score);

        System.out.println("\n\n");

        // Generate an scoresay of random integers
        count = 8; low = 11; high = 99;
        scores = new int[count];
        System.out.println("COUNT = " + count + " , between " + low + " & " + high);       
        for (int i = 0; i < count; i++)
        {
            scores[i] = (int) (Math.random() * (high-low+1)) + low;
            System.out.println(scores[i]);
        }
        
        // Do insertion sort to sort "scores", with "count" elements
        for (int k = 1 ; k < count; k++) // loc 0 is OK now
        {
            int temp = scores[k];
            int i = k;
            while (i > 0 && scores [i-1] < temp) {
                scores[i] = scores[i - 1]; // shift right
                i--;
            }
            scores[i] = temp;
        }

        // Print resulting scoresay
        System.out.print("Resulting Array in Decreasing Order:");
        for (int score : scores)
            System.out.print(" " + score);
    }
}