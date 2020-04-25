public class WSTPrep3D {
  public static void main () {
    String fullName = "M. YEET JR";

    final String BLANK = " ";
    String temp, firstName;

    //1
    int k = fullName.indexOf(BLANK);
    temp = fullName.substring(k + 1);
    k = temp.indexOf(BLANK);
    firstName = temp.substring(0, k);

    //2
    k = fullName.indexOf(BLANK);
    firstName = fullName.substring(k + 1);
    k = firstName.indexOf(BLANK);
    firstName = firstName.substring(0, k);

    //3
    int firstBlank = fullName.indexOf(BLANK);
    int secondBlank = fullName.indexOf(BLANK);
    firstName = fullName.substring(firstBlank + 1, secondBlank + 1);

    System.out.println(firstName);
  }
}