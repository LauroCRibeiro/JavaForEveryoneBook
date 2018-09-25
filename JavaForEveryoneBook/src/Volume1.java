/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class Volume1 {
    public static void main(String[] args){
        int cansPerPack = 6;
        final double CAN_VOLUME = 0.355;
        double totalVolume = cansPerPack * CAN_VOLUME;

        System.out.print("A six-pack of 12-ounce cans contains");
        System.out.print(totalVolume);
        System.out.println("Liters");
        
        final double BOTTLE_VOLUME = 2; //Two-liter bottle
        
        totalVolume = totalVolume + BOTTLE_VOLUME;
        
        System.out.println("A six-pack and a two-liter bottle contain");
        System.out.println(totalVolume);
        System.out.println("Liters");
    }
}
