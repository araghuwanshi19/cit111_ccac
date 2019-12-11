/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 * Declares all characteristics of the object element
 * 
 * @author abhilasha.raghuwansh
 */
public class Element {
    
    public String name;
    public String color;
    public String symbol;
    public double density;
    public double meltingPoint;
    public double boilingPoint;
    public double atomicNumber;
    public double atomicMass;
    public int ionCharge;
    public int unpairedElectrons;
    
    
    
    
    
    public void printElementProperties(){
        
        System.out.println("---------------------------------------------------");
        System.out.println("Element name: " + this.name);
        System.out.println("Element symbol: " + this.symbol);
        System.out.println("Element color: " + this.color);
        System.out.println("Element atomic number: " + this.atomicNumber);
        System.out.println("Element atomic mass: " + this.atomicMass);
        System.out.println("Element density: " + this.density);
        System.out.println("Element melting point: " + this.meltingPoint);
        System.out.println("Element boiling point: " + this.boilingPoint);
        System.out.println("---------------------------------------------------");
    }// close method
    
}//close class
