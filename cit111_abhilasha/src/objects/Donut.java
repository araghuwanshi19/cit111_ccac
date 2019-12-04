/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Abhilasha Raghuwanshi
 */
public class Donut {

    public String name;
    public String flavor;
    public double radius;
    public int calories;
    public int percentRemaining;

    public int eatDonut(int biteSizePercent) {
        percentRemaining = percentRemaining - biteSizePercent;
        return percentRemaining;
    }//close eatDonut method

    public void displayDonutStatus(){
        System.out.println("**********************Donut Stats**********************");
        System.out.println("Name: " + this.name);
        System.out.println("Percent Remaining: " + this.percentRemaining);
        System.out.println("Calories: " + this.calories);
        System.out.println("*******************************************************");
    } // close displayDonutStatus
    
    }// close class
