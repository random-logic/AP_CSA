/**
 * Purpose: Run the program
 * @author Andrew
 * @version 2019
 */
import javax.swing.*;

public class GreetingCard {
  /**
   * Purpose: Start and run the program from here
   */
  public static void main() {
    JFrame frame = new JFrame();
    final int NBALLOONS = 40;
    
    frame.setSize(400, 400);
    frame.setTitle("BalloonViewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    BalloonComponent component = new BalloonComponent(NBALLOONS);
    frame.add(component);
    
    frame.setVisible(true);
  }
}