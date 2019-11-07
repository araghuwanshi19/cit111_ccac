/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
/**
 * The calculator computes the molarity of a given solution
 * @author abhilasha.raghuwansh
 */
public class Molarity_Calculator {
    

        
    public static void main(String[] args){
        takeUserInput();
    }//close main
    
    public static void takeUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter formula of the Compound");
        String formula = input.next();
        parseFormula(formula);
    }//close method takeUserInput
    
    
    public static void parseFormula(String formula){
        
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
        eleMap.put("S", 32.06);
        eleMap.put("Cl", 35.453);
        eleMap.put("K", 39.0983);
        eleMap.put("Ar", 39.948);
        eleMap.put("Ca", 40.08);
        eleMap.put("Sc", 44.9559);
        eleMap.put("Ti", 47.90);
        eleMap.put("V", 50.9380);
        eleMap.put("Cr", 51.996);
        eleMap.put("Mn", 54.9380);
        eleMap.put("Fe", 55.847);
        eleMap.put("Ni", 58.70);
        eleMap.put("Co", 58.9332);
        eleMap.put("Zn", 65.38);
        eleMap.put("Ga", 69.72);
        eleMap.put("Ge", 72.59);
        eleMap.put("Ar", 74.9216);
        eleMap.put("Se", 78.96);
        eleMap.put("Br", 79.904);
        eleMap.put("Kr", 83.80);
        eleMap.put("Rb", 85.4678);
        eleMap.put("Sr", 87.62);
        eleMap.put("Y", 88.9059);
        eleMap.put("Zr", 91.22);
        eleMap.put("Nb", 92.9064);
        eleMap.put("Mo", 95.94);
        eleMap.put("Tc", 98.00);
        eleMap.put("Ru", 101.07);
        eleMap.put("Rh", 102.9055);
        eleMap.put("Pd", 106.4);
        eleMap.put("Ag", 107.868);
        eleMap.put("Cd", 112.41);
        eleMap.put("In", 114.82);
        eleMap.put("Sn", 118.69);
        eleMap.put("Sb", 121.75);
        eleMap.put("I", 126.9045);
        eleMap.put("Te", 127.60);
        eleMap.put("Xe", 131.30);
        eleMap.put("Cs", 132.9054);
        eleMap.put("Ba", 137.33);
        eleMap.put("La", 138.9055);
        eleMap.put("Ce", 140.12);
        eleMap.put("Pr", 140.9077);
        eleMap.put("Nd",144.24);
        eleMap.put("Pm", 145.00);
        eleMap.put("Sm", 150.4);
        eleMap.put("Eu", 151.96);
        eleMap.put("Gd", 157.25);
        eleMap.put("Tb", 158.9254);
        eleMap.put("Dy", 162.50);
        eleMap.put("Ho", 164.9304);
        eleMap.put("Er", 167.26);
        eleMap.put("Tm", 168.9342);
        eleMap.put("Yb", 173.04);
        eleMap.put("Lu", 174.967);
        eleMap.put("Hf", 178.49);
        eleMap.put("Ta", 180.9479);
        eleMap.put("W", 183.85);
        eleMap.put("Re",186.207);
        eleMap.put("Os", 190.2);
        eleMap.put("Ir", 192.22);
        eleMap.put("Pt", 195.09);
        eleMap.put("Au", 196.9665);
        eleMap.put("Hg", 200.59);
        eleMap.put("Tl", 204.37);
        eleMap.put("Pb", 207.2);
        eleMap.put("Bi", 208.9804);
        eleMap.put("Po", 209.00);
        eleMap.put("At", 210.00);
        eleMap.put("Rn", 222.00);
        eleMap.put("Fr", 223.00);
        eleMap.put("Ra", 226.0254);
        eleMap.put("Ac", 227.0278);
        eleMap.put("Pa", 231.0359);
        eleMap.put("Th", 232.0381);
        eleMap.put("Np", 237.0482);
        eleMap.put("U", 238.029);
        eleMap.put("Pu", 242.00);
        eleMap.put("Am", 243.00);
        eleMap.put("Bk", 247.00);
        eleMap.put("Cm", 247.00);
        eleMap.put("No", 250.00);
        eleMap.put("Cf", 251.00);
        eleMap.put("Es", 252.00);
        eleMap.put("Hs", 255.00);
        eleMap.put("Mt", 256.00);
        eleMap.put("Fm", 257.00);
        eleMap.put("Md", 258.00);
        eleMap.put("Lr", 260.00);
        eleMap.put("Rf", 261.00);
        eleMap.put("Bh", 262.00);
        eleMap.put("Db", 262.00);
        eleMap.put("Sg", 263.00);
        eleMap.put("Uun", 269.00);
        eleMap.put("Uuu", 272.00);
        eleMap.put("Uub", 277.00);

        HashMap<String , Double> eleSubMap = new HashMap<>();
        eleMap.put("H1", 1.00797);
        eleMap.put("H2", 2.01594);
        eleMap.put("H3", 1.00797);
        eleMap.put("H4", 1.00797);
        eleMap.put("H5", 1.00797);
        eleMap.put("H6", 1.00797);
        eleMap.put("H7", 1.00797);
        eleMap.put("H8", 1.00797);
        eleMap.put("H9", 1.00797);
        eleMap.put("H10", 1.00797);
        eleMap.put("H11", 1.00797);
        eleMap.put("H12", 1.00797);
        eleMap.put("H13", 1.00797);
        eleMap.put("H14", 1.00797);
        eleMap.put("H15", 1.00797);
        eleMap.put("H16", 1.00797);
        eleMap.put("H17", 1.00797);
        eleMap.put("H18", 1.00797);
        eleMap.put("H19", 1.00797);
        eleMap.put("H20", 1.00797);
        eleMap.put("H21", 1.00797);
        eleMap.put("H22", 1.00797);
        eleMap.put("H23", 1.00797);
        eleMap.put("H24", 1.00797);
        eleMap.put("H25", 1.00797);
        eleMap.put("H26", 1.00797);
        eleMap.put("H27", 1.00797);
        eleMap.put("H28", 1.00797);
        eleMap.put("H29", 1.00797);
        eleMap.put("H30", 1.00797);
        eleMap.put("H31", 1.00797);
        eleMap.put("H32", 1.00797);
        eleMap.put("H33", 1.00797);
        eleMap.put("H34", 1.00797);
        eleMap.put("H35", 1.00797);
        eleMap.put("H36", 1.00797);
        eleMap.put("H37", 1.00797);
        eleMap.put("H38", 1.00797);
        eleMap.put("H39", 1.00797);
        eleMap.put("H40", 1.00797);
        eleMap.put("H41", 1.00797);
        eleMap.put("H42", 1.00797);
        eleMap.put("H43", 1.00797);
        eleMap.put("H44", 1.00797);
        eleMap.put("H45", 1.00797);
        eleMap.put("H46", 1.00797);
        eleMap.put("H47", 1.00797);
        eleMap.put("H48", 1.00797);
        eleMap.put("H49", 1.00797);
        eleMap.put("H50", 1.00797);
        
        
        
        
        Pattern a = Pattern.compile("[A-Z][a-z]?[a-z]?\\d?");
        //find the match(element)
        Matcher m = a.matcher(formula);
        double eleAtomicMass = 0;
            
        while(m.find() == true){
            //obtain element from the formula using substring
            String element = formula.substring(m.start(), m.end());
            System.out.println(element);
            
            //check to see if the element has a subscript
            Pattern b = Pattern.compile("\\d");
            Matcher n = b.matcher(element);
            if(n.find() == true){
                
            }
            //find the atomic mass of the element
            eleAtomicMass = eleMap.get(element);
            System.out.println(eleAtomicMass);
            
            //chop off the derived element from the formula
            formula = formula.substring(m.end(), formula.length());
            System.out.println(formula);
            
            m = a.matcher(formula);
        }    
    }// close method parseFormula
    
}//close class
