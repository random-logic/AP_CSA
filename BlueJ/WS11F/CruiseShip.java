/**
 * Ship
 * @author Andrew
 * @version 2020
 */

public class CruiseShip extends Ship {
  private int numPassengers;

  /**
   * Constructor
   * @param name Name of ship
   * @param year Year ship was built
   * @param numPassengers Passenger cap of ship
   */
  public CruiseShip (String name, int year, int numPassengers) {
    super(name, year);
    this.numPassengers = numPassengers;
  }

  /**
   * @return String representation of this object
   */
  public String toString () {
    return super.toString() + " with a passenger cap of " + numPassengers;
  }
}