/**
 * Purpose: This class displays a number of clover leaves.
 * @author Andrew
 * @version 2019
 */

import javax.swing.JComponent;

import javafx.stage.Window;

import java.awt.*;
import java.util.*;

 public class SceneComponent extends JComponent
{
   private static final int CLOVER_LEAVES_COUNT = 30;
   private static final int RANDOM_COLORS_SIZE = 4;
   private static final Color[] RANDOM_COLORS = {new Color(153, 98, 54), new Color(237, 115, 46), new Color(157, 34, 30), new Color(133, 157, 60)};
   private static final Color SKY_ORANGE_YELLOW = new Color(248, 177, 44);
   private static final String GREETING_MSG = "Happy Thanksgiving!";
   private static final int GREETING_FONT_SIZE = 32;
   private static final Color GREETING_MSG_COLOR = new Color(0, 0, 0);
      
   /**
    * Purpose: Paint the whole greeting card
    * @param g The graphics component
    */
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      // Draw the sky
      Rectangle sky = new Rectangle (0, 0 , getWidth(), getHeight());
      g2.setColor(SKY_ORANGE_YELLOW);
      g2.fill(sky);
      // Use this random number generator
      Random generator = new Random(42);

      // Generate and draw clover leaves
      // Your work here
      for (int i = 0; i < CLOVER_LEAVES_COUNT; i++) {
         CloverLeaf clover_leaf = new CloverLeaf(generator.nextInt(getWidth()), generator.nextInt(getHeight()), generator.nextInt(40) + 10, randomColor());
         clover_leaf.draw(g2);
      }

      Font font = new Font("TimesRoman", Font.PLAIN, GREETING_FONT_SIZE);
      FontMetrics metrics = g.getFontMetrics(font);

      g2.setFont(font);
      g2.setColor(GREETING_MSG_COLOR);
      g2.drawString(GREETING_MSG, (getWidth() - metrics.stringWidth(GREETING_MSG)) / 2, (getHeight() - metrics.getHeight()) / 2);
   }

   /**
    * Purpose: Generate a random color for the clover leaves
    * @return A random color
    */
   private static Color randomColor() {
      Random generator = new Random();
      return RANDOM_COLORS[generator.nextInt(RANDOM_COLORS_SIZE)];
   }
}