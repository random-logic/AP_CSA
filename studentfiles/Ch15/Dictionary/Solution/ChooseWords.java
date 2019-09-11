/*
 * This program finds all 3-, 4-, or 5-letter words from a given
 * file of words and writes them into the file RamblecsDictionary.java
 * using the syntax of a Java array of Strings.
 */

import java.util.Scanner;
import java.io.*;

public class ChooseWords
{
  private static final int MINLENGTH = 3, MAXLENGTH = 5;
  private static BufferedReader fileIn;
  private static PrintWriter fileOut;

  public static void main(String[] args) throws IOException
  {
    Scanner kboard = new Scanner(System.in);

    System.out.println();
    System.out.print("Enter input file name: ");
    String fileName = kboard.next();
    kboard.close();
    
    openInputFile(fileName);
    if (fileIn == null)
    {
      System.out.println("*** Can't open " + fileName + " ***");
      return;
    }

    createOutputFile("RamblecsDictionary.java");
    if (fileOut == null)
    {
      fileIn.close();
      System.out.println("*** Can't create RamblecsDictionary.java ***");
      return;
    }

    int count = copyWords();
    System.out.println("Done: " + count + " words.");

    fileIn.close();
    fileOut.close();
  }

  /**
   *  Opens a file fileName (in the current folder)
   *  and places a reference to it into fileIn
   */
  private static void openInputFile(String fileName)
  {
    try
    {
      fileIn = new BufferedReader(new FileReader(fileName));
    }
    catch (FileNotFoundException e)
    {
    }
  }

  /**
   *  Creates a new file fileName (in the current folder)
   *  and places a reference to it into fileOut
   */
  private static void createOutputFile(String fileName)
  {
    try
    {
      fileOut = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
    }
    catch (IOException e)
    {
    }
  }

  /**
   *  Reads all words from fileIn, selects the words that have
   *  from MINLENGTH to MAXLENGTH letters, converts them
   *  into upper case and writes the words into fileOut in
   *  Java syntax
   */
  private static int copyWords() throws IOException
  {
    String word;
    int count = 0;

    fileOut.println("public class RamblecsDictionary");
    fileOut.println("{");
    fileOut.println("  private String[] words =");
    fileOut.println("  {");
    while ((word = fileIn.readLine()) != null)
    {
      word = word.trim();       // In case there are extra spaces in words.txt
      int len = word.length();
      if (len >= MINLENGTH && len <= MAXLENGTH)
      {
        word = word.toUpperCase();
        fileOut.println("    \"" + word + "\",");
        count++;
      }
    }
    fileOut.println("  };");
    fileOut.println("}");

    return count;
  }
}
