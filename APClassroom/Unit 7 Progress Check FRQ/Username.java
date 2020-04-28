import java.util.*;

class Username {
  private ArrayList<String> possibleNames;
  
  public Username (String firstName, String lastName) {
    possibleNames = new ArrayList<String>();
    for (int i = 1; i <= firstName.length(); i++) {
      possibleNames.add(lastName + firstName.substring(0, i));
    }
  }

  public boolean isUsed(String name, String[] arr) {
    for (String str : arr) {
      if (name.equals(str))
        return true;
    }
    return false;
  }

  public void setAvailableUserNames (String[] usedNames) {
    for (int i = 0; i < possibleNames.size(); i++) {
      if (isUsed(possibleNames.get(i), usedNames)) {
        possibleNames.remove(i);
        i--;
      }
    }
  }
}