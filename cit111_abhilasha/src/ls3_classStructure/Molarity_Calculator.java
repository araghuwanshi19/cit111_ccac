/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.HashMap;
 
/**
 * The calculator computes the molarity of a given solution
 * @author abhilasha.raghuwansh
 */
public class Molarity_Calculator {
    public static void main(String[] args){
        
    }//close main
    
    public static void eleMolarMass(){
        HashMap<String , Double> eleMap = new HashMap<>();
        eleMap.put("H", 1.00797);
        eleMap.put("He", 4.00260);
        eleMap.put("Li", 6.941);
        eleMap.put("Be", 9.01218);
        eleMap.put("B", 10.81);
        eleMap.put("C", 12.011);
        eleMap.put("N", 14.0067);
        eleMap.put("O", 15.9994);
        eleMap.put("F", 18.998403);
        eleMap.put("Ne", 20.179);
        eleMap.put("Na", 22.98977);
        eleMap.put("Mg", 24.305);
        eleMap.put("Al", 26.98154);
        eleMap.put("Si", 28.0855);
        eleMap.put("P", 30.97376);
        
    }//close eleMolarMass
}//close class
