/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class CashRegister {
    private int itemCount;
    private double totalPrice;
    
    // Contructs a cash register with cleared item count and total.
    
    public CashRegister(){
        itemCount = 0;
        totalPrice = 0;
    }
    
    public void addItem(double price){
        itemCount++;
        totalPrice = totalPrice + price;
    }
    
    // Gtes the price of all items in the current sale returns the total amount
    
    public double getTotal(){
        return totalPrice;
    }
    
    // Gets the number of items in the current sale 
    public int getCount(){
        return itemCount;
    }
    
    public void clear(){
        itemCount=0;
        totalPrice = 0;
    }
    public static void main(String[] args){
        CashRegister register1 = new CashRegister();
        register1.addItem(1.95);
        register1.addItem(0.95);
        register1.addItem(2.50);
        System.out.println(register1.getCount());
        System.out.println("Expected: 3");
        System.out.printf("%.2f\n", register1.getTotal());
        System.out.println("Excepted: 5.40");
    }
}


