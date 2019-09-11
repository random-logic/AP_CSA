//  This program shows simple graphics in a window.

import java.awt.*;
import javax.swing.*;

public class HelloGraphics extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //  to paint the background
    g.setColor(Color.GREEN);

    // Draw a 150 by 45 rectangle with the upper-left
    // corner at x = 20, y = 40:
    g.drawRect(20 + 80, 40, 250, 45);

    g.setColor(Color.MAGENTA);

    // Draw a string of text starting at x = 55, y = 65:
    g.drawString("Graphics Hello, all Cal High Students!", 105, 65);
  }

  public static void main(String[] args)
  {
  
    JFrame window = new JFrame("Graphics Window");
    // Set this window's location and size:
    // upper-left corner at 0, 150; width 400, height 150
    window.setBounds(0, 150, 400, 150);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    HelloGraphics panel = new HelloGraphics();
    panel.setBackground(Color.WHITE);  // the default color is light gray
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}
