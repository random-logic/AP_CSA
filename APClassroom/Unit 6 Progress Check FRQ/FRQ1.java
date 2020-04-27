class FRQ1 {
  public static void main () {
    String[] strs = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
    for (String str : strs) {
      if (str.substring(str.length() - 3, str.length()).equals("ing")) {
        System.out.println(str);
      }
    }
  }
}