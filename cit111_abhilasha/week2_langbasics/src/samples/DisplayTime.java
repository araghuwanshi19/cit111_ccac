package samples;

import java.util.Scanner;


/**
 *Sample program from the Liang9, Listing 2.4
 * Convert seconds to minutes and remainder seconds
 * @author Abhilasha Raghuwanshi
 */
public class DisplayTime {//declares a class
    // the main method is a program's starting point
    // or we could say its front door
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       //Prompt the user for input
       System.out.print("Enter an Integer for seconds: ");
      int seconds = input.nextInt();// read line from user;store in 
       int minutes = seconds / 60;// Find minutes in seconds
       int remainingSeconds = seconds % 60; //seconds remaing
       System.out.print(seconds + " second is " + minutes + " minutes and " + remainingSeconds + " seconds ");
    }//closes main method
    
}//closes class DisplayTime
