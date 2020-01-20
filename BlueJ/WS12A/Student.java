import java.util.ArrayList;

public class Student extends Person {
  private int scoreCount;
  private ArrayList<Integer> earnedPts;
  private ArrayList<Integer> maxPts;

  public Student (String name, int age) {
    super(name, age);
    scoreCount = 0;
    earnedPts = new ArrayList<Integer> ();
    maxPts = new ArrayList<Integer> ();
  }

  public void accumScore (int score, int maxScore) {
    earnedPts.add(score);
    maxPts.add(maxScore);
    scoreCount++;
  }

  public double calcGrade () {
    int earnedPts = 0;
    int maxPts = 0;
    for (Integer pts : this.earnedPts)
      earnedPts += pts;
    for (Integer pts : this.maxPts)
      maxPts += pts;
    if (maxPts == 0)
      return Double.MAX_VALUE;
    return ((double) earnedPts) / maxPts * 100;
  }

  public void dropLowestScore() {
    int index = 0;
    double percent = 100;
    for (int i = 0; i < earnedPts.size(); i++) {
      double newPercent = ((double) earnedPts.get(i)) / maxPts.get(i) * 100;
      if (newPercent < percent) {
        index = i;
        percent = newPercent;
      }
    }
    earnedPts.remove(index);
    maxPts.remove(index);
  }

  public String toString () {
    String str = " Scores:";
    for (int i = 0; i < earnedPts.size(); i++) {
      str += " " + earnedPts.get(i) + "/" + maxPts.get(i);
    }
    return super.toString() + str;
  }
}