/**
 * Create a class that models a cylinder in the real world
 *
 * @author Andrew
 * @version 2019
 */

import java.awt.Color;

public class Car
{
    public String make;
    public String model;
    public int year;
    public Color color;
    public int speed;
    public int hp;
    
    /**
     * Construct a car
     */
    public Car() {
        make = "";
        model = "";
        year = 0;
        color = Color.BLACK;
        speed = 0;
        hp = 0;
    }
    
    /**
     * Construct a car
     * @param _make The make of the car
     * @param _model The model of the car
     * @param _year The manufactured year of the car
     * @param _color The color of the car
     * @param _speed The speed of the car
     * @param _hp The horse power of the car
     */
    public Car(String _make, String _model, int _year, Color _color, int _speed, int _hp) {
        make = _make;
        model = _model;
        year = _year;
        color = _color;
        speed = _speed;
        hp = _hp;
    }
    
    /**
     * Get the car make
     * @return The car make
     */
    public String getMake(){
        return make;
    }
    
    /**
     * Get the car model
     * @return The car model
     */
    public String getModel() {
        return model;
    }
    
    /**
     * Get the car manufactured year
     * @return The car manufactured year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Get the car color
     * @return The car color
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * Get the car speed
     * @return The car speed
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * Get the hp of the car
     * @return the hp of the car
     */
    public int getHp() {
        return hp;
    }
    
    /**
     * Raise the speed of the car
     * @param amount The amount of speed to add to the car
     */
    public void speedUp(int amount) {
        speed += amount;
    }
    
    /**
     * Lower the speed of the car
     * @param amount The amount of speed to subract from the car
     */
    public void speedDown(int amount) {
        speed -= amount;
    }
}
