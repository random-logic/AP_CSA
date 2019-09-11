// Chapter 18 Question 6

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.util.Scanner;

public class ImagePanel extends JPanel
{
  private Image image;

  public ImagePanel(String fileName)
  {
    setBackground(Color.WHITE);
    image = (new ImageIcon(fileName)).getImage();
  }

  public ImagePanel(Image img)
  {
    setBackground(Color.WHITE);
    image = img;
  }

  // This method is used in our solution for Question 7
  public void setImage(Image img)
  {
    image = img;
    repaint();
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    if (image != null)
    {
      int x = (getWidth() - image.getWidth(null)) / 2;
      int y = (getHeight() - image.getHeight(null)) / 2;
      g.drawImage(image, x, y, null);
    }
  }

  public static void main(String[] args)
  {
    String fileName;
    if (args.length > 0)
      fileName = args[0];
    else
    {
      System.out.print("Image file name: ");
      Scanner kb = new Scanner(System.in);
      fileName = kb.next();
      kb.close();
    }
    JFrame window = new JFrame(fileName);
    window.setBounds(100, 100, 220, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = window.getContentPane();
    c.add(new ImagePanel(fileName));
    window.setVisible(true);
  }
}

