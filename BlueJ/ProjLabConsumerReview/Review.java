import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private ArrayList<String> posAdjectives = new ArrayList<String>();
  private ArrayList<String> negAdjectives = new ArrayList<String>();
  
  {
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
     }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt\n" + e);
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  public static double totalSentiment (String fileName) {
    ArrayList<String> strs = new ArrayList<String>();
    double sum = 0;
    Review r = new Review();

    try {
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().trim().split(" ");
        for (String str : temp)
          strs.add(str);
      }
      input.close();
     }
    catch(Exception e){
      System.out.println("Error reading or parsing " + fileName + "\n" + e);
    }

    for (String str: strs)
      sum += r.sentimentVal(str);
    
    return sum;
  }

  public static int starRating (String fileName) {
    double sum = totalSentiment(fileName);
    int rating;

    if (sum > 30)
      rating = 5;
    else if (sum > 20)
      rating = 4;
    else if (sum > 10)
      rating = 3;
    else if (sum > 0)
      rating = 2;
    else
      rating = 1;
    
    return rating;
  }

  public static String fakeReview (String fileName) {
    ArrayList<String> strs = new ArrayList<String>();
    Review r = new Review();

    try {
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().trim().split(" ");
        temp[temp.length - 1] += "\n";
        for (String str : temp)
          strs.add(str);
      }
      input.close();
     }
    catch(Exception e){
      System.out.println("Error reading or parsing " + fileName + "\n" + e);
    }

    String return_str = "";
    for (String str : strs)
      if (str.charAt(0) == '*')
        return_str += r.randomAdjective() + " ";
      else
        return_str += str + " ";
    
    return return_str;
  }

  public static String fakePositiveReview (String fileName) {
    ArrayList<String> strs = new ArrayList<String>();
    Review r = new Review();

    try {
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().trim().split(" ");
        temp[temp.length - 1] += "\n";
        for (String str : temp)
          strs.add(str);
      }
      input.close();
     }
    catch(Exception e){
      System.out.println("Error reading or parsing " + fileName + "\n" + e);
    }

    String return_str = "";
    for (String str : strs)
      if (str.charAt(0) == '*' && str.length() > 1 && r.sentimentVal(str.substring(1, str.length())) <= 0)
        return_str += r.randomPositiveAdj() + " ";
      else
        return_str += str + " ";
    
    return return_str;
  }

  public static String fakeNegativeReview (String fileName) {
    ArrayList<String> strs = new ArrayList<String>();
    Review r = new Review();

    try {
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().trim().split(" ");
        temp[temp.length - 1] += "\n";
        for (String str : temp)
          strs.add(str);
      }
      input.close();
     }
    catch(Exception e){
      System.out.println("Error reading or parsing " + fileName + "\n" + e);
    }

    String return_str = "";
    for (String str : strs)
      if (str.charAt(0) == '*' && str.length() > 1 && r.sentimentVal(str.substring(1, str.length())) >= 0)
        return_str += r.randomNegativeAdj() + " ";
      else
        return_str += str + " ";
    
    return return_str;
  }
}