/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

import java.util.Scanner;
/**
 *
 * @author abhilasha.raghuwansh
 */
public class ForLoopIntro {
    public static void main (String[] args){
        
        //declare variable for controlling number of loops
        int loopControl;
        
        //create a scanner and store it in a variable of our choice
        Scanner userScanner = new Scanner(System.in);
        
        //prompt user and get an int from them
        System.out.println("How many loops shall I print for()");
        loopControl = userScanner.nextInt();
        
        for(int numLoop = 0; numLoop <= loopControl; numLoop = numLoop + 1){
            System.out.println("The value of the numLoops: " + numLoop);
            
        }//close for loop
    }//close main
    
}//close class
