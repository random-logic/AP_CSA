/**
 *  This program displays a message in a window.
 */

import java.awt.*;
import javax.swing.*;

public class HelloGui extends JFrame
{
  public HelloGui()   // Constructor
  {
    super("GUI Window");    // Set the title bar
    Container c = getContentPane();
    c.setBackground(Color.RED);
    c.setLayout(new FlowLayout());
    c.add(new JTextField(" GUI Hello, all Cal High students!", 20));
  }

  public static void main(String[] args)
  {
    HelloGui window = new HelloGui();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Set this window's location and size:
    // upper-left corner at 0, 300; width 400, height 100
    window.setBounds(0, screenSize.height - 100, 400, 100);
        
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
