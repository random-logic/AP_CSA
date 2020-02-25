/**
 * Ship
 * @author Andrew
 * @version 2020
 */

class Ship {
  private String name;
  private int year;

  /**
   * Constructor
   * @param name Name of the ship
   * @param year Year ship is built
   */
  public Ship (String name, int year) {
    this.name = name;
    this.year = year;
  }

  /**
   * @return String representation of this object
   */
  public String toString () {
    return name + ": Built in " + year;
  }
}