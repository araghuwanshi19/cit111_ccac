/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;
/**
 * The tax value is calculated based on the principal and a total price, consisting of the the principal value and the tax, is found
 * @author Abhilasha Raghuwanshi
 */
public class PurchaseCalculator {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Item Price:");
        double item_price = input.nextInt();
        
        
        System.out.println("Enter spending limit:");
        int inputLimit = input.nextInt();
        displayPurchasableNumber(item_price,inputLimit);
        
        displayTotalPrice(item_price);

    }//close method main
    
    public static void displayTotalPrice(double price){
        final double TAX_RATE = 0.075;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
        
        computePriceAfterDiscount(totalPrice, 0.15);
    }//close method displayPriceWithTax
    
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount); 
        System.out.println("Price after discount: $" + finalPrice);
    }// close method computePriceAfterDiscount
    
    public static void displayPurchasableNumber(double price, double limit){
        Scanner input = new Scanner(System.in);
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("With $" + price + " you can buy " + numPurchasable + " units");
        System.out.println("How many units of this item would you like to purchase?");
        int desiredUnit = input.nextInt();
        computeItemPrice(price, desiredUnit);
    }// close method displayPurchasableNumber
    
    public static void computeItemPrice(double item_price, double unit){
        double price = item_price * unit;
    }// close method computePrice
}//close class
