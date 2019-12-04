/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class IntegerArray {
    public static void main (String[] args){
        int[] writingInstruments = new int[5];
        writingInstruments[0] = 20;
        writingInstruments[1] = 25;
        writingInstruments[2] = 5;
        writingInstruments[3] = 23;
        writingInstruments[4] = 15;
        
        printNumericArrayManually(writingInstruments);
    } //close main method
    
    public static void printNumericArrayManually(int[] arr){
        
        for(int counter = 0; counter < arr.length; counter++){
            System.out.println("Value of the array index " + counter + " is: " + arr[counter]);
        }//close for loop
        
        computeSum(arr);
    }//close printnumericArrayManually
    
    public static void computeSum(int[] arr){
        int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println("Array sum: " + sum);
        
        calcAvgPenCount(arr, sum);
    }// close computeSum method
    
    public static void calcAvgPenCount(int[] arr, int sum){
        int avg  = sum / arr.length;
        System.out.println("Average pen count: " + avg);
    }//close calcAvgPenCount method
} //close class
