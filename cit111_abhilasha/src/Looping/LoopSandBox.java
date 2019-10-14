/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

/**
 *
 * @author Abhilasha Raghuwanshi
 */
public class LoopSandBox {
    public static void main (String[] args){
       int bacteria = 10;
int virus = 2;
if(bacteria/virus > 4){
    System.out.println(bacteria / virus);
    while(virus >0){
        System.out.println("v: "+virus);
        virus--;
    }
    System.out.println(bacteria/virus);
}

    }//close main
}//close class
