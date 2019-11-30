/**
 * Purpose: This class displays a number of balloons.
 * @author Andrew
 * @version 2019
 */

import javax.swing.JComponent;

import javafx.stage.Window;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

 public class BalloonComponent extends JComponent
{
   private int balloonCount;
   private static final int RANDOM_COLORS_SIZE = 4;
   private static final Color[] RANDOM_COLORS = {new Color(153, 98, 54), new Color(237, 115, 46), new Color(157, 34, 30), new Color(133, 157, 60)};
   
   /**
    * Constructor for a BalloonComponent with a number of balloons
    * @param n the number of balloons to show
    */
   public BalloonComponent(int n)
   {
      balloonCount = n;
   }
      
   /**
    * Purpose: 
    * @param g The graphics component
    */
   public void paintComponent(Graphics g)
   {
      final Color SKY_ORANGE_YELLOW = new Color(248, 177, 44);

      Graphics2D g2 = (Graphics2D) g;
      // Draw the sky
      Rectangle sky = new Rectangle (0, 0 , getWidth(), getHeight());
      g2.setColor(SKY_ORANGE_YELLOW); 
      g2.fill(sky);
      // Use this random number generator
      Random generator = new Random(42);

      // Generate and draw balloons
      // Your work here
      for (int i = 0; i < balloonCount; i++) {
         Balloon balloon = new Balloon(generator.nextInt(getWidth()), generator.nextInt(getHeight()), generator.nextInt(50), 
            randomColor());
         balloon.draw(g2);
      }

      g2.drawString("Happy Thanksgiving!", Frame.getBounds().width / 2, Frame.getBounds().height / 2);
   }

   /**
    * Purpose: Generate a random color for the balloons
    * @return A random color
    */
   private static Color randomColor() {
      Random generator = new Random();
      return RANDOM_COLORS[generator.nextInt(RANDOM_COLORS_SIZE)];
   }
}