/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Operators;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class Operators {
    
    public static void main(String[] args){
        
        int result = 1 + 2;
        //result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;
        
        result = result - 1;
        //result is now 2
         System.out.println(original_result + " - 1 = " + result);
         original_result = result;
         
         result = result * 2;
         //rsult is now 4
          System.out.println(original_result + " * 2 = " + result);
          original_result = result;
          
          result = result /2;
          // result is now 2
           System.out.println(original_result + " / 2 = " + result);
           original_result = result;
          
           result = result + 8;
           // result is now 10
            System.out.println(original_result + " + 8 = " + result);
            original_result = result;
            
            result = result % 7;
            //rsult is now 3
             System.out.println(original_result + " % 7+ " + result);
    }
}

class unaryDemo {
    
    public static void main (String[] args){
        
        int result = +1;
        //rsult is now 1
        System.out.println(result);
        
        result++;
        //result is now 2
        System.out.println(result);
        
        result--;
        //result is now 1
        System.out.println(result);
        
        result = -result;
        //result is now -1
        System.out.println(result);
        
        boolean success = false;
        //false
        System.out.println(success);
        //true
        System.out.println(!success);
    }
}

class PrePostDemo{
    
    public static void main (String[] args){
//        int i = 3;
//        i++;
//        //result is 4
//        System.out.println(i);
//        
//        ++i;
//        //prints 5
//        System.out.println(i);
//        
//        //prints 6
//        System.out.println(++i);
//        
//        System.out.println(i++);
//        //prints 6 (original value)
//        
//        System.out.println(i);
//        
 int i = 3;
        i++;
        System.out.println(i); // result is 4
        
        ++i;			   
        System.out.println(i); //result is 5
       
        System.out.println(++i); //result is 6
        
        System.out.println(i++); //result is 6
    
        System.out.println(i); // result is 7
    }
}