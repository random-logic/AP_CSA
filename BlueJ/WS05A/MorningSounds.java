import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;

public class MorningSounds extends JFrame
{
  private EasySound rooster;

  /**
   *   Constructor
   */
  public MorningSounds()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    rooster.play();
    
    Timer t = new Timer();

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
