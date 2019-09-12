/**
 * Paint a bunch of random shapes and text onto the graphic interface
 *
 * @author Andrew J
 * @version 2019
 */

import java.awt.*;
import javax.swing.*;

class Gui extends JPanel {
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.GREEN);
        
        
    }
}

public class WS03F
{   
    public static void main (String[] args) {
        JFrame window = new JFrame("Hello World");
        
        window.setBounds(100, 100, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Gui panel = new Gui();
        Container c = window.getContentPane();
        c.add(panel);
        
        window.setVisible(true);
    }
}
