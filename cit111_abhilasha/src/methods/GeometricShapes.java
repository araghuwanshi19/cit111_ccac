/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 *
 * @author abhilasha.raghuwansh
 */
public class GeometricShapes {
    public static void main (String[]args){
        System.out.println("Choose the shape whose volume is to be calculated");
        System.out.println("1. Cube");
        System.out.println("2. Cylinder");
        System.out.println("3. Trapezoid");
        Scanner input = new Scanner(System.in);
        int shapeInput = input.nextInt();
        
        if(shapeInput == 1){
            System.out.println("Enter length of the sides of the Cube:");
            double length = input.nextInt();
            double cubeVolume = calcVolumeOfCube(length); 
            System.out.println("Volume of the Cube is: " + cubeVolume);
        }//close if block
        
        else if(shapeInput == 2){
            System.out.println("Enter radius of the Cylinder:");
            double radius = input.nextInt();
            System.out.println("Enter height of the Cylinder");
            double height = input.nextInt();
            double cylinderVolume = calcVolumeOfCylinder(height, radius); 
            System.out.println("Volume of the Cylinder is: " + cylinderVolume);
        }//close if/else block
        
        else if(shapeInput == 3){
            System.out.println("We will first need to find the area of the Trapezoid base");
            System.out.println("Enter value of lower base of Prism:");
            double lower_base = input.nextInt();
            System.out.println("Enter value of the upper_base of the Prism:");
            double upper_base = input.nextInt();
            System.out.println("Enter height of the prism:");
            double height = input.nextInt();
            double area = calcAreaOfTrapezoidBase(upper_base, lower_base, height); 
            System.out.println("Enter height between Trapezoid ends:");
            double heightBetweenEnds  = input.nextInt();
            double trapezoidVolume = calcVolumeOfTrapezoid(area, heightBetweenEnds);
            System.out.println("Volume of the Trapezoid is: " + trapezoidVolume);
        }// close if/else block 
        
        else{
            System.out.println("INVALID RESPONSE!");
        }//close else block
        
    }// close main
    
    public static double calcVolumeOfCube (double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    }//close calcVolumeOfCube
    
    public static double calcVolumeOfCylinder(double height, double radius){
        double cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        return cylinderVolume;
    }//close calacVolumeOfCylinder
    
    public static double calcAreaOfTrapezoidBase(double upper_base, double lower_base, double height){
        double area = 0.5 * (upper_base + lower_base) * height;
        return area;
    }
    
    public static double calcVolumeOfTrapezoid(double areaOfBase, double height){
        double trapezoidVolume = areaOfBase * height;
        return trapezoidVolume;
    }//close calcVolumeofTrapezoid
            
}//close class
