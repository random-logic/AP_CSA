public class ReviewTester {
  public static void testSentimentVal () {
    Review r = new Review();
    System.out.println("1-2");
    System.out.println("happily: " + r.sentimentVal("happily"));
    System.out.println("terrible: " + r.sentimentVal("terrible"));
    System.out.println("cold: " + r.sentimentVal("cold"));
    /* 1-3 NONE COMPILES - sentimentVal is NOT a static method
    double num = sentimentVal("warm");
    String word = sentimentVal(0.5);
    double x = sentimentVal(“good”, “bad”);
    */
  }
}