import java.lang.Math;

/**
   A class to describe the location of a place on Earth.
*/
public class Location
{
   private double latitude1;
   private double longitude1;

   private static final double EARTH_RADIUS = 6371;

   /**
      Construct a location with a given latitude and longitude (in degrees)
   */
   public Location(double latitude, double longitude)
   {
      latitude1 = Math.toRadians(latitude);
      longitude1 = Math.toRadians(longitude);
   }

   public double getLongitudeInRadians() { return longitude1; }

   public double getLatitudeInRadians() { return latitude1; }
   
   /**
      Gets the distance between two locations in kilometers
      @param other another location
      @return the distance between this location and other
   */
   public double getDistance(Location other)
   {
      double longitude2 = other.getLongitudeInRadians();
      double latitude2 = other.getLatitudeInRadians();
      
      return EARTH_RADIUS * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));
   }

   public static void main(String[] args)
   {
      // Compute distance from Atlanta, Georgia to San Francisco, California
      Location atlanta = new Location(33.755, -84.39);
      Location sanFrancisco = new Location(37.7793, -122.4192);
      System.out.printf("%8.1f kilometers\n", atlanta.getDistance(sanFrancisco)); 
      System.out.println("Expected: 3436.5 kilometers");
      // Should be the same distance either way
      System.out.printf("%8.1f kilometers\n", sanFrancisco.getDistance(atlanta)); 
      System.out.println("Expected: 3436.5 kilometers");
   }
}