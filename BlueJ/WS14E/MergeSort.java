public class MergeSort {
  public static void sort (int[] scores) {
    recursiveSort(scores, 0, scores.length - 1);
  }

  private static void recursiveSort(int[] a, int from, int to) {
    if (from >= to) return;

    int middle = (from + to) / 2;

    recursiveSort(a, from, middle);
    recursiveSort(a, middle + 1, to);

    merge(a, from, middle, to);
  }

  private static void merge(int[] a, int from, int middle, int to) {
    int[] temp = new int[a.length];
    int i = from, j = middle + 1, k = from;
    while(i <= middle && j <= to) {
      if (a[i] < a[j])
        temp[k++] = a[i++];
      else
        temp[k++] = a[j++];
    }
    while (i <= middle)
      temp[k++] = a[i++];
    
    while (k <= to)
      temp[k++] = a[j++];

    for (k = from; k <= to; k++)
      a[k] = temp[k];
  }
}