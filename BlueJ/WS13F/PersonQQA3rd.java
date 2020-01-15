/**

 * Write a description of class PersonTesterQ here.

 *

 * @author Anh Nguyen

 * @version v. 07

 */

public class PersonQQA3rd

{   

    public static void main(String[] args)

    {

        String[] nameArr = {"Aditya", "Taylor", "Shree", "Raj", "Ipsita", "Om", "Kannan", "Isabella", "Rayan", "James", "Andrew", "Brian", "Yuval", "David", "Archit", "Rohan", "Samar", "Aniruddh", "Justin", "Sam", "Emily", "Nahom"};

       

        int count = nameArr.length;

        int prtCt = count/6;

        int mxFrCt = (int) (Math.random() * prtCt * 2) + prtCt * 2;

       

        int selfAge = 15;

       

        int selfIndex = (int) (Math.random() * count);

        Person selfPerson = new Person(nameArr[selfIndex], selfAge);

        System.out.println("I am " + selfPerson.getOwnName() + ", " + selfPerson.getOwnAge() + " years old.");

       

        System.out.println("\nI have no friends yet." );

        String names = selfPerson.getAllFriendsNames();

        if (names.length() > 0) {

            System.out.println("... BUT THERE ARE NAMES: " + names +"!");

        }

       

 

        System.out.println("\nI am trying to friend with ..." );

       

        int rIndex;

       

        for (int i = 0; i < mxFrCt; i++)

        {

            do rIndex = (int) (Math.random() * count);

                while (rIndex == selfIndex);

            Person aFriend = new Person(nameArr[rIndex], 15);

            selfPerson.addFriend(aFriend);

            System.out.println(i+1 + "..." + aFriend.getOwnName());

        }

       

        if (mxFrCt != selfPerson.getFriendCount())

        {

            System.out.println("\nI tried to add " + mxFrCt +

                               " friends; my list has " + selfPerson.getFriendCount() + "(because duplicates were not added).");

        }

      

       System.out.println("\nBased on method 'getAllFriendsNames', my " + selfPerson.getFriendCount() + " friends are "

                          + selfPerson.getAllFriendsNames() + ".");

       System.out.println("\nBased on the list, my friends are ... ");

       for (int i = 0; i < selfPerson.getFriendCount(); i++)

        {

            System.out.println(i + 1 + ": " + selfPerson.get1FriendsName(i));

        }

 

        // FIND AVERAGE NAME LENGTH

        System.out.println("\nRESULT: average name length is " +

                         selfPerson.calcAvgNameLength());                        

                  

       System.out.println();

       selfPerson.setOwnAge(selfAge+1);

       if (selfPerson.getOwnAge() != selfAge+1)

         System.out.println("The was something wrong with my birthday!");

       else

          System.out.println("I just had a birthday. My age is " + selfPerson.getOwnAge() + " now.");       

        System.out.println("I will now remove a friend called " + selfPerson.get1FriendsName(0));

        selfPerson.unfriend(selfPerson.get1FriendsName(0));

        System.out.println(selfPerson.toString());
    }
}