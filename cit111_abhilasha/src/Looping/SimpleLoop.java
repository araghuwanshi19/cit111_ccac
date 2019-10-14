/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

/**
 * Demo of while loop
 * @author Abhilasha Raghuwanshi
 */
public class SimpleLoop {
    public static void main (String[] args){
        int count = 0;
        int numLoop = 900000;
        long startTime = System.currentTimeMillis();
        
        System.out.println("Start looping at: " + startTime);
        
        //as long as count is less than numLoop, execute my program
        while(count < numLoop){
            System.out.println("change oil");
            System.out.println("Value of count: " + count);
            count = count + 1;
        }//close while
        long endTime = System.currentTimeMillis();
        System.out.println("Stopped looping at: " + endTime);
        
        long buildTime = (endTime - startTime) / 1000;
        
        System.out.println("Time to run: " + buildTime + " seconds");
    } //close main
    
}//close class
