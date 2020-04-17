public class TileGame {
  public int getIndexForFit (NumberTile tile) {
    if (board.size() == 0 || board[0].getLeft() == tile.getRight()) return 0;
    for (int i = 1; i < board.size(); i++)
      if (board[i - 1].getRight() == tile.getLeft() && board[i].getLeft() == tile.getRight()) return i;
    if (board[board.size() - 1].getRight() == tile.getLeft()) return board.size();
    return -1;
  }

  public boolean insertTile (NumberTile tile) {
    int index = getIndexForFit(tile);
    if (index == -1) {
      tile.rotate();
      index = getIndexForFit(tile);
    }
    if (index == -1) return false;
    board.add(index, tile);
    return true;
  }
}