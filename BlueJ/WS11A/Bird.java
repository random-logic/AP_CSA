/**
 * Bird extends Pet
 * @author Andrew
 * @version 2020
 */

public class Bird extends Pet {
  /**
   * Constructor
   * @param name pet name
   */
  public Bird (String name) {
    super(name);
  }

  /**
   * Required from the abstract class
   * @return A word that represents the pet's noise
   */
  public String makeNoise() {
    return "chirp";
  }
}