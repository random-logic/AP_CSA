import java.util.ArrayList;

public class Faculty extends Employee {
  ArrayList<String> subjects;

  /**
   * Constructor
   * @param name Person's name
   * @param address Address of person's home
   * @param phone Person's phone number
   * @param email Person's email
   * @param room Room of person
   * @param salary Salary of person
   * @param hired Year hired
   * @param subjects The subjects the faculty teaches
   */
  public Faculty (String name, String address, int phone, String email, int room, int salary, int hired, String[] subjects) {
    super(name, address, phone, email, room, salary, hired);
    this.subjects = new ArrayList<String>(subjects.length);
    for (String subject : subjects)
      this.subjects.add(subject);
  }

  /**
   * @return String that represents the object
   */
  public String toString() {
    return super.toString() + " SUBJECTS: " + subjects;
  }
}