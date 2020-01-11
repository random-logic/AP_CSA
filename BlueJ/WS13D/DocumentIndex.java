/**
 * Store all of the IndexEntries for the IndexMaker
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {
  /**
   * No args constructor
   */
  public DocumentIndex () {
    super();
  }

  /**
   * One arg constructor
   * @param initCapacity The initial capacity of the array list
   */
  public DocumentIndex (int initCapacity) {
    super(initCapacity);
  }

  /**
   * Adds num to the IndexEntry for word by calling that IndexEntry's add method
   * @param word The word to add the index to
   * @param num The index to be added to the word
   */
  public void addWord (String word, int num) {
    int index = foundOrInserted(word);
    this.get(index).add(num);
  }

  /**
   * Extracts all words from str and for each word calls addword
   * @param str The string to extract the words from
   * @param num The index of the whole string
   */
  public void addAllWords (String str, int num) {
    String word = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
        word += str.charAt(i);
      }
      else if (!word.isEmpty()) {
        addWord(word, num);
        word = "";
      }
    }
    if (!word.isEmpty())
      addWord(word, num);
  }

  /**
   * Traverse the DocumentIndex and compare word (case blind) looking for a position where word fits alphabetically, creates new IndexEntry for word if does not exist yet
   * @param word The word of the indexEntry to find or insert
   * @return The index of the IndexEntry containing the word
   */
  private int foundOrInserted (String word) {
    int index = 0;
    while (index < this.size()) {
      if (this.get(index).getWord().compareToIgnoreCase(word) < 0)
        index++;
      else
        break;
    }
    if (index == this.size()) this.add(new IndexEntry(word));
    else if (!this.get(index).getWord().equalsIgnoreCase(word)) this.add(index, new IndexEntry(word));
    return index;
  }
}