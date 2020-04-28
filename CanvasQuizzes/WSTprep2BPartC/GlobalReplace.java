import java.util.*;

public class GlobalReplace {
  private static List<String> savedText = new ArrayList<String>();

  public static String replaceOne(String text, int i, int n, String sub) {
    return text.substring(0, i) + sub + text.substring(i + n);
  }

  public static String replaceAll(String text, String what, String sub) {
    savedText.add(text);
    int i = 0;
    while (i < text.length() - what.length()) {
      int index = text.indexOf(what, i);
      if (index == -1)
        break;
      text = replaceOne(text, index, index + what.length(), sub);
      i = index + what.length();
    }
    return text;
  }

  public static String undoReplaceAll() {
    if (savedText.size() == 0)
      return null;
    return savedText.get(savedText.size() - 1);
  }
}