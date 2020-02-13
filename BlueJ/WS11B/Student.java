public class Student extends Person {
  int grade;

  /**
   * Constructor
   * @param name Person's name
   * @param address Address of person's home
   * @param phone Person's phone number
   * @param email Person's email
   * @param grade Person's grade level
   */
  public Student (String name, String address, int phone, String email, int grade) {
    super(name, address, phone, email);
    this.grade = grade;
  }

  /**
   * @return String that represents this object
   */
  public String toString () {
    return super.toString() + " GRADE: " + grade;
  }
}