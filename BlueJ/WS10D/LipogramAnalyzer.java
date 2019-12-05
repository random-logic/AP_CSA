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
    String word = "";
    boolean word_offends = false;

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (ch == ' ') {
        if (word_offends) {
          str += "" + word + "\n";
          word_offends = false;
        }
        word = "";
      }
      else {
        word += "" + ch;
        if (ch == letter)
          word_offends = true;
      }
    }

    if (word_offends)
      str += "" + word;
    
    return str;
  }
}