// Chapter 11 Question 6

import java.awt.Color;
import info.gridworld.actor.Bug;

public class SlowBug extends Bug
{
  private int steps;

  public SlowBug()
  {
    steps = 0;
  }

  public SlowBug(Color bugColor)
  {
    super(bugColor);
    steps = 0;
  }

  public void act()
  {
    if (steps == 2)
    {
      super.act();
      steps = 0;
    }
    else
    {
      steps++;
    }
  }
}
