/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.util.Scanner;

/**
 *Consists of 15 instances of elements (Hydrogen - Phosphorus) and makes computations to find whether the two elements picked by the user can form an ionic bond.
 * 
 * @author abhilasha.raghuwansh
 */
public class ElementLand {
    
    public static void main (String[] args){
        
        Element[] elements = new Element[110];
        
        Element temp = new Element();
        temp.name = "Hydrogen";
        temp.symbol = "H";
        temp.atomicNumber = 1;
        temp.atomicMass = 1.008;
        temp.meltingPoint = -259.14; //in celcius
        temp.boilingPoint = -252.87;
        temp.density = 0.0000899; // in g/cm^3
        temp.color = "Colorless";
        temp.ionCharge = +1;
        temp.printElementProperties();
        elements[1] = temp;
        
        Element helium = new Element();
        helium.name = "Helium";
        helium.symbol = "He";
        helium.atomicNumber = 2;
        helium.atomicMass = 4.002602;
        helium.meltingPoint = -272.2; //in celcius
        helium.boilingPoint = -263.93;
        helium.density = 0.0001785; // in g/cm^3
        helium.color = "Colorless";
        helium.ionCharge = 0;
        helium.printElementProperties();
        elements[2] = helium;
        
        Element lithium = new Element();
        lithium.name = "Lithium";
        lithium.symbol = "Li";
        lithium.atomicNumber = 3;
        lithium.atomicMass = 6.94;
        lithium.meltingPoint = 180.54; //in celcius
        lithium.boilingPoint = 1342;
        lithium.density = 0.535; // in g/cm^3
        lithium.color = "Silver";
        lithium.ionCharge = +1;
        lithium.printElementProperties();
        elements[3] = lithium;
        
        Element beryllium = new Element();
        beryllium.name = "Beryllium";
        beryllium.symbol = "Be";
        beryllium.atomicNumber = 4;
        beryllium.atomicMass = 9.0121831;
        beryllium.meltingPoint = 1287; //in celcius
        beryllium.boilingPoint = 2470;
        beryllium.density = 1.848; // in g/cm^3
        beryllium.color = "Slate gray";
        beryllium.ionCharge = +2;
        beryllium.printElementProperties();
        elements[4] = beryllium;
        
        Element boron = new Element();
        boron.name = "Boron";
        boron.symbol = "B";
        boron.atomicNumber = 5;
        boron.atomicMass = 10.81;
        boron.meltingPoint = 2075; //in celcius
        boron.boilingPoint = 4000;
        boron.density = 2.46; // in g/cm^3
        boron.color = "Black";
        boron.ionCharge = 0;
        boron.printElementProperties();
        elements[5] = boron;
        
        Element carbon = new Element();
        carbon.name = "Carbon";
        carbon.symbol = "C";
        carbon.atomicNumber = 6;
        carbon.atomicMass = 12.011;
        carbon.meltingPoint = 3550; //in celcius (in case of activated charcoal)
        carbon.boilingPoint = 4027; // (in case of activated charcoal)
        carbon.density = 2.26; // in g/cm^3 (in case of activated charcoal)
        carbon.color = "Black";
        carbon.ionCharge = 0;
        carbon.printElementProperties();
        elements[6] = carbon;
        
        Element nitrogen = new Element();
        nitrogen.name = "Nitrogen";
        nitrogen.symbol = "N";
        nitrogen.atomicNumber = 7;
        nitrogen.atomicMass = 14.007;
        nitrogen.meltingPoint = -210.1; //in celcius
        nitrogen.boilingPoint = -195.79;
        nitrogen.density = 0.001251; // in g/cm^3
        nitrogen.color = "Colorless";
        nitrogen.ionCharge = -3;
        nitrogen.printElementProperties();
        elements[7] = nitrogen;
        
        Element oxygen = new Element();
        oxygen.name = "Oxygen";
        oxygen.symbol = "O";
        oxygen.atomicNumber = 8;
        oxygen.atomicMass = 15.999;
        oxygen.meltingPoint = -218.3; //in celcius
        oxygen.boilingPoint = -182.9;
        oxygen.density = 0.001429; // in g/cm^3
        oxygen.color = "Colorless";
        oxygen.ionCharge = -2;
        oxygen.printElementProperties();
        elements[8] = oxygen;
        
        Element fluorine = new Element();
        fluorine.name = "Fluorine";
        fluorine.symbol = "F";
        fluorine.atomicNumber = 9;
        fluorine.atomicMass = 18.998403163;
        fluorine.meltingPoint = -219.6; //in celcius
        fluorine.boilingPoint = -188.12;
        fluorine.density = 0.001696; // in g/cm^3
        fluorine.color = "Colorless";
        fluorine.ionCharge = -1;
        fluorine.printElementProperties();
        elements[9] = fluorine;
        
        Element neon = new Element();
        neon.name = "Neon";
        neon.symbol = "Ne";
        neon.atomicNumber = 10;
        neon.atomicMass = 20.1797;
        neon.meltingPoint = -248.59; //in celcius
        neon.boilingPoint = -246.08;
        neon.density = 0.0009; // in g/cm^3
        neon.color = "Colorless";
        neon.ionCharge = 0;
        neon.printElementProperties();
        elements[10] = neon;
        
        Element sodium = new Element();
        sodium.name = "Sodium";
        sodium.symbol = "Na";
        sodium.atomicNumber = 11;
        sodium.atomicMass = 22.98976928;
        sodium.meltingPoint = 97.72; //in celcius
        sodium.boilingPoint = 883;
        sodium.density = 0.968; // in g/cm^3
        sodium.color = "Silver";
        sodium.ionCharge = +1;
        sodium.printElementProperties();
        elements[11] = sodium;
        
        Element magnesium = new Element();
        magnesium.name = "Magnesium";
        magnesium.symbol = "Mg";
        magnesium.atomicNumber = 12;
        magnesium.atomicMass = 24.305;
        magnesium.meltingPoint = 650; //in celcius
        magnesium.boilingPoint = 1090;
        magnesium.density = 1.738; // in g/cm^3
        magnesium.color = "Silver";
        magnesium.ionCharge = +2;
        magnesium.printElementProperties();
        elements[12] = magnesium;
        
        Element aluminum = new Element();
        aluminum.name = "Aluminium";
        aluminum.symbol = "Al";
        aluminum.atomicNumber = 13;
        aluminum.atomicMass = 26.9815385;
        aluminum.meltingPoint = 660.32; //in celcius
        aluminum.boilingPoint = 2519;
        aluminum.density = 2.7; // in g/cm^3
        aluminum.color = "Silver";
        aluminum.ionCharge = +3;
        aluminum.printElementProperties();
        elements[13] = aluminum;
        
        Element silicon = new Element();
        silicon.name = "Silicon";
        silicon.symbol = "Si";
        silicon.atomicMass = 28.085;
        silicon.meltingPoint = 1414; //in celcius
        silicon.boilingPoint = 2900;
        silicon.density = 2.33; // in g/cm^3
        silicon.color = "Gray";
        silicon.ionCharge = 0;
        silicon.printElementProperties();
        elements[14] = silicon;
        
        Element phosphorus = new Element();
        phosphorus.name = "Phosphorus";
        phosphorus.symbol = "P";
        phosphorus.atomicNumber = 15;
        phosphorus.atomicMass = 30.973761998;
        phosphorus.meltingPoint = 44.15; //in celcius (white phosphorus)
        phosphorus.boilingPoint = 280.5;//(white phosphorus)
        phosphorus.density = 1.823; // in g/cm^3 (white phosphorus)
        phosphorus.color = "Colorless";
        phosphorus.ionCharge = -3;
        phosphorus.printElementProperties();
        elements[15] = phosphorus;
        
        takeUserInput(elements);
    } //close main method
    
    
    public static void takeUserInput(Element[] elements){
        
        Scanner input = new Scanner(System.in);
        Scanner loop = new Scanner(System.in);
        
        int counter = 1;
        System.out.println("Choose the first element that you wish to check for a bond:");

        while(counter <= 15){
            System.out.println(counter + ". " + elements[counter].name);
            counter++;
        }

        Element ele1 = elements[input.nextInt()];

        System.out.println("Choose the second element that you wish to check for a bond:");

        Element ele2 = elements[input.nextInt()];

        computeBonding(ele1, ele2);

    } //close takeUserInput
    
    
    public static void computeBonding(Element ele1, Element ele2){
       
        if((ele1.ionCharge < 0 && ele2.ionCharge >= 0) || (ele1.ionCharge >= 0 && ele2.ionCharge < 0)){
            
            if( Math.abs(ele1.ionCharge) ==  Math.abs(ele2.ionCharge)){
                Compound compound = new Compound();
                compound.element1 = ele1.name;
                compound.element2 = ele2.name;
                compound.element1Symbol = ele1.symbol;
                compound.element2Symbol = ele2.symbol;
                compound.countElement1 = 1;
                compound.countElement2 = 1;
                
                System.out.println("The two elements bond to form the compound: " + ele1.symbol + ele2.symbol);
            }
            
            else{
                int ionCharge1 = ele1.ionCharge;
                int ionCharge2 = ele2.ionCharge;
                int lcm  = (ionCharge1 * ionCharge2);
                Compound compound = new Compound();
                compound.element1 = ele1.name;
                compound.element2 = ele2.name;
                compound.element1Symbol = ele1.symbol;
                compound.element2Symbol = ele2.symbol;
                compound.countElement1 = (lcm / ionCharge1);
                compound.countElement2 = (lcm / ionCharge2);
                
                System.out.println("The two elements bond to form the compound: " + compound.toString());
            }
        }
        
        else{
            System.out.println("The two elements cannot form a chemical bond");
        }
    }// close copmuteBonding method
    
} //close class
