/**
 * Create a house of pets
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class HouseOfPets {
  /**
   * Test the abstract class Pet
   */
  public static void main() {
    Dog dog = new Dog("d");
    Cat cat = new Cat("c");
    Bird bird = new Bird("b");
    RowdyBird rbird = new RowdyBird("rb");
    
    ArrayList<Pet> pets = new ArrayList<Pet>(4);
    pets.add(dog);
    pets.add(cat);
    pets.add(bird);
    pets.add(rbird);

    for (Pet pet : pets)
      System.out.println(pet.getPetName() + " " + pet.makeNoise());
  }
}