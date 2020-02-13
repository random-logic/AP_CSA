public class Employee extends Person {
  private int room;
  private int salary;
  private int hired;

  /**
   * Constructor
   * @param name Person's name
   * @param address Address of person's home
   * @param phone Person's phone number
   * @param email Person's email
   * @param room Room of person
   * @param salary Salary of person
   * @param hired Year hired
   */
  public Employee (String name, String address, int phone, String email, int room, int salary, int hired) {
    super(name, address, phone, email);
    this.room = room;
    this.salary = salary;
    this.hired = hired;
  }

  /**
   * @return String that represents this object
   */
  public String toString() {
    return super.toString() + " ROOM: " + room + " SALARY: " + salary + " HIRED: " + hired;
  }
}