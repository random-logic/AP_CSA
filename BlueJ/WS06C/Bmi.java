/**
 * Purpose: To calculate BMI
 * @author Andrew
 * @version 2019
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Bmi extends JFrame
  implements ActionListener
{
  JTextField inputLbs, inputInches, displayBmi;

  /**
   * Purpose: Construct Bmi Class
   */
  public Bmi()
  {
    super("BMI Calculator");
    JLabel labelLbs = new JLabel("Weight (lbs):", SwingConstants.RIGHT);
    inputLbs = new JTextField(5);
    JLabel labelInches = new JLabel("Height (inches):", SwingConstants.RIGHT);
    inputInches = new JTextField(5);
    JLabel labelBmi = new JLabel("BMI = ", SwingConstants.RIGHT);
    displayBmi = new JTextField(5);
    displayBmi.setEditable(false);
    JButton go = new JButton("Compute");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setBackground(Color.white);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(3, 2, 5, 5));
    p.add(labelLbs);
    p.add(inputLbs);
    p.add(labelInches);
    p.add(inputInches);
    p.add(labelBmi);
    p.add(displayBmi);
    c.add(p, BorderLayout.CENTER);
    c.add(go, BorderLayout.SOUTH);
  }

  /**
   * Purpose: Perform an action for an abstract class
   * @param e The ActionEvent object
   */
  public void actionPerformed(ActionEvent e)
  {
    int lbs = Integer.parseInt(inputLbs.getText());
    int inches = Integer.parseInt(inputInches.getText());
    double bmi = calculateBmi(lbs, inches);
    DecimalFormat df = new DecimalFormat("00.0");
    displayBmi.setText(df.format(bmi));
  }

  /**
   * Purpose: Calculate the bmi
   * @param lbs The weight of the person in lbs
   * @param inches The height of the person in inches
   * @return The BMI of the person
   */
  private double calculateBmi(int lbs, int inches)
  {
    final double in_convert_to_m = 0.0254;
    double m = inches * in_convert_to_m;
    
    final double lb_convert_to_kg = 0.454;
    double kg = lbs * lb_convert_to_kg;

    return kg / m / m;
  }

  /**
   * Purpose: Initialize the program and the window and also test class
   * @param args The arguments (strings) to be passed in the main method
   */
  public static void main(String[] args)
  {
    Bmi w = new Bmi();
    w.setBounds(300, 300, 300, 160);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}
