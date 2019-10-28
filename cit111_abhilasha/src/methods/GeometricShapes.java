/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 * A calculator that allows the user to choose amongst a set of shapes and with the help of values entered by the user, finds the volume of the desired shape.
 * 
 * @author abhilasha.raghuwansh
 */
public class GeometricShapes {
    public static void main (String[]args){
        
         int SELECTOR;
         
        System.out.println("Choose the shape whose volume is to be calculated");
        System.out.println("1. Cube");
        System.out.println("2. Cylinder");
        System.out.println("3. Trapezoid");
        System.out.println("4. Triangular Prism");
        System.out.println("5. Tetrahedron(using 6 edges)");
        Scanner input = new Scanner(System.in);
        SELECTOR = input.nextInt();
        
        
        switch(SELECTOR){
            case 1:
                System.out.println("Enter length of the sides of the Cube:");
                double cube_sideLength = input.nextInt();
                
                double cubeVolume = calcVolumeOfCube(cube_sideLength); 
                System.out.println("Volume of the Cube is: " + cubeVolume);
                break;
            
            case 2:
                System.out.println("Enter radius of the Cylinder:");
                double cylinder_radius = input.nextInt();
                System.out.println("Enter height of the Cylinder");
                double cylinder_height = input.nextInt();
                
                double cylinderVolume = calcVolumeOfCylinder(cylinder_height, cylinder_radius); 
                System.out.println("Volume of the Cylinder is: " + cylinderVolume);
                break;
            
            case 3: 
                System.out.println("We will first need to find the area of the Trapezoid base");
                System.out.println("Enter value of lower base of Prism:");
                double lower_base = input.nextInt();
                System.out.println("Enter value of the upper_base of the Prism:");
                double upper_base = input.nextInt();
                System.out.println("Enter height of the prism:");
                double prism_height = input.nextInt();
                double area = calcAreaOfTrapezoidBase(upper_base, lower_base, prism_height); 
                System.out.println("Enter height between Trapezoid ends:");
                double heightBetweenEnds  = input.nextInt();
                
                double trapezoidVolume = calcVolumeOfTrapezoid(area, heightBetweenEnds);
                System.out.println("Volume of the Trapezoid is: " + trapezoidVolume);
                break;
                
            case 4:
                System.out.println("Enter the base of the Triangle:");
                double b = input.nextInt();
                System.out.println("Enter the height of the Triangle:");
                double h = input.nextInt();
                System.out.println("Enter the length of prism:");
                double l = input.nextInt();
                
                double prismVolume = calcPrismVolume(b, h, l);
                System.out.println("Volume of the Triangular prism is: " + prismVolume);
                break;
            
            case 5:
                System.out.println("Enter edge a:");
                double edge_a = input.nextInt();
                System.out.println("Enter edge b:");
                double edge_b = input.nextInt();
                System.out.println("Enter edge c:");
                double edge_c = input.nextInt();
                 System.out.println("Enter edge oppisite to a:");
                double edge_X = input.nextInt();
                System.out.println("Enter edge opposite to b:");
                double edge_Y = input.nextInt();
                System.out.println("Enter edge opposite to c:");
                double edge_Z = input.nextInt();
                
                double tetrahedronVolume = calcTetrahedronVolume(edge_a, edge_b, edge_c, edge_X, edge_Y, edge_Z);
                System.out.println("Volume of the tetrahedron is : " + tetrahedronVolume);
                break;
                
            default:
                System.out.println("Invalid option");
                break;
        }//close switching block 
        
        
       /* if(shapeInput == 1){
            System.out.println("Enter length of the sides of the Cube:");
            double cube_sideLength = input.nextInt();
                
            double cubeVolume = calcVolumeOfCube(cube_sideLength); 
            System.out.println("Volume of the Cube is: " + cubeVolume);
        }
        
        else if(shapeInput == 2){
            System.out.println("Enter radius of the Cylinder:");
            double cylinder_radius = input.nextInt();
            System.out.println("Enter height of the Cylinder");
            double cylinder_height = input.nextInt();
                
            double cylinderVolume = calcVolumeOfCylinder(cylinder_height, cylinder_radius); 
            System.out.println("Volume of the Cylinder is: " + cylinderVolume);
        }
        
        else if(shapeInput == 3){
            System.out.println("We will first need to find the area of the Trapezoid base");
            System.out.println("Enter value of lower base of Prism:");
            double lower_base = input.nextInt();
            System.out.println("Enter value of the upper_base of the Prism:");
            double upper_base = input.nextInt();
            System.out.println("Enter height of the prism:");
            double prism_height = input.nextInt();
            double area = calcAreaOfTrapezoidBase(upper_base, lower_base, prism_height); 
            System.out.println("Enter height between Trapezoid ends:");
            double heightBetweenEnds  = input.nextInt();
                
            double trapezoidVolume = calcVolumeOfTrapezoid(area, heightBetweenEnds);
            System.out.println("Volume of the Trapezoid is: " + trapezoidVolume);
        }
        
        else if(shapeInput == 4){
            System.out.println("Enter the base of the Triangle:");
            double b = input.nextInt();
            System.out.println("Enter the height of the Triangle:");
            double h = input.nextInt();
            System.out.println("Enter the length of prism:");
            double l = input.nextInt();
                
            double prismVolume = calcPrismVolume(b, h, l);
            System.out.println("Volume of the Triangular prism is: " + prismVolume);
        }
        
        else if(shapeInput == 5){
            System.out.println("Enter edge a:");
                double edge_a = input.nextInt();
                System.out.println("Enter edge b:");
                double edge_b = input.nextInt();
                System.out.println("Enter edge c:");
                double edge_c = input.nextInt();
                 System.out.println("Enter edge oppisite to a:");
                double edge_X = input.nextInt();
                System.out.println("Enter edge opposite to b:");
                double edge_Y = input.nextInt();
                System.out.println("Enter edge opposite to c:");
                double edge_Z = input.nextInt();
                
                double tetrahedronVolume = calcTetrahedronVolume(edge_a, edge_b, edge_c, edge_X, edge_Y, edge_Z);
                System.out.println("Volume of the tetrahedron is : " + tetrahedronVolume);
        }
        else{
            System.out.println("Invalid option");
        }*/
                
        
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
            
    public static double calcPrismVolume(double b, double h, double l){
        double prismVolume = 0.5 * b * h * l;
        return prismVolume;
    }
    
    public static double calcTetrahedronVolume(double a, double b, double c, double X, double Y, double Z){
        double tetrahedronVolume = (Math.sqrt((4 * Math.pow(a, 2) * Math.pow(b, 2) * Math.pow(c, 2)) - (Math.pow(a, 2) * Math.pow(X, 2)) - (Math.pow(b, 2) * Math.pow(Y, 2)) - (Math.pow(c, 2) * Math.pow(Z, 2)) + (X*Y*Z) )) / 12;
        return tetrahedronVolume;
    }
}//close class

