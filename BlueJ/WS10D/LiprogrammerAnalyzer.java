/**
 * Purpose: Analyze the liprogrammer
 * @author Andrew
 * @version 2019
 */

public class LiprogrammerAnalyzer {
  String text;

  public LiprogrammerAnalyzer(String text) {
    this.text = text;
  }

  public String mark(char letter) {
    StringBuilder str = new StringBuilder(text);
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter) {
        str.replace(i, i + 1, "#");
      }
    }

    return str.toString();
  }

  public String allWordsWith(char letter) {
    return "";
  }
}