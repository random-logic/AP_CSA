public class BinSearchTester {
  public static void main () {
    int[] scores = {16, 17, 21, 48, 52, 56, 58, 60, 65, 65, 73, 83};
    int target = 52, index = (scores.length - 1)/ 2, start = 0, end = scores.length - 1;
    boolean found = false;

    while (end - start > 1 && !found) {
      if (scores[index] == target) found = true;
      else if (scores[index] < target) start = index;
      else if (scores[index] > target) end = index;
      index = start + (end - start) / 2;
    }

    if (found) System.out.println("Found at index " + index);
    else System.out.println("Not found");
  }
}