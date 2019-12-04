/**
 * Purpose: Draw a clover leaf
 * @author Andrew
 * @version 2019
 */

import java.awt.geom.*;
import java.awt.Color;
import java.awt.Graphics2D;

public class CloverLeaf
{
   private Ellipse2D.Double c, c2, c3, c4, c5;
   private Rectangle2D.Double rect, rect2;
   private Color color;

   /**
      Construct a clover leaf.   
      @param centerx the x-coordinate of the clover leaf's center
      @param centery the y-coordinate of the clover leaf's center
      @param radius the clover leaf's radius
      @param color the clover leaf's color
   */
   public CloverLeaf(int centerx, int centery, int radius, Color color)
   {
      c = new Ellipse2D.Double(centerx, centery, radius, radius * 2);
      c2 = new Ellipse2D.Double(centerx - radius / 2, centery - radius, radius, radius * 2);
      c3 = new Ellipse2D.Double(centerx + radius / 2, centery - radius, radius, radius * 2);
      c4 = new Ellipse2D.Double(centerx - radius / 2, centery + radius, radius, radius * 2);
      c5 = new Ellipse2D.Double(centerx + radius / 2, centery + radius, radius, radius * 2);
      this.color = color;
   }

   /**
    * Purpose: Draw a clover leaf
    * @param g2 The graphics to draw it on
    */
   public void draw(Graphics2D g2)
   {
      g2.setColor(color);
      g2.fill(c);
      g2.fill(c2);
      g2.fill(c3);
      g2.fill(c4);
      g2.fill(c5);
   }
}