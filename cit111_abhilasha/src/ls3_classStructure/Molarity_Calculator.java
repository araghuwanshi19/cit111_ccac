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
 * The calculator computes the molarity of a given solution.
 * @author abhilasha.raghuwansh
 */
public class Molarity_Calculator {
    
    public static void main(String[] args){
        takeUserInput();
    }//close main
    
    public static void takeUserInput(){ 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter formula of the Chemical Compound");
        String formula = input.next();
//        parseFormula(formula);
        double totalMolarMass = parseFormula(formula);

        System.out.println("Enter the mass of the Chemical Compound being dissolved into water(in grams): ");
        double mass = input.nextDouble();
//        calcMolesOfSoln(mass, totalMolarMass);
        double molesOfSoln = calcMolesOfSoln(mass, totalMolarMass);
        
        System.out.println("Enter the volume of water in which the Chemical Compound is being dissolved in(in liters): ");
        double waterVolume = input.nextDouble();
//        calcMolarity(waterVolume, molesOfSoln);
        double molarity  = calcMolarity(waterVolume, molesOfSoln);
        
        printOutput(molarity, formula);
        
    }//close method takeUserInput
    
    
    public static double parseFormula(String formula){
        
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
//
//        HashMap<String, Double> eleSubMap = new HashMap<>();
//        eleMap.put("H2", 2.01594);
//        eleMap.put("H3", 3.02391);
//        eleMap.put("H4", 4.03188);
//        eleMap.put("H5", 5.03985);
//        eleMap.put("H6", 6.04782);
//        eleMap.put("H7", 7.05579);
//        eleMap.put("H8", 8.06376);
//        eleMap.put("H9", 9.07173);
//        eleMap.put("H10", 10.0797);
//        eleMap.put("H11", 11.0877);
//        eleMap.put("H12", 12.0956);
//        eleMap.put("H13", 13.1036);
//        eleMap.put("H14", 14.1116);
//        eleMap.put("H15", 15.1196);
//        eleMap.put("He2", 4.00260);
//        eleMap.put("He3", 4.00260);
//        eleMap.put("He4", 4.00260);
//        eleMap.put("He5", 4.00260);
//        eleMap.put("He6", 4.00260);
//        eleMap.put("He7", 4.00260);
//        eleMap.put("He8", 4.00260);
//        eleMap.put("He9", 4.00260);
//        eleMap.put("He10", 4.00260);
//        eleMap.put("He11", 4.00260);
//        eleMap.put("He12", 4.00260);
//        eleMap.put("He13", 4.00260);
//        eleMap.put("He14", 4.00260);
//        eleMap.put("He15", 4.00260);
//        eleMap.put("Li2", 13.882);
//        eleMap.put("Li3", 20.823);
//        eleMap.put("Li4", 27.764);
//        eleMap.put("Li5", 34.705);
//        eleMap.put("Li6", 41.646);
//        eleMap.put("Li7", 48.587);
//        eleMap.put("Li8", 55.528);
//        eleMap.put("Li9", 62.469);
//        eleMap.put("Li10", 69.41);
//        eleMap.put("Li11", 76.351);
//        eleMap.put("Li12", 83.292);
//        eleMap.put("Li13", 90.233);
//        eleMap.put("Li14", 97.174);
//        eleMap.put("Li15", 104.115);
//        eleMap.put("Be2", 18.0244);
//        eleMap.put("Be3", 27.0365);
//        eleMap.put("Be4", 36.0487);
//        eleMap.put("Be5", 45.0609);
//        eleMap.put("Be6", 54.0731);
//        eleMap.put("Be7", 63.0853);
//        eleMap.put("Be8", 72.0974);
//        eleMap.put("Be9", 81.1096);
//        eleMap.put("Be10", 90.1218);
//        eleMap.put("Be11", 99.134);
//        eleMap.put("Be12", 108.146);
//        eleMap.put("Be13", 117.158);
//        eleMap.put("Be14", 126.171);
//        eleMap.put("Be15", 135.183);
//        eleMap.put("B2", 21.62);
//        eleMap.put("B3", 32.43);
//        eleMap.put("B4", 43.24);
//        eleMap.put("B5", 54.05);
//        eleMap.put("B6", 64.86);
//        eleMap.put("B7", 75.67);
//        eleMap.put("B8", 86.48);
//        eleMap.put("B9", 97.29);
//        eleMap.put("B10", 108.1);
//        eleMap.put("B11", 118.91);
//        eleMap.put("B12", 129.72);
//        eleMap.put("B13", 140.53);
//        eleMap.put("B14", 151.34);
//        eleMap.put("B15", 162.15);
//        eleMap.put("C2", 21.62);
//        eleMap.put("C3", 32.43);
//        eleMap.put("C4", 43.24);
//        eleMap.put("C5", 54.05);
//        eleMap.put("C6", 64.86);
//        eleMap.put("C7", 75.67);
//        eleMap.put("C8", 86.48);
//        eleMap.put("C9", 97.29);
//        eleMap.put("C10", 108.1);
//        eleMap.put("C11", 118.91);
//        eleMap.put("C12", 129.72);
//        eleMap.put("C13", 140.53);
//        eleMap.put("C14", 151.34);
//        eleMap.put("C15", 162.15);
//        eleMap.put("N2", 21.62);
//        eleMap.put("N3", 32.43);
//        eleMap.put("N4", 43.24);
//        eleMap.put("N5", 54.05);
//        eleMap.put("N6", 64.86);
//        eleMap.put("N7", 75.67);
//        eleMap.put("N8", 86.48);
//        eleMap.put("N9", 97.29);
//        eleMap.put("N10", 108.1);
//        eleMap.put("N11", 118.91);
//        eleMap.put("N12", 129.72);
//        eleMap.put("N13", 140.53);
//        eleMap.put("N14", 151.34);
//        eleMap.put("N15", 162.15);
//        eleMap.put("O2", 31.9988);
//        eleMap.put("O3", 47.9982);
//        eleMap.put("O4", 63.9976);
//        eleMap.put("O5", 79.997);
//        eleMap.put("O6", 95.9964);
//        eleMap.put("O7", 111.9958);
//        eleMap.put("O8", 127.9952);
//        eleMap.put("O9", 143.9946);
//        eleMap.put("O10", 159.994);
//        eleMap.put("O11", 175.9934);
//        eleMap.put("O12", 191.9928);
//        eleMap.put("O13", 207.9922);
//        eleMap.put("O14", 223.9916);
//        eleMap.put("O15", 239.991);
//        eleMap.put("F2", 37.996806);
//        eleMap.put("F3", 56.995209);
//        eleMap.put("F4", 75.993612);
//        eleMap.put("F5", 94.992015);
//        eleMap.put("F6", 113.990418);
//        eleMap.put("F7", 132.988821);
//        eleMap.put("F8", 151.987224);
//        eleMap.put("F9", 170.985627);
//        eleMap.put("F10", 189.98403);
//        eleMap.put("F11", 208.982433);
//        eleMap.put("F12", 227.980836);
//        eleMap.put("F13", 246.979239); 
//        eleMap.put("F14", 265.977642);
//        eleMap.put("F15", 284.976045);
//        eleMap.put("Ne2", 40.358);
//        eleMap.put("Ne3", 60.537);
//        eleMap.put("Ne4", 80.716);
//        eleMap.put("Ne5", 100.895);
//        eleMap.put("Ne6", 121.074);
//        eleMap.put("Ne7", 141.253);
//        eleMap.put("Ne8", 161.432);
//        eleMap.put("Ne9", 181.611);
//        eleMap.put("Ne10", 201.79);
//        eleMap.put("Ne11", 221.969);
//        eleMap.put("Ne12", 242.148);
//        eleMap.put("Ne13", 262.327);
//        eleMap.put("Ne14", 282.506);
//        eleMap.put("Ne15", 302.685);
//        eleMap.put("Na2", 45.97954);
//        eleMap.put("Na3", 68.96931);
//        eleMap.put("Na4", 91.95908);
//        eleMap.put("Na5", 114.94885);
//        eleMap.put("Na6", 137.93862);
//        eleMap.put("Na7", 160.92839);
//        eleMap.put("Na8", 183.91816);
//        eleMap.put("Na9", 206.90793);
//        eleMap.put("Na10", 229.8977);
//        eleMap.put("Na11", 252.88747);
//        eleMap.put("Na12", 275.87724);
//        eleMap.put("Na13", 298.86701);
//        eleMap.put("Na14", 321.85678);
//        eleMap.put("Na15", 344.84655);

        Pattern a = Pattern.compile("[A-Z][a-z]?[a-z]?\\d?\\d?");
        //find the match(element)
        Matcher m = a.matcher(formula);
        double eleAtomicMass = 0.00;
        double totalMolarMass = 0.00;
        
        while(m.find() == true){
            int number = 1;
            
            //obtain element from the formula using substring
            String element = formula.substring(m.start(), m.end());
            System.out.println("element = " + element);
            //check to see if the element has a subscript
            
           // Pattern b = Pattern.compile("[A-Z][a-z]?[a-z]?\\d+");
            //Matcher n = b.matcher(element);
            //n.find();
            Pattern b = Pattern.compile("\\d+");
            Matcher n = b.matcher(element);
            
            if(n.find() == true){
                number = Integer.parseInt(element.substring(n.start(), n.end()));
                System.out.println("Number" + number);
            }
            
                Pattern c = Pattern.compile("[A-Z][a-z]?[a-z]?");
                Matcher letter = c.matcher(element);
                letter.find();
                String symbol = element.substring(letter.start(), letter.end());
                System.out.println("Symbol" + symbol);
                
                eleAtomicMass = eleMap.get(symbol) * number;
                totalMolarMass = totalMolarMass + eleAtomicMass;
                System.out.println("number total mass" + totalMolarMass);
                //find the atomic mass of the element
               
            
            //find the atomic mass of the element
            eleAtomicMass = eleMap.get(symbol);
            
            //chop off the derived element from the formula
            formula = formula.substring(m.end(), formula.length());
            m = a.matcher(formula);
            
        }    
         System.out.println("total mass" + totalMolarMass);
        return totalMolarMass;
    }// close method parseFormula
    
    public static double calcMolesOfSoln(double mass, double totalMolarMass){
        double molesOfSoln = mass * (1 / totalMolarMass); 
        return molesOfSoln;
    }
    
    public static double calcMolarity(double waterVolume, double molesOfSoln){
        double molarity = molesOfSoln / waterVolume;
        return molarity;
    }
    
    public static void printOutput(double molarity, String formula){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Molarity of the soultion is:  " + molarity + " M " + formula);
        System.out.println("----------------------------------------------------------------------");
    }
}//close class