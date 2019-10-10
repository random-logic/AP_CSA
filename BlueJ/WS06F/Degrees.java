public class Degrees
{
   /**
      Converts the specified decimal degrees to a string with degrees, minutes, seconds.
      @param decimalDegrees a decimal degree value >= 0, such as 40.25833
      @return a string with the degrees, minutes, and seconds, such as 40°15'30" 
   */
   public String convert(double decimalDegrees)
   {   
      String degSymbol = "\u00B0";
      String convertedDeg = "";
      
      convertedDeg += (int)decimalDegrees + degSymbol;
      decimalDegrees -= (int)decimalDegrees;
      
      decimalDegrees *= 60;
      convertedDeg += (int)decimalDegrees + "\'";
      decimalDegrees -= (int)decimalDegrees;
      
      decimalDegrees *= 60;
      convertedDeg += (int)(decimalDegrees + 0.5) + "\"";
      
      return convertedDeg;
   }
}