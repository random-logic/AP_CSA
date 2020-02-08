/**
 * RowdyBird extends Bird
 * @author Andrew
 * @version 2020
 */

public class RowdyBird extends Bird {
  /**
   * Constructor
   * @param name pet name
   */
  public RowdyBird(String name) {
    super(name);
  }

  /**
   * Override the super method
   * @return A word that represents the pet's noise
   */
  @Override
  public String makeNoise() {
    return super.makeNoise() + super.makeNoise();
  }
}