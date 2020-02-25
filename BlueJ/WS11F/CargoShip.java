/**
 * Ship
 * @author Andrew
 * @version 2020
 */

public class CargoShip extends Ship {
  private int numCargo;

  /**
   * Constructor
   * @param name Name of ship
   * @param year Year ship was built
   * @param numCargo Cargo cap of ship
   */
  public CargoShip (String name, int year, int numCargo) {
    super(name, year);
    this.numCargo = numCargo;
  }

  /**
   * @return String representation of this object
   */
  public String toString () {
    return super.toString() + " with cargo cap of " + numCargo;
  }
}