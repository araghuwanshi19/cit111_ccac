/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 * The tax value is calculated based on the principal and a total price, consisting of the the principal value and the tax, is found
 * @author Abhilasha Raghuwanshi
 */
public class PurchaseCalculator {
    public static void main(String[] args){
        final double ITEM_PRICE = 108.00;
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        
        displayTotalPrice(ITEM_PRICE);
    }//close main
    
    public static void displayTotalPrice(double price){
        final double TAX_RATE = 0.075;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }//close displayPriceWithTax
    
}//close class
