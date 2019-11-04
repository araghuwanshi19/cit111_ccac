/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class ScopeBasics {
    
    //making a member variable called classScopedVar
    private static String classScopeVar = "All methods can access me";
    
    public static void main(String[] args){
        //print out statements of classScopeVar
        System.out.println(classScopeVar);
        //call demonstrateScope
        demonstrateScope();
        //print new contents of classScopeVar
        System.out.println(classScopeVar);
    }//close main
    
    public static void demonstrateScope(){
        String localScope = "Local scope";
        System.out.println(localScope);
        //print out contents of classScopeVar
        System.out.println(classScopeVar);
        //overwerite classScopeVar to say: "overwrite classScopeVar"
        classScopeVar = "overwrite classScopeVar";
        //print new contents of classScopedVar
        System.out.println(classScopeVar);
    }
}//close class
