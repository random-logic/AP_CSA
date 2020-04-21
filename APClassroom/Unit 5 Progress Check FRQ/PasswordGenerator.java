import java.util.*;

//2
public class PasswordGenerator {
  private static int count = 0;
  private String prefix;
  private int number;
  private Random rnd;

  public PasswordGenerator(int n, String p) {
    number = n;
    prefix = p;
    rnd = new Random();
  }
  
  public PasswordGenerator(int n) {
    number = n;
    prefix = "A";
    rnd = new Random();
  }

  public String pwGen() {
    String str = prefix + ".";
    for (int i = 0; i < number; i++) {
      str += rnd.nextInt(10);
    }
    count++;
    return str;
  }

  public static int pwCount() {
    return count;
  }

  //FOR TESTING PURPOSES
  public static void main() {
    PasswordGenerator pw1 = new PasswordGenerator(5);
    for (int i = 0; i < 3; i++) System.out.println(pw1.pwGen() + " Count: " + pwCount());

    PasswordGenerator pw2 = new PasswordGenerator(8, "YEET");
    for (int i = 0; i < 5; i++) System.out.println(pw2.pwGen() + " Count: " + pwCount());
  }
}