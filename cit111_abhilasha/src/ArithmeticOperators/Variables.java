/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArithmeticOperators;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class Variables {
    
    public static void main(String[] args){
        //declare and initialize variables
        int yearsEleSchl = 5;
        int yearsMS = 3;
        int yearsHS = 4;
        int yearsCollege = 2;
        int totalYears;
        
        //operate on the variables
        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        
        //andprintthe value of total years to console with some text
        System.out.println("Total years in school: " + totalYears);
        
    } //closes main method
} //close class Variables
