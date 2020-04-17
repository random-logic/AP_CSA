public class Customer {
  public int compareCustomer (Customer other) {
    if (getName().equals(other.getName())) {
      return getID() - other.getID();
    }
    else {
      return getName().compareTo(other.getName());
    }
  }

  public void prefixMerge (ArrayList<Customer> list1, ArrayList<Customer> list2, ArrayList<Customer> result) {
    int i = 0, j = 0;
    while (i < list1.size() && j < list2.size()) {
      int compare = list1[i].compareCustomer(list2[j]);
      if (compare < 0) {
        result.add(list1[i]);
        i++;
      }
      else if (compare > 0) {
        result.add(list2[j]);
        j++;
      }
      else {
        result.add(list1[i]);
        i++;
        j++;
      }
    }

    for (i; i < list1.size(); i++)
      result.add(list1[i]);
    
    for (j; j < list1.size(); j++)
      result.add(list2[j]);
  }
}