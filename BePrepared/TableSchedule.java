import java.util.*;

public class TableSchedule {
  ArrayList<String> schedules;

  public TableSchedule (int numTables) {
    schedules = new ArrayList<String>(numTables + 1);
  }

  public void reserve (int k, int timeSlot) {
    String str = schedules.get(k);
    str = str.substring(0, timeSlot) + "xxx" + str.substring(timeSlot + 3, 12);
  }

  public int occupiedSlots (int k) {
    String str = schedules.get(k);
    int count = 0;
    for (int i = 0; i < str.length(); i++)
      if (str.charAt(i) == 'x') count++;
    
    return count;
  }

  public int findTable (int timeSlot) {
    int bestTable = 0, bestTableOccupiedSlots = 0;
    for (int i = 0; i < schedules.size(); i++)
      if (schedules.get(i).substring(timeSlot, timeSlot + 3).equals("...") && occupiedSlots(i) > bestTableOccupiedSlots) {
        bestTable = i;
        bestTableOccupiedSlots = occupiedSlots(i);
      }
    return bestTable;
  }
}