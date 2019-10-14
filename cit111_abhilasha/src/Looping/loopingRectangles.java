/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package samples;
import java.util.Scanner;
/**
 *
 * @author abhilasha.raghuwansh
 */
public class loopingRectangles {
    public static void main(String[]args){
        Scanner inputScanner = new Scanner(System.in);
        int rowCount;
        int rowPosition = 0;
        int heightCount;
        int heightPosition = 0;
        String symbol = "*";

        System.out.println("Enter desired height count:");
        heightCount = inputScanner.nextInt();
        rowCount = heightCount;
        while(heightPosition < heightCount){
            while(rowPosition < rowCount){
            System.out.print(symbol);
            rowPosition++;
            }
          System.out.println();
          heightPosition++;
          rowPosition = 0;
          rowCount--;
        }
    }//closes main
}//closes class
