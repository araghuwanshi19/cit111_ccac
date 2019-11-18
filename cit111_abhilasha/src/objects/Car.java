/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;
import java.util.Random;

/**
 *
 * @Abhilasha  Raghuwanshi
 */
public class Car {
    public String make;
    public String model;
    public int year;
    public double mpg;
    public String color;

    //only methods in this class can access private member variables
    private boolean engineOn;
    private double speed;
    public double speedIncrease = 16;
    public double speedDecrease = 10;
    
    /**
     * Stimulates starting this car instance's engine
     */
    public void startEngine(){
        engineOn = true;
    }// close startEngine method
    
    /**
     * Stimulates stopping this car instance's engine
     */
    public void stopEngine(){
        engineOn = false;
    }//close stopEngine method
    
    /**
     * Getter method for retrieving engine status
     * @return value of member variable engineOn
     */
    
    public void generateRandomNumber(){
        
        
    }
    public boolean checkEngineStatus(){
        return engineOn;
    }
    
    //make a methd callde accelerate that takes in an int and
    // adds it to the car's speed variable
    public void accelerate(double speedIncrease){
        speed = speedIncrease + speed;
    }
    
    public void decelerate(double speedDecrease){
        speed = speed - speedDecrease;
        
        if (speed < 0){
            speed = 0;
        }
    }
    
    public double getCurrentSpeed(){
        return speed;
    }
    //make a method decelerate that takes in an int 
    //and substracts it from the speed
    
}//close class
