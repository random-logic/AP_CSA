public class StudentTester {
  public static void main () {
    Student stu = new Student("Yeet", 16);

    System.out.println(stu);
    
    stu.accumScore(3, 4);
    stu.accumScore(1, 2);
    stu.accumScore(5, 6);
    stu.accumScore(7, 8);
    
    System.out.println(stu);
    System.out.println("Grade: " + stu.calcGrade() + "%");
    
    stu.dropLowestScore();
    
    System.out.println(stu);
    System.out.println("Grade: " + stu.calcGrade() + "%");
  }
}