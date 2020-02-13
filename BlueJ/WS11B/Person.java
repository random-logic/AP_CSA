public class Person {
  private String name;
  private String address;
  private int phone;
  private String email;

  /**
   * Constructor
   * @param name Person's name
   * @param address Address of person's home
   * @param phone Person's phone number
   * @param email Person's email
   */
  public Person (String name, String address, int phone, String email) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  /**
   * @return String that represents this object
   */
  public String toString () {
    return "NAME: " + name + " PHONE: " + phone + " ADDRESS: " + address + " EMAIL: " + email;
  }
}