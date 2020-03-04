public class SquareMatrix {
  public static int determinant(int matrix[][]) {
    if (matrix.length == 1 && matrix[0].length == 1) return matrix[0][0];
    int sum = 0;
    for (int count = 0; count < matrix.length; count++) {
      int new_matrix[][] = new int[matrix.length - 1][matrix.length - 1];
      for (int j = 0; j < new_matrix.length; j++)
        for (int k = 0; k < new_matrix.length; k++)
          if (k >= count)
            new_matrix[j][k] = matrix[j + 1][k + 1];
          else //if (k < count)
            new_matrix[j][k] = matrix[j + 1][k];
      if (count % 2 == 0)
        sum += matrix[0][count] * determinant(new_matrix);
      else //if (count % 2 == 1)
        sum -= matrix[0][count] * determinant(new_matrix);
    }
    return sum;
  }

  public static void main () {
    int[][] m11a = {{4}};

    int[][] m22a = {{4, -3}, 
                    {0, 0}};

    int[][] m33a = {{ 1, 4, -2}, 
                    { 3, 2, 0}, 
                    {-1, 4, 3}};

    int[][] m44a = {{ 3, 6, -5, 4}, 
                    {-2, 2, 6, 0}, 
                    { 1, 1, 2, 0}, 
                    { 0, 3, -1, 1}};

    int[][] m55a = {{ 3, 2, 4, -1, 5}, 
                    {2, 0, 1, 3, 2}, 
                    { 1, 0, 0, 4, 0}, 
                    { 6, 0, 2, -1, 0}, 
                    { 3, 0, 5, 1, 0}};

    int[][] m66a = {{-2, 0, 1, 4, 3, -2},
                    {-3, 3, 0, -2, 1, -1},
                    { 4, 5, -1, 0, 7, 3},
                    { 2, 4, 3, 2, 0, 1},
                    { 1, 3, 4, 2, -4, 0},
                    {-5, 2, -1, 3, 2, -3}};

    System.out.println("Expected: 4, Observed: " + determinant(m11a));
    System.out.println("Expected: 0, Observed: " + determinant(m22a));
    System.out.println("Expected: -58, Observed: " + determinant(m33a));
    System.out.println("Expected: -62, Observed: " + determinant(m44a));
    System.out.println("Expected: 412, Observed: " + determinant(m55a));
    System.out.println("Expected: -636, Observed: " + determinant(m66a));
  }
}