public class Tester {
  public static void main () {
    Person person = new Person ("james", "censored", 0000000, "hornyjames@onemilliondancestudio.com");
    Employee employee = new Employee("Tori", "not applicable", 1111111, "tori@tori.com", 10, 1000000, 2020);
    String[] subjects = {"AP CSA", "Precalc"};
    Faculty faculty = new Faculty("Nguyen", "random street", 2222222, "nguyen@apcsa.com", 51, 2000000, 2010, subjects);
    Staff staff = new Staff("Cranford", "idk", 3333333, "cranfordnot@calhigh.net", 95, 9000000, 2004, "Used to be Principal");
    Student student = new Student("Nohom", "yeet", 4444444, "nohomis@school.com", 11);
    System.out.println(person);
    System.out.println(employee);
    System.out.println(faculty);
    System.out.println(staff);
    System.out.println(student);
  }
}