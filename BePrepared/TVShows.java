import java.util.ArrayList;
import java.util.List;

public class TVShows {
  public static int matches(List<String> shows, String title) {
    int count = 0;
    for (String show : shows)
      if (show.equals(title)) count++;
    return count;
  }

  public static String leastPopular(List<String> shows) {
    String str = shows.get(0);
    int count = matches(shows, str);
    for (String show : shows) {
      int thisCount = matches(shows, show);
      if (count > thisCount) {
        str = show;
        count = thisCount;
      }
    }
    return str;
  }

  public static void removeLeastPopular(List<String> shows) {
    String str = leastPopular(shows);
    for (int count = matches(shows, str); count > 0; count--)
      shows.remove(str);
  }

  public static ArrayList<String> popularShows (List<String> shows) {
    ArrayList<String> popShows = new ArrayList<String>();
    while (!shows.isEmpty()) {
      popShows.add(0, leastPopular(shows));
      removeLeastPopular(shows);
    }
    return popShows;
  }
}