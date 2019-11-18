/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Client class to Car
 * Contains the main method
 * 
 * @Abhilasha Raghuwanshi
 */
public class Car_Land {
    public static void main(String[] args){
        //create a variable of our custom type Car
        Car firstCar;
        //use new to instantiate our Car class
        //and store a refrence in firstCar
        firstCar = new Car();
        //assigning values to member variables on ONE intstance of  Car
        firstCar.make = "Honda";
        firstCar.model = "Accord";
        firstCar.year = 2000;
        firstCar.startEngine();
        //reading from variables and writing to console
        System.out.println("My firstCar object engine status: " + firstCar.checkEngineStatus());
        
        Car toyCar = new Car();
        toyCar.make = "Made in China";
        toyCar.model = "9807000";
        toyCar.year = 2000;
        toyCar.color = "Red";
        toyCar.startEngine();
        toyCar.mpg = 24.90;
        
        System.out.println("My toyCar object engine status: " + toyCar.checkEngineStatus());

        firstCar.accelerate(15.00);
        firstCar.decelerate(12.00);
        
        toyCar.accelerate(15.00);
        toyCar.decelerate(25.00);
        
        displayFirstCarStatus(firstCar);
    }//close main meathod
    
    public static void displayFirstCarStatus(Car C){
        System.out.println("*********************STATS***********************");
        System.out.println(C.year + " " + C.model);
        System.out.println("Engine Runnig? " + C.checkEngineStatus());
        System.out.println("CurrentSpeed " + C.getCurrentSpeed());
        System.out.println("************************************************");
        
    }
   
}//close class
