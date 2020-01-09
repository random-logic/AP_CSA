/**
 * Test how to insert elements into the array list in reverse alphabetical order
 *
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class H
{
    /**
     * Insert unique elements in reverse alphabetical order ignoring case
     * @param list The list to add the text into
     * @param text The string to be added into the list
     */
    public static void insert (ArrayList<String> list, String text) {
        for (int indexToInsert = 0; indexToInsert < list.size(); indexToInsert++) {
            if (list.get(indexToInsert).compareToIgnoreCase(text) <= 0) {
                if (list.get(indexToInsert).compareToIgnoreCase(text) != 0)
                    list.add(indexToInsert, text);
                return;
            }
        }
        list.add(text);
    }

    /**
     * Test the insert method above
     */
    public static void main () {
        ArrayList<String> cities = new ArrayList<String> ();

        insert(cities, "San Francisco");
        insert(cities, "CHICAGO");
        insert(cities, "New York");
        insert(cities, "Dubai");
        insert(cities, "Los Angeles");
        insert(cities, "San Ramon");
        insert(cities, "Chicago");
        insert(cities, "DUblin");
        insert(cities, "Los Angeles");

        System.out.println(cities);
    }
}
