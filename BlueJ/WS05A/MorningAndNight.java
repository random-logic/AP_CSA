/**
 * Purpose: Animate morning and night and play sounds according to setting
 * @author Andrew
 * @version 2019
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MorningAndNight extends JFrame implements ActionListener
{
    private EasySound rooster;
    private EasySound cow;
    private boolean isMorning = true;
    private int time;

    public MorningAndNight()
    {
        super("MorningAndNight");
        
        time = 0;
        Timer clock = new Timer(5000, this); 
        clock.start();
        
        rooster = new EasySound("roost.wav");
        cow = new EasySound("cow.wav");
        
        Container c = getContentPane();
        c.setBackground(Color.WHITE);
    }
  
    public void actionPerformed(ActionEvent e)
    {
        time++;
        Container c = getContentPane();
        
        if (isMorning) {
            c.setBackground(Color.WHITE);
            rooster.play();
        }
        else {
            c.setBackground(Color.BLACK);
            cow.play();
        }
        
        isMorning = !isMorning;
    }

    public static void main(String[] args)
    {
        MorningAndNight morning = new MorningAndNight();
        morning.setSize(300, 150);
        morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
        morning.setVisible(true);
    }
}
