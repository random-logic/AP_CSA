/**
 * Purpose: Draw a balloon
 * @author Andrew
 * @version 2019
 */

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.Graphics2D;

public class Balloon
{
   private Ellipse2D.Double balloon;
   private Line2D.Double string;
   private Color color;

   /**
      Construct a balloon.   
      @param centerx the x-coordinate of the balloon's center
      @param centery the y-coordinate of the balloon's center
      @param radius the balloon's radius
      @param color the balloon's color
   */
   public Balloon(int centerx, int centery, int radius, Color color)
   {
      balloon = new Ellipse2D.Double(centerx - radius, centery - radius,
         2 * radius, 2 * radius);
                      
      string = new Line2D.Double(centerx, centery + radius, centerx, centery + 3 * radius);
      this.color = color;
   }

   /**
    * Purpose: Draw a balloon
    * @param g2 The graphics to draw it on
    */
   public void draw(Graphics2D g2)
   {
      g2.setColor(color);
      g2.fill(balloon);
      g2.setColor(Color.WHITE);
      g2.draw(string);
   }
}