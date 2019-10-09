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
      latitude1 = latitude;
      longitude1 = longitude;
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
}