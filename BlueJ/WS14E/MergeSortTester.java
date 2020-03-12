public class MergeSortTester
{
    public static void main ()
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
        
        // Do merge sort to sort "scores", with "count" elements
        MergeSort.sort(scores);

        // Print resulting array
        System.out.print("Resulting Array:");
        for (int score : scores)
            System.out.print(" " + score);
    }
}