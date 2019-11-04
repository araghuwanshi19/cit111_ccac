/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;
import java.util.Random;
/**
 *
 * @author abhilasha.raghuwansh
 */
public class KennywoodRideTracker {
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    private static double THIRLLRIDEMINHEIGHT = 4.8;
    private static double THEMERIDEMINHEIGHT = 3.2;
    
    public static void main (String[] args){
       double avg_height = 3.4;
       int riders = 3;
       rideBlackWidow(riders, avg_height);
       rideMerryGoRound(riders, avg_height);
       printRideStats();
    }//close main
    
    public static void rideBlackWidow(int riders, double avgHeight){
        if(avgHeight >= THIRLLRIDEMINHEIGHT){
            System.out.println("Riding the Black Widow!");
            totalRiders = riders;
            Random random = new Random();
            int numSickRiders = random.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        }// close if block
        else{
            totalFailedRideAttempts = riders;
            System.out.println(riders + " riders were turned away.");
        }//close else block
        
    }//close rideBlackWidow
    
    public static void rideMerryGoRound(int riders, double avgHeight){
        if(avgHeight >= THEMERIDEMINHEIGHT){
            System.out.println("Riding the Merry Go Round!");
            totalRiders = riders;
            Random random = new Random();
            int numSickRiders = random.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        }// close if block
        else{
            totalFailedRideAttempts = riders;
            System.out.println(riders + " riders were turned away.");
        }
    }//close rideMerryGoRound
    
    public static void  printRideStats(){
        System.out.println("***********RIDER STATISTICS************");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Toatal Sick Riders: " + totalSickRiders);
        System.out.println("***************************************");
    }//close printRideStats
    
}//close class
