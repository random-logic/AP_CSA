import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

/**
   This class displays a number of balloons.
*/
public class BalloonComponent extends JComponent
{
   private int balloonCount;
   
   /**
      Constructor for a BalloonComponent with a number of balloons
      @param n the number of balloons to show
   */
   public BalloonComponent(int n)
   {
       balloonCount = n;
   }
       
   public void paintComponent(Graphics g)
   {
      final Color SKY_BLUE = new Color(165,218,239);
      final int MAX_RADIUS = 30;

      Graphics2D g2 = (Graphics2D) g;
      // Draw the sky
      Rectangle sky = new Rectangle (0, 0 , getWidth(), getHeight());
      g2.setColor(SKY_BLUE); 
      g2.fill(sky);
      // Use this random number generator
      Random generator = new Random(42);

      // Generate and draw balloons
      // Your work here
      for (int i = 0; i < balloonCount; i++) {
         Balloon balloon = new Balloon(generator.nextInt(getWidth()), generator.nextInt(getHeight()), generator.nextInt(50), 
            new Color (generator.nextFloat(), generator.nextFloat(), generator.nextFloat()));
         balloon.draw(g2);
      }
    }
}