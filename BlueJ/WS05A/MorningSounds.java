/**
 * Purpose: Make a rooster sound every 5 seconds
 * @author Andrew
 * @version 2019
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MorningSounds extends JFrame implements ActionListener
{
  private EasySound rooster;
  private int time;

  /**
   *   Constructor
   */
  public MorningSounds()
  {
    super("MorningSounds");
    
    time = 0;
    Timer clock = new Timer(5000, this); 
    clock.start();
    
    rooster = new EasySound("roost.wav");
    rooster.play();
    
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    time++;
    rooster.play();
  }

  public static void main(String[] args)
  {
    MorningSounds morning = new MorningSounds();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
