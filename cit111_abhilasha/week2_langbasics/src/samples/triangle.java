/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class triangle {
    public static void main (String[]args){
       int spaceMax = 10;
       int numStars = 1;
       String stars = "*";
       int space = spaceMax - numStars;
       
        while(numStars <= spaceMax){
            while(space >= 0){
                System.out.print(" ");
                space--;
            }
            while(numStars > 0){
             System.out.println(stars);
             numStars--;
            }
          spaceMax--;
          numStars = numStars + 2;
        }//closes while
    }//closes main
}//closes class
