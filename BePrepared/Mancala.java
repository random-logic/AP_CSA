public class Mancala {
  private static final int BOARD_SIZE = 14;
  private static final int STORE1 = BOARD_SIZE / 2;
  private static final int STORE2 = 0;
  private int[] board;

  public Mancala (int n) {
    board = new int[BOARD_SIZE];
    for (int i = 0; i < BOARD_SIZE; i++)
      if (i != STORE1 && i != STORE2) board[i] = n; 
  }

  public boolean move (int k) {
    int n = board[k];
    board[k] = 0;
    //Player 1
    if (k < STORE1) {
      while (n > 0) {
        k++;
        if (k == BOARD_SIZE) k = 0;
        if (k == STORE2) continue;
        board[k]++;
        n--;
      }
      if (k == STORE1) return true;
    }
    //Player 2
    else {
      while (n > 0) {
        k++;
        if (k == BOARD_SIZE) k = 0;
        if (k == STORE1) continue;
        board[k]++;
        n--;
      }
      if (k == STORE2) return true;
    }
    return false;
  }
}