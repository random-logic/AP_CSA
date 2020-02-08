/**
 * Cat extends Pet
 * @author Andrew
 * @version 2020
 */

public class Cat extends Pet {
  /**
   * Constructor
   * @param name pet name
   */
  public Cat (String name) {
    super(name);
  }

  /**
   * Required from the abstract class
   * @return A word that represents the pet's noise
   */
  public String makeNoise() {
    return "meow";
  }
}