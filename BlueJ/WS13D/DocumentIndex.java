/**
 * 
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class DocumentIndex {
  private ArrayList<IndexEntry> indexEntries;

  /**
   * No args constructor
   */
  public DocumentIndex () {
    indexEntries = new ArrayList<IndexEntry> ();
  }

  /**
   * One arg constructor
   * @param initCapacity The initial capacity of the array list
   */
  public DocumentIndex (int initCapacity) {
    indexEntries = new ArrayList<IndexEntry> (initCapacity);
  }

  /**
   * Adds num to the IndexEntry for word by calling that IndexEntry's add method, creates new IndexEntry for word if does not exist yet
   * @param word The word to add the index to
   * @param num The index to be added to the word
   */
  public void addWord (String word, int num) {
    for (IndexEntry indexEntry : indexEntries) {
      if (word.equals(indexEntry.getWord())) {
        indexEntry.add(num);
        return;
      }
    }
    IndexEntry indexEntry = new IndexEntry(word);
    indexEntry.add(num);
    indexEntries.add(indexEntry);
  }

  /**
   * Extracts all words from str and for each word calls addword
   * @param str The string to extract the words from
   * @param num The index of the whole string
   */
  public void addAllWords (String str, int num) {
  }

  /**
   * 
   * @param word
   * @return
   */
  private int foundOrInserted (String word) {
  }
}