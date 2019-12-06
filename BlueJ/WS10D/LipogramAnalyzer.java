/**
 * Purpose: Analyze the Lipogram
 * @author Andrew
 * @version 2019
 */

public class LipogramAnalyzer {
  String text;

  /**
   * Purpose: Construct the class
   * @param text The text to initialize the field with
   */
  public LipogramAnalyzer(String text) {
    this.text = text;
  }

  /**
   * Purpose: Mark the offending letters with #
   * @param letter The letters to mark
   * @return The new text with the offending letter marked
   */
  public String mark(char letter) {
    StringBuilder str = new StringBuilder(text);
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter) {
        str.replace(i, i + 1, "#");
      }
    }

    return str.toString();
  }

  /**
   * Purpose: Give all words that are offending
   * @param letter The offending letter
   * @return All of the words that are offending, seperated by \n
   */
  public String allWordsWith(char letter) {
    String str = "";

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter) {
        str += "" + extractWord(text, i) + "\n";
      }
    }

    String[] array = str.split("\n");

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i].equals(array[j]))
          array[j] = "";
      }
    }

    str = "";
    for (int i = 0; i < array.length; i++) {
      if (!array[i].equals(""))
        str += "" + array[i] + "\n";
    }
    
    return str.trim();
  }

  /**
   * Purpose: Extract a word from a given text at a given position
   * @param text The text to extract the word from
   * @param index The position to extract the word from
   * @return The extracted word
   */
  private String extractWord(String text, int index) {
    int lower = index, upper = index + 1;

    while (lower >= 0 && text.charAt(lower) != ' ')
      lower--;
    
    lower++;
    
    while (upper < text.length() && text.charAt(upper) != ' ')
      upper++;
    
    return text.substring(lower, upper);
  }
}