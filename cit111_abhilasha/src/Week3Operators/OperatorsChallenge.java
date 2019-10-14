/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Operators;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class OperatorsChallenge {
    
    public static void main(String[] args){
        int a = 100;
        int b = 2000;
        double d = 10.5;
        String line1 = "Go Ask Alice";
        String line2 = " I think she'll know";
        int r = b / a;
        System.out.println("2000 divided by 100 is: " + r);
        int mod = b % a;
        System.out.println("2000 % 100 is: " + mod);
        double rd = mod * d;
        System.out.println(mod + " * 10.5 is: " + rd);
        a = a + 5;
        System.out.println("We will now compute the value of 2000 % 105");
        rd = b % a;
        System.out.println("2000 % 105 is: " + rd);
        System.out.println(line1 + line2);
    }
    
}
