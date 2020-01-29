/**
* Write a description of class StudentTester here.
*
* @author Anh Nguyen
* @version 2.0
*/
public class StudentTesterQA
{
public static void main(String[] args)
{
Student stu = new Student("Grizzly Bear", 10);
System.out.println("\nStep 1: Name (no scores yet)\n" + stu);

stu.accumScore(19, 20);
stu.accumScore(30, 35);
stu.accumScore(4, 5);
stu.accumScore(20, 20);
stu.accumScore(19, 20);
stu.accumScore(30, 35);
stu.accumScore(19, 20);
stu.accumScore(30, 35);
stu.accumScore(4, 5);
stu.accumScore(20, 20);
//stu.accumScore(19, 20);
//stu.accumScore(30, 35);

System.out.println("\n...................................................");
System.out.println("\nStep 2.a: Name & scores:\n" + stu);
System.out.printf("Step 2.b: Grade is %5.2f\n", stu.calcGrade());

System.out.println("\n...................................................");
stu.dropLowestScore();
System.out.println("\nStep 3.a: Name & scores:\n" + stu);
System.out.printf("Step 3.b: Grade after dropping lowest score is %5.2f\n", stu.calcGrade());

System.out.println("\n...................................................");
}
}