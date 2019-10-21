/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class Triangle {
    public static void main (String[]args){
       int spaceMax = 6;
       int numStars = 1;
       int stars = 1;
       int space = spaceMax - numStars;
       
        while(numStars <= spaceMax){
            while(space >= 0){
                System.out.print(" ");
                space--;
            }
            while(stars > 0){
             System.out.println("*");
             stars--;
            }
            
          spaceMax--;
          numStars = numStars + 2;
         
        }//closes while
    }//closes main
}//closes class
