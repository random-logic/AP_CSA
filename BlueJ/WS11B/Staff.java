public class Staff extends Employee {
  String title;

  /**
   * Constructor
   * @param name Person's name
   * @param address Address of person's home
   * @param phone Person's phone number
   * @param email Person's email
   * @param room Room of person
   * @param salary Salary of person
   * @param hired Year hired
   * @param title The title of the staff's job
   */
  public Staff (String name, String address, int phone, String email, int room, int salary, int hired, String title) {
    super(name, address, phone, email, room, salary, hired);
    this.title = title;
  }

  /**
   * @return String that represents the object
   */
  public String toString() {
    return super.toString() + " TITLE: " + title;
  }
}