/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

import java.util.Scanner;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class Aunthentication {

    public static void main(String[] args) {
        int password = 1465;
        int phonePasscode = 4505;
        int passcodeAttempt;
        int attempt;
        int attemptsLeft = 2;
        Scanner inputPassword = new Scanner(System.in);
        System.out.println("Enter the system password to learn the protected information");
        System.out.println("Hint: Enter four digits.");
        attempt = inputPassword.nextInt();
        while (attemptsLeft > 0) {
            if (attempt == password) {
                System.out.println("Correct Password!");
                System.out.println("To further verify your identity, enter the phone passcode");
                passcodeAttempt = inputPassword.nextInt();
                if (passcodeAttempt != phonePasscode) {
                    System.out.println("INCORRECT PASSCODE");
                    System.out.println("ACCESS DENIED. YOU CAN NO LONGER GAIN ACCESS TO THIS INFORMATION.");
                    break;
                } else {
                    System.out.println("*****The protected information is: GRREN TEA IS BEST CAKE FLAVOR.*****");
                    break;
                }//closes if/else block
            } else {
                System.out.println("INCORRECT PASSWORD!!!");
                System.out.println("You have " + attemptsLeft + " more attempt/s left.");
                System.out.println("Please try again:");
                attempt = inputPassword.nextInt();
                attemptsLeft = attemptsLeft - 1;
                if (attemptsLeft == 0) {
                    System.out.println("You can no longer gain access to this imnformation");
                }//close if/else block
            }//close if block

        }//close while1465
        System.out.println("wwww");
    }//close main
}//close class

