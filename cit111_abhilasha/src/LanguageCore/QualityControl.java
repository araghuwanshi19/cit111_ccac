/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanguageCore;

import java.util.Random;

/**
 *
 * @author Abhilasha Raghuwanshi
 */
public class QualityControl {
    final static int QUALITY_TRESHOLD = 70;
    final static int MAX_QUALITY = 100;
    final static int UNITS_TO_MAKE = 1000;
    
    static int unitQuality = 0;
    static int totalFailiures = 0;
    static int totalUnitsMade = 0;
    
    public static void main(String[] args){
    // make a random number generator
    Random randomGenerator = new Random();
    while(totalUnitsMade < UNITS_TO_MAKE){
        
        //generate a number between 0 to 100
        unitQuality = randomGenerator.nextInt(MAX_QUALITY + 1);
        System.out.println("Unit Qualtiy: " + unitQuality);
        //increment our total unit counter
        totalUnitsMade = totalUnitsMade + 1;
        
        if(unitQuality < QUALITY_TRESHOLD){
            System.out.println("Unit below quality standards!");
                    totalFailiures = totalFailiures+1;
        }
        else{
            System.out.println("Unit passes quality test");
            // closes if/else
            
            System.out.println("Total failiures: " + totalFailiures + " out of " + totalUnitsMade + " units made");
            
        }//closes if/else
        
        System.out.println("Total failiures: "+totalFailiures + " out of " + totalUnitsMade + " units made ");

    } //closes while
    double productionRatio = (double)totalFailiures/
            (double) totalUnitsMade;
    
    System.out.println("***PRODUCTION SUMMARY***");
    System.out.println("TESTED" + totalUnitsMade + "Units.");
    System.out.println("Failiure Ratio: " + productionRatio);
    } //closes main
}//closes class