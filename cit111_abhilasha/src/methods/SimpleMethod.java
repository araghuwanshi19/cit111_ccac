/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Random;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author abhilasha.raghuwansh
 */
public class SimpleMethod {
   

public static void main (String[] args){
    
    
    int SELECTOR;
    System.out.println("*********switches and methods********");
    System.out.println("Options:");
    System.out.println("1 - Print a special statement");
    System.out.println("2 - Generate a really big random number");
    System.out.println("3 - Get me out of here!");
    System.out.println("Enter an int and press enter:");
    
    Scanner scannerInput = new Scanner(System.in);
    SELECTOR = scannerInput.nextInt();
    
    /*switch(SELECTOR){
        case 1:
            printStatement();
            break;
            
        case 2:
            generateBigNumber();
            break;
            
        case 3: 
            System.out.println("Back in main method");
            break;
            
        default:
            System.out.println("Invalid option");
            break;
    }//close switching block */
    
    if(SELECTOR == 1){
        printStatement();
    }
    else if(SELECTOR == 2){
        generateBigNumber();
    }
    else if(SELECTOR == 3){
        System.out.println("Back to main");
    }
    else{
        System.out.println("Invalid options");
    }//close if/else block
    
} //close main

public static void printStatement(){
    System.out.println("*********Inside printStatement*******");
    System.out.println("*************************************");
} //close printStatement
    

public static void generateBigNumber(){
    Random r = new Random();
    BigInteger bigInt = new BigInteger(100, r);
    System.out.println("*****In generateBigNumber method*****");
    System.out.println(bigInt);
    System.out.println("*************************************");
}// close generateBigNumber

} //close class
