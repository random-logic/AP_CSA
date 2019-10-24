/**
 * Purpose: Implements the game of Craps logic
 * @author Andrew
 * @version 2019
 */

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  @param total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  @return 1 if player won, -1 if player lost, 0 if player continues rolling.
   */
  public int processRoll(int total)
  {
    if (point == 0) {
      switch (total) {
        case 7: case 11:
          return 1;
        case 2: case 3: case 12:
          return -1;
        default:
          point = total;
          return 0;
      }
    }
    else {
      if (total == 7) {
        point = 0;
        return -1;
      }
      if (total == point) {
        point = 0;
        return 1;
      }
      else {
        return 0;
      }
    }
  }

  /**
   *  @return the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

