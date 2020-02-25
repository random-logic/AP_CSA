/**
 * Ship
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class ShipTester {
  /**
   * Tester
   */
  public static void main () {
    ArrayList<Ship> ships = new ArrayList<Ship>();
    ships.add(new CargoShip("C1", 2001, 10));
    ships.add(new CruiseShip("P1", 2006, 60));
    ships.add(new CargoShip("C2", 2002, 20));
    ships.add(new CruiseShip("P2", 2007, 70));
    ships.add(new CargoShip("C3", 2003, 30));
    ships.add(new CruiseShip("P3", 2008, 80));
    ships.add(new CargoShip("C4", 2004, 40));
    ships.add(new CruiseShip("P4", 2009, 90));
    ships.add(new CargoShip("C5", 2005, 50));
    ships.add(new CruiseShip("P5", 2010, 100));

    System.out.println(ships);
  }
}