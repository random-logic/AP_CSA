public class Angles
{
   /**
      Normalizes an angle.
      @param angle an integer angle (may be negative)
      @return the equivalent angle in the range 0 ... 359
   */
   public int normalize(int angle)
   {
      // your work here
      while (angle > 359)
         angle -= 360;
         
      while (angle < 0)
         angle += 360;
         
      return angle;
   }   
}