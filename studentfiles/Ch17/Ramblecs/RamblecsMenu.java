import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

/**
 * A menu bar for the Ramblecs game
 */
public class RamblecsMenu extends JMenuBar
    implements ActionListener
{
  // Fields:
  _______________________________________
  ...

  // Constructor:
  public RamblecsMenu(Ramblecs game)
  {
    _______________________________________
    ...
  }

  public boolean soundEnabled()
  {
    _______________________________________
    ...
  }

  public void actionPerformed(ActionEvent e)
  {
    JMenuItem src = (JMenuItem)e.getSource();
    _______________________________________
    ...
  }
}

