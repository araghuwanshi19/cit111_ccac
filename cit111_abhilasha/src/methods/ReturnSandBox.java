/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class ReturnSandBox {
    public static void main (String[]args){
        //String chop = "The atomic number of Zinc is 30";
        String chop = "AB";
        String output = chopCharactersFromString(chop);
        System.out.println("Test chopped is: " + output);
    } //close main
    
    // A method that will take in a String and chop off the first two and last two letters and give back the result
    
    public static String chopCharactersFromString(String stringToChop){
        String chopped;
        int inputStringLength = stringToChop.length();
        if (inputStringLength < 4){
            return "TOO SHORT!";
        }
        //chop first two letters
        chopped = stringToChop.substring(2,inputStringLength);
        return chopped;
    } 
}