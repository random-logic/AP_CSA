
/**
 * Test BankAccount class.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentGrade
{
    private String student_name;
    private int total_earned_score;
    private int total_possible_score;
    
    StudentGrade(String name, int earned_score, int possible_score) {
        student_name = name;
        total_earned_score = earned_score;
        total_possible_score = possible_score;
    }
    
    public void accumScore (int score, int max_score) {
        total_earned_score += score;
        total_possible_score += max_score;
    }
    
    public void dropScore (int score, int max_score) {
        total_earned_score -= score;
        total_possible_score -= max_score;
    }
    
    public int calcGrade () {
        return total_earned_score * 100 / total_possible_score;
    }
}
