/**
 * Store all of the indexes for a word
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class IndexEntry {
  private String word;
  private ArrayList<Integer> numList;

  /**
   * One args constructor
   * @param word
   */
  public IndexEntry (String word) {
    this.word = word;
    numList = new ArrayList<Integer> ();
  }

  /**
   * Appends num to numList, but only if it is not already in that list
   * @param num The number to add to the list
   */
  public void add (int num) {
    for (Integer integer : numList) {
      if (integer.equals(new Integer (num)))
        return;
    }
    numList.add(new Integer (num));
  }

  /**
   * Return the word
   * @return The word
   */
  public String getWord () {
    return word;
  }

  /**
   * Convert this object to a string
   * @return The string representing the object
   */
  public String toString () {
    String returnString = word + " ";
    for (Integer integer : numList) {
      returnString += Integer.toString(integer) + " ";
    }
    return returnString.trim();
  }
}