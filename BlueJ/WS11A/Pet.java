/**
 * Create abstract class Pet
 * @author Andrew
 * @version 2020
 */

public abstract class Pet {
  private static int lastPetID = 0;
  private int petID;
  private String petName;

  /**
   * Constructor
   * @param name pet name
   */
  public Pet (String name) {
    petName = name;
    petID = ++lastPetID;
  }

  /**
   * Return a word that represents the pet noise
   * @return pet noise
   */
  public abstract String makeNoise();
  
  /**
   * @return The pet name
   */
  public String getPetName() {
    return petName;
  }

  /**
   * @return petID
   */
  public int getPetID () {
    return petID;
  }

  /**
   * @return lastPetID
   */
  public static int getLastPetID () {
    return lastPetID;
  }
}