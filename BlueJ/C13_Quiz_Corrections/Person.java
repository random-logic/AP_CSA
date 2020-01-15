/**
 * Quiz corrections C13
 *
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

 public class Person
{
    private String ownName;
    private int ownAge;
    private ArrayList<String> friendsNames;

    public Person (String givenName, int givenAge) {
        ownName = givenName;
        ownAge = givenAge;
        friendsNames = new ArrayList<String>();
    }

    public String getOwnName () {
        return ownName;
    }

    public int getOwnAge () {
        return ownAge;
    }

    public int getFriendCount () {
        return friendsNames.size();
    }

    public String getAllFriendsNames () {
        return friendsNames.toString().substring(1, friendsNames.toString().length() - 1);
    }

    public String get1FriendsName (int index) {
        if (index < 0 || index >= friendsNames.size())
            return "";
        return friendsNames.get(index);
    }

    public void setOwnAge (int givenAge) {
        ownAge = givenAge;
    }

    public void addFriend (Person aFriend) {
        friendsNames.add(aFriend.ownName);
        int nameCount = 0;
        for (String friend : friendsNames) {
            if (aFriend.ownName.equalsIgnoreCase(friend))
                nameCount++;
        }
        if (nameCount > 1)
            friendsNames.remove(aFriend.ownName);
    }

    public double calcAvgNameLength () {
        int sumOfLengths = 0;
        for (String friend : friendsNames) {
            sumOfLengths += friend.length();
        }
        return ((double) sumOfLengths) / friendsNames.size();
    }
}
