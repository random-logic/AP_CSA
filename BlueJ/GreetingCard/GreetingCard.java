/**
 * Purpose: Run the program
 * @author Andrew
 * @version 2019
 */
import javax.swing.*;
import java.awt.*;

public class GreetingCard {
  private static final int NBALLOONS = 40;
  
  /**
   * Purpose: Start and run the program from here
   */
  public static void main() {
    JFrame frame = new JFrame();
    
    ImageIcon icon = new ImageIcon("turkey.png");
    Image image = icon.getImage(); 
    image = image.getScaledInstance(120, 120, image.SCALE_SMOOTH);  
    icon = new ImageIcon(image);
    
    JLabel label = new JLabel(icon);
    label.setLocation(150, 300);
    label.setSize(100, 100);
    frame.add(label);
    
    frame.setSize(400, 600);
    frame.setTitle("BalloonViewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    BalloonComponent component = new BalloonComponent(NBALLOONS);
    frame.add(component);
    
    frame.setResizable(false);
    frame.setVisible(true);
  }
}