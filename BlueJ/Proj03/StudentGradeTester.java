/**
 * Test StudentGrade class to see if it works properly
 *
 * @author Andrew
 * @version 2019
 */
public class StudentGradeTester
{
    public static void main (String[] args) {
        StudentGrade student1 = new StudentGrade("Student 1");
        StudentGrade student2 = new StudentGrade("Student 2", 50, 100);
        
        System.out.println("Expected " + student1.getStudentName() + ": 0");
        System.out.println("Observed: " + student1.getStudentName() + ": " + student1.calcGrade());
        System.out.println("Expected " + student2.getStudentName() + ": 50");
        System.out.println("Observed: " + student2.getStudentName() + ": " + student2.calcGrade());
        
        student1.accumScore(40, 50);
        student2.dropScore(0, 50);
        
        System.out.println("Expected " + student1.getStudentName() + ": 80");
        System.out.println("Observed: " + student1.getStudentName() + ": " + student1.calcGrade());
        System.out.println("Expected " + student2.getStudentName() + ": 100");
        System.out.println("Observed: " + student2.getStudentName() + ": " + student2.calcGrade());
        
    }
}
