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
public class Books {
    public static void main (String[] args){
        //******not using arrays**********
        String book1 = "Perl Cookbook"; //string processing
        String book2 = "PHP Cookbook"; //database connectivity
        String book3 = "Python in a Nutshell"; //new OO language   
        String book5 = "Javascript; the Definitive Guide"; //new OO language    
        String book4 = "Java in a Nutshell"; //new OO language
        
        System.out.println("Title of book 1: " + book1);
        
        
        
        //*****using arrays********
        
        
        String[] books = new String[5];
        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell"; 
        books[3] = "Javascript; the Definitive Guide";
        books[4] = "Java in a Nutshell"; 
        
        forLoopPrintArrayContents(books);
        
    } //close main method
    
    public static void printArrayContents(String[] arr){
        System.out.println("Value of book 1: " + arr[0]);
        System.out.println("Value of book 2: " + arr[1]);
        System.out.println("Value of book 3: " + arr[2]);
        System.out.println("Value of book 4: " + arr[3]);
        System.out.println("Value of book 5: " + arr[4]);
        
    }// close printArrayContents method
    
    
    public static void loopPrintArrayContents(String[] arr){
        int arraySize = arr.length;
        int counter = 0;
        
        while(counter < arraySize){
            System.out.println("Value of array index " + counter + " is " + arr[counter]);
            counter++;
        } //close while 
        
    } //close loopPrintArrayContents 

    public static void forLoopPrintArrayContents(String[] arr){

        for(int counter = 0; counter < arr.length; counter++){
            System.out.println("Value of array index " + counter + " is " + arr[counter]);
        }
        
    } //close loopPrintArrayContents
        
} //close class
