/**
 * Test how to insert elements into the array list in alphabetical order
 *
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class G
{
    /**
     * Insert the string into array list so the list stays in alphabetical order
     * @param list The arraylist to insert the text into
     * @param text The text to be inserted into the arraylist
     */
    public static void insert (ArrayList<String> list, String text) {
        for (int indexToInsert = 0; indexToInsert < list.size(); indexToInsert++) {
            if (list.get(indexToInsert).compareTo(text) >= 0) {
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
        insert(cities, "Chicago");
        insert(cities, "New York");
        insert(cities, "Dublin");
        insert(cities, "Los Angeles");
        insert(cities, "San Ramon");
        insert(cities, "Chicago");
        insert(cities, "Dublin");

        System.out.println(cities);
    }
}
