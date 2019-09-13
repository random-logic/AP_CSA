import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class ShapeComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      // Show the boundary for the image
      g2.setColor(Color.LIGHT_GRAY);
      g2.draw(new Rectangle(0, 0, 480, 570));
      
      
      // Prepare some colors from scratch (max=255): RGB, or RGB & alpha value
      Color colorScr1 = new Color(200, 0, 250); //200, 150, 180
      Color colorBlankOut = new Color(255, 255, 255, 150); // to blank out
      
      // Construct a few shapes
      Rectangle box1 = new Rectangle(9, 11, 157, 371);
      Ellipse2D.Double oval1 = new Ellipse2D.Double(240, 360, 70, 30);
      
      // Construct a line
      Line2D.Double aLine = new Line2D.Double(30, 120, 55, 95);

      // Construct a polygon
      int[] xCoords = {177, 40, 230};
      int[] yCoords = {1261, 111, 70};
      Polygon aPoly = new Polygon(xCoords, yCoords, 5);
      
      // Draw rectangle
      g2.setColor(Color.red);
      g2.draw(box1);
      
      // Fill rectangle
      box1.grow(-10, -10); // Shrink box, all 4 sides
      g2.setColor(colorScr1); // use default color - see Color class in Java API
      g2.fill(box1);
      
      // Blank out some of the color inside the rectangle
      box1.grow(-20, -20); // Shrink box, all 4 sides
      g2.setColor(colorBlankOut); // use default color - see Color class in Java API
      g2.fill(box1);
      
      // Fill oval
      Color colorScr2 = new Color(0, 255, 0);
      g2.setColor(colorScr2);    
      g2.fill(oval1);
      
      // Draw line
      g2.setStroke(new BasicStroke(5));
      g2.setColor(Color.MAGENTA); // use default color - see Color class in Java API    
      g2.draw(aLine);
      
      // Draw & fill polygon
      g2.setColor(Color.ORANGE); // use default color - see Color class in Java API    
      g2.draw(aPoly);
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.fill(aPoly);
      
      // Write some text
      Font txtFont = new Font("Serif", Font.BOLD,30);
      g2.setFont(txtFont);
      g2.setColor(Color.RED);
      g2.drawString("Hello, World", 210, 150);
      
   }
}
