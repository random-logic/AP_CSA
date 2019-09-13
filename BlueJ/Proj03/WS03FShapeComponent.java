/**
 * Paint a bunch of random shapes and text onto the graphic interface
 *
 * @author Andrew J
 * @version 2019
 */

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

public class WS03FShapeComponent extends JComponent
{    
    public void paintComponent(Graphics g)
    {
        //Define some colors
        final Color PURPLE = new Color(128, 0, 128);
        final Color GOLD = new Color(255, 215, 0);
        final Color COLOR_BLANKOUT = new Color(250, 250, 250, 149); // to blank out
        
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        // Show the boundary for the image
        g2.setColor(PURPLE);
        g2.draw(new Rectangle(0, 0, 480, 570));
        
        // Construct a few shapes
        Rectangle box1 = new Rectangle(9, 11, 157, 371);
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(240, 360, 70, 30);
        
        // Construct a line
        Line2D.Double aLine = new Line2D.Double(30, 120, 55, 95);
        
        // Construct a polygon
        int[] xCoords = {177, 40, 230, 112, 345};
        int[] yCoords = {261, 111, 70, 361, 271};
        Polygon aPoly = new Polygon(xCoords, yCoords, 5);
        
        // Draw rectangle
        g2.setColor(GOLD);
        g2.draw(box1);
        
        // Fill rectangle
        box1.grow(-40, 5); // Shrink box, all 4 sides
        g2.setColor(PURPLE);
        g2.fill(box1);
        
        // Blank out some of the color
        box1.grow(25, -75); // Shrink box, all 4 sides
        box1.translate(0, 10);
        g2.setColor(COLOR_BLANKOUT); 
        g2.fill(box1);
        
        // Fill ellipse
        g2.setColor(Color.BLACK);    
        g2.fill(ellipse1);
        
        // Draw line
        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.RED); // use default color - see Color class in Java API    
        g2.draw(aLine);
        
        // Draw & fill polygon
        g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
        g2.draw(aPoly);
        g2.setColor(Color.GREEN); // use default color - see Color class in Java API    
        g2.fill(aPoly);
        
        // Write some text
        Font txtFont = new Font("Arial", Font.BOLD,14);
        g2.setFont(txtFont);
        g2.setColor(Color.RED);
        g2.drawString("Java is AWESOME!!!!!", 210, 150);
    }
}
