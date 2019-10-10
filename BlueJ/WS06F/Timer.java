/**
   A timer keeps tracks of the total elapsed time.
*/
public class Timer
{
   private int hours;
   private int minutes;

   /**
      Construct a timer with 0:0O elapsed time
   */
   public Timer()
   {
      hours = 0;
      minutes = 0;
   }
   
   /**
      Adds a given number of minutes to the elapsed time.
      @param minutesToAdd the number of minutes (>=0; may be larger than 60)
   */
   public void add(int minutesToAdd)
   {
      // your work here
      minutes += minutesToAdd;
      
      while (minutes > 59) {
         minutes -= 60;
         hours++;
      }
   }
   
   /**
      Gets the total elapsed time. 
      @return a string describing the total time in the format h:mm, 
      with mm < 60
   */
   public String getTotal()
   {
      return String.format("%d:%02d", hours, minutes);
   }
}