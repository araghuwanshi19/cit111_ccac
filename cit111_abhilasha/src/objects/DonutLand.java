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
public class DonutLand {
    
    public static void main (String[] args){
        
        Donut donut1 = new Donut();
        donut1.name = "Tube";
        donut1.flavor = "Powdered";
        donut1.calories = 10;
        donut1.percentRemaining = 100;
        donut1.displayDonutStatus();
            
        Donut donut2 = new Donut();
        donut2.name = "Jay-G";
        donut2.flavor = "Frosting";
        donut2.calories = 75;
        donut2.percentRemaining = 100;
        donut2.displayDonutStatus();
        donut2.eatDonut(23);
        donut2.displayDonutStatus();
        donut2.eatDonut(23);
        donut2.displayDonutStatus();
        donut2.eatDonut(23);
        donut2.displayDonutStatus();
        donut2.eatDonut(23);
        donut2.displayDonutStatus();
        
        
        Donut donut3 = new Donut();
        donut3.name = "Frodo";
        donut3.flavor = "Cinnamon Sugar";
        donut3.calories = 60;
        donut3.percentRemaining = 100;
        donut3.displayDonutStatus();
        
        Donut donut4 = new Donut();
        donut4.name = "Ryan";
        donut4.flavor = "Regular";
        donut4.calories = 50;
        donut4.percentRemaining = 100;
        donut4.displayDonutStatus();

} //close main
} // close class
