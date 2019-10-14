/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

import java.util.Scanner;
/**
 * Demonstrate the functionality of a while( statement with if() logic
 * @author abhilasha.raghuwansh
 */
public class RetirementAge {
    public static void main (String[] args){
        int age;
        long savings;
        long threshold = 30000;
        long moreSavings;
        
        Scanner inputAge = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter your age to see if you can retire: ");
            age = inputAge.nextInt();
            
            if(age > 65.5){
                System.out.println("Wahoo! Grab the newspaper and martini!");
            
                Scanner inputSavings = new Scanner(System.in);
                System.out.println("Enter your current savings:");
                savings = inputSavings.nextLong();    
                
                if(savings > 30000){
                System.out.println("wahoo! You don't need to save anymore before you retire!");
                }else{
                    moreSavings = threshold - savings; 
                    System.out.println("Save $" + moreSavings + " more before you retire");
                }//closes if/else block
            }else if(age < 0){
                System.out.println("Thanks for checking your retirement status");
                break;
            }else{
                System.out.println("Sorry, keep working...");
            }//closes if/else block
        }//closes while() loop
    }//closes main
}//closes class
