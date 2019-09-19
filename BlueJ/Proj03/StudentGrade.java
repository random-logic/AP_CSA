/**
 * Purpose: To have student grades have certain methods and behaviors
 *
 * @author Andrew
 * @version 2019
 */
public class StudentGrade
{
    private String student_name;
    private int total_earned_score;
    private int total_possible_score;
    
    /**
     * Construct a new student's grade and initialize it with no scores yet
     * @param name the student's name
     */
    StudentGrade(String name) {
        student_name = name;
        total_earned_score = 0;
        total_possible_score = 0;
    }
    
    /**
     * Construct a new student's grade and initialize it using the given scores
     * @param name the student's name
     * @param earned_score the student's total earned score so far
     * @param possible_score the student's total possible score so far
     */
    StudentGrade(String name, int earned_score, int possible_score) {
        student_name = name;
        total_earned_score = earned_score;
        total_possible_score = possible_score;
    }
    
    /**
     * Add another assignment score to the student's grade
     * @param score the score the student earned on that assignment
     * @param max_score the maximum possible score on that assignment
     */
    public void accumScore (int score, int max_score) {
        total_earned_score += score;
        total_possible_score += max_score;
    }
    
    /**
     * Remove an assignment score from the student's grade
     * @param score the score the student earned on that assignment
     * @param max_score the maximum possible score on that assignment
     */
    public void dropScore (int score, int max_score) {
        total_earned_score -= score;
        total_possible_score -= max_score;
    }
    
    /**
     * Calculate the final grade based on the cumalative score
     * @return the percentage the student earns based on the score, 0 is 0% and 100 is 100%
     */
    public int calcGrade () {
        //Safety net incase the total possible score is 0 (cannot divide by 0)
        if (total_possible_score == 0) {
            return 0;
        }
        return total_earned_score * 100 / total_possible_score;
    }
    
    /**
     * Give the name of the student that corresponds to this grade
     * @return the name of the student
     */
    public String getStudentName() {
        return student_name;
    }
}
