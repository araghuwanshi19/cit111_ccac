/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author abhilasha.raghuwansh
 */
public class Compound {
    
    public String element1;
    public String element1Symbol;
    public String element2;
    public String element2Symbol;
    public int countElement1;
    public int countElement2;
    
    
    public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append(element1Symbol);
       
       if(countElement1 != 1){
        sb.append(Math.abs(countElement1));
       }
       sb.append(element2Symbol);
       
       if(countElement2 != 1){
        sb.append(Math.abs(countElement2));
       }
       
        return sb.toString();
    }
    
}
