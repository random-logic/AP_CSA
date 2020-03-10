public class SelectionSortTester
{
    public static void main (String[] args)
    {
        // Generate an array of random integers
        int count = 8, low = 11, high = 99;
        int[] scores = new int[count];
        System.out.println("COUNT = " + count + " , between " + low + " & " + high);       
        for (int i = 0; i < count; i++)
        {
            scores[i] = (int) (Math.random() * (high-low+1)) + low;
            System.out.println(scores[i]);
        }
        
        // Do selection sort to sort "scores", with "count" elements
        for (int n = scores.length; n > 1; n--) {
            int maxPos = 0;
            for (int i = 1; i < n; i++)
                if (scores[i] > scores[maxPos])
                    maxPos = i;
            int temp = scores[maxPos];
            scores[maxPos] = scores[n - 1];
            scores[n - 1] = temp;
        }
        
        // Print resulting array
        System.out.print("Resulting Array in Increasing Order:");
        for (int score : scores)
            System.out.print(" " + score);

        System.out.println("\n\n");
        
        // Generate an array of random integers
        count = 8; low = 11; high = 99;
        scores = new int[count];
        System.out.println("COUNT = " + count + " , between " + low + " & " + high);       
        for (int i = 0; i < count; i++)
        {
            scores[i] = (int) (Math.random() * (high-low+1)) + low;
            System.out.println(scores[i]);
        }
        
        // Do selection sort to sort "scores", with "count" elements
        for (int n = scores.length; n > 1; n--) {
            int minPos = 0;
            for (int i = 1; i < n; i++)
                if (scores[i] < scores[minPos])
                    minPos = i;
            int temp = scores[minPos];
            scores[minPos] = scores[n - 1];
            scores[n - 1] = temp;
        }
        
        // Print resulting array
        System.out.print("Resulting Array in Decreasing Order:");
        for (int score : scores)
            System.out.print(" " + score);
    }
}