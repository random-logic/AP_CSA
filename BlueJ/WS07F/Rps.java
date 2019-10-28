/** 
 * Purpose: Chapter 7 Question 21
 * @author Andrew
 * @version 2019
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rps extends JFrame
    implements ActionListener
{
  private final char moves[] = {'R', 'P', 'S'};
  private JRadioButton rock, paper, scissors;
  private JTextField display;

  /**
   * Purpose: Construct the class
   */
  public Rps()
  {
    super("Rock, paper, Scissors");

    rock = new JRadioButton("   Rock   ", true);
    paper = new JRadioButton("   Paper  ");
    scissors = new JRadioButton(" Scissors ");

    ButtonGroup rpsButtons = new ButtonGroup();
    rpsButtons.add(rock);
    rpsButtons.add(paper);
    rpsButtons.add(scissors);

    JButton go = new JButton("         Go         ");
    go.addActionListener(this);

    display = new JTextField(25);
    display.setEditable(false);
    display.setBackground(Color.yellow);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(rock);
    c.add(paper);
    c.add(scissors);
    c.add(go);
    c.add(display);
  }

  /**
   * Purpose: See who wins the round (or if it is a tie)
   * @param computerMove The status of the computer (R, P, S) after the turn
   * @param playerMove The status of the player (R, P, S) after the turn
   * @return -1 if the player wins, 0 if it's a tie, and 1 if the computer wins
   */
  private int nextPlay(char computerMove, char playerMove)
  {
    switch (computerMove) {
      case 'R':
        switch (playerMove) {
          case 'R':
            return 0;
          case 'P':
            return -1;
          default:
            return 1;
        }
      case 'P':
      switch (playerMove) {
        case 'R':
          return 1;
        case 'P':
          return 0;
        default:
          return -1;
      }
      default:
      switch (playerMove) {
        case 'R':
          return -1;
        case 'P':
          return 1;
        default:
          return 0;
      }
    }
  }

  /**
   * Purpose: Implement a method from an abstract class
   * @param e The action event
   */
  public void actionPerformed(ActionEvent e)
  {
    char playerMove, computerMove;
    if (rock.isSelected())
      playerMove = 'R';
    else if (paper.isSelected())
      playerMove = 'P';
    else // if (scissors.isSelected())
      playerMove = 'S';

    int k = (int)(Math.random() * 3);
    computerMove = moves[k];
    int result = nextPlay(computerMove, playerMove);

    String msg = "  You said " + makeWord(playerMove) + ", I said " +
                 makeWord(computerMove);
    if (result < 0)
      msg += " -- you win.";
    else if (result == 0)
      msg += " -- tie.";
    else // if (result > 0)
      msg += " -- I win.";
    display.setText(msg);
  }

  /**
   * Purpose: Create a word based on the char move
   * @param move The result of a round of R, P, S
   * @return ROCK if R, PAPER if P, SCISSORS if S 
   */
  private String makeWord(char move)
  {
    String word = "";

    switch (move)
    {
      case 'R': word = "ROCK"; break;
      case 'P': word = "PAPER"; break;
      case 'S': word = "SCISSORS"; break;
    }
    return word;
  }

  /**
   * Purpose: Test and run the RPS class
   */
  public static void main()
  {
    Rps window = new Rps();
    window.setBounds(300, 300, 300, 140);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

