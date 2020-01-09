/**
 * Test the lists.
 *
 * @author Andrew
 * @version 2020
 */

import java.util.ArrayList;

public class ALTester
{
    /**
     * Have main function of program.
     */
    public static void main () {
        ArrayList<String> cityList = new ArrayList<String>();
        System.out.println(cityList.isEmpty()); //A
        
        cityList.add("San Ramon"); //B1
        System.out.println(cityList.isEmpty());
        
        System.out.println(cityList.size()); //B2
        
        cityList.add("Dublin"); //B3
        cityList.add("Danville");
        System.out.println(cityList.isEmpty());
        System.out.println(cityList.size());
        
        System.out.println(cityList); //C
        System.out.println(cityList.toString());
        
        cityList.get(-1); //D1
        cityList.get(cityList.size());
        cityList.get(cityList.size() + 1);
        
        System.out.println(cityList.indexOf("San Ramon")); //D2
        System.out.println(cityList.indexOf("Livermore"));
        
        cityList.set(0, "Pleasanton"); //E1
        System.out.println(cityList);
        System.out.println(cityList.size());
        
        cityList.remove(0); //E2
        System.out.println(cityList);
        System.out.println(cityList.size());
        
        cityList.trimToSize(); //E3
        System.out.println(cityList);
        System.out.println(cityList.size());
    }
}
