/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MightWeBeFriends;

import java.util.Scanner;

/**
 *
 * @author Abhilasha Raghuwanshi
 */
public class MightWeBeFriends {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Score = 0;
        int response;
        System.out.println("How old are you?");
        response = scan.nextInt();
        if (response <= 20 || response >= 17) {
            Score = Score + 20;
        } else {
            Score = Score - 20;
        }

        System.out.println("Do you know the sport Cricket? (0 = no, 1 = yes)");
        response = scan.nextInt();
        if (response == 1) {
            Score = Score + 10;
        } else if (response == 0) {
            Score = Score - 10;
        } else {
            System.out.println("Invalid response. Points deducted.");
            Score = Score - 5;
        }

        System.out.println("Are you a convicted criminal?(0 = no, 1 = yes)");
        response = scan.nextInt();
        if (response == 0) {
                System.out.println("Great!");
                Score = Score + 10;
                System.out.println("Do you speak another language?(0=no, 1=yes)");
                response = scan.nextInt();
                if (response == 1) {
                Score = Score + 20;
                } else if (response == 0) {
                Score = Score - 20;
                } else {
                System.out.println("Invalid response. Points deducted.");
                Score = Score - 5;
            }

            System.out.println("Is Green tea your favourite flavor for dessert?(0 = no, 1 = yes)");
            response = scan.nextInt();
            if (response == 1) {
                Score = Score + 10;
            } else if (response == 0) {
                Score = Score - 10;
            } else {
                System.out.println("Invalid response. Points deducted.");
                Score = Score - 5;
            }

            System.out.println("Do you enjoy theatre?(0 = no, 1 = yes)");
            response = scan.nextInt();
            if (response == 1) {
                Score = Score + 20;
                System.out.println("Have you ever been a part of a play or a musical?(0 = no; 1 = yes)");
                response = scan.nextInt();
                if (response == 1) {
                    Score = Score + 10;
                    System.out.println("How were you involved?"
                            + "1. Cast, "
                            + "2. Stage Crew, "
                            + "3. Costume and Makeup, "
                            + "4. Advertisement");
                    response = scan.nextInt();                                   
                    if (response == 1 || response == 2 || response == 3 || response == 4){
                        System.out.println("Cool!");
                    
                    }else{
                    System.out.println("Invalid response. Points deducted.");
                    Score = Score - 5;
                    }
                
                
                }else if(response == 0){
                    Score = Score - 10;
                }else{
                    System.out.println("Invalid response. Points deducted.");
                    Score = Score - 5;
                }
                
            
            }else if (response == 0) {
                Score = Score - 30;
                }else{
                System.out.println("Invalid response. Points deducted.");
                Score = Score - 5;
            }        
            
        } else { 
          System.out.println("Let's not be friends.");
                    Score = Score - 130;
                }           
    
        

        if (Score >= 65) {
            System.out.println("Your Compatibility score was " + Score + "!"
                    + " We can be friends I guess.");
        } else {
            System.out.println("Your Compatibility score was " + Score + "."
                    + "I don't think we can be friends.");
        }
        
        
    }
}
