/**
* View the shapes on shape component
*
* @author Andrew J
* @version 2019
*/

//USE TRANSLATE for RECT
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class WS03F
{   
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 600);
        frame.setTitle("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        WS03FShapeComponent component = new WS03FShapeComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
