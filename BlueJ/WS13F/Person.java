/**
 * Purpose: Have a class reflecting a real person
 * @author Andrew
 * @version 2019
 */

import java.util.ArrayList;

public class Person {
  private String name;
  private ArrayList<String> friends;

  /**
   * Purpose: Constructor
   * @param name The name of the person
   */
  public Person(String name) {
    this.name = name;
    this.friends = new ArrayList<String>();
  }

  /**
   * Purpose: Get the name of the person
   * @return The name of the person
   */
  public String getName() {
    return name;
  }

  /**
   * Purpose: Add a friend
   * @param add The friend's name to add
   */
  public void addFriend(String add) {
    int index = 0;
    while (index < friends.size()) {
      if (friends.get(index).compareToIgnoreCase(add) >= 0) {
        if (!friends.get(index).equalsIgnoreCase(add))
          friends.add(index, add);
        return;
      }
      index++;
    }
    friends.add(add);
  }

    /**
   * Purpose: Add a friend
   * @param add The friend to add
   */
  public void addFriend(Person add) {
    int index = 0;
    while (index < friends.size()) {
      if (friends.get(index).compareToIgnoreCase(add.name) >= 0) {
        if (!friends.get(index).equalsIgnoreCase(add.name))
          friends.add(index, add.name);
        break;
      }
      index++;
    }
    friends.add(add.name);
  }

  /**
   * Purpose: Remove a friend
   * @param remove The friend's name to remove
   */
  public void unfriend(String remove) {
    int index = 0;
    while (index < friends.size()) {
      if (friends.get(index).equalsIgnoreCase(remove)) {
        friends.remove(index);
        break;
      }
      index++;
    }
  }

  /**
   * Purpose: Remove a friend
   * @param remove The friend to remove
   */
  public void unfriend(Person remove) {
    int index = 0;
    while (index < friends.size()) {
      if (friends.get(index).equalsIgnoreCase(remove.name)) {
        friends.remove(index);
        break;
      }
      index++;
    }
  }

  /**
   * Purpose: Convert the person object to a string
   * @return The string representing the person object
   */
  public String toString() {
    return name + ": " + friends.toString().substring(1, friends.toString().length() - 1);
  }

  /**
   * Purpose: Test the class
   */
  public static void main() {
    Person person = new Person ("James");

    person.addFriend("Sam");
    person.addFriend("SAM");
    
    System.out.println(person);

    person.addFriend("YEET");

    System.out.println(person);

    person.unfriend("sAm");

    System.out.println(person);
  }
}