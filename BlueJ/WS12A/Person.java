/**
 * Purpose: Have a class reflecting a real person
 * @author Andrew
 * @version 2019
 */

import java.util.ArrayList;

public class Person {
  private String name;
  private int age;
  private ArrayList<String> friends;

  /**
   * Purpose: Constructor
   * @param name The name of the person
   */
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.friends = new ArrayList<String>();
  }

  /**
   * Purpose: Get the name of the person
   * @return The name of the person
   */
  public String getOwnName() {
    return name;
  }

  /**
   * Purpose: Get the age of the person
   * @return The age of the person
   */
  public int getOwnAge() {
    return age;
  }

  /**
   * Purpose: Set the age of the person
   * @param age The new age of the person
   */
  public void setOwnAge(int age) {
    this.age = age;
  }

  /**
   * Purpose: Get the number of friends
   * @return The number of friends
   */
  public int getFriendCount () {
    return friends.size();
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
        return;
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
   * Purpose: Get the average length of all the friends names
   * @return The average length of all the friends names
   */
  public double calcAvgNameLength () {
    int sumOfLengths = 0;
    for (String friend : friends) {
        sumOfLengths += friend.length();
    }
    return ((double) sumOfLengths) / friends.size();
  }

  /**
   * Purpose: Get all friends names
   * @return All the friends names
   */
  public String getAllFriendsNames () {
    return friends.toString().substring(1, friends.toString().length() - 1);
  }

  /**
   * Purpose: Get one friends name
   * @param index The index of the friends name
   * @return The friends name at the specified index
   */
  public String get1FriendsName (int index) {
    if (index < 0 || index >= friends.size())
        return "";
    return friends.get(index);
  }

  /**
   * Purpose: Convert the person object to a string
   * @return The string representing the person object
   */
  public String toString() {
    return name + "(Age " + age + "): " + friends.toString().substring(1, friends.toString().length() - 1);
  }
}