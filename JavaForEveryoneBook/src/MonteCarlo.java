/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class MonteCarlo {
    public static void main(String [] args){
        final int TRIES = 10000;
        
        int hits = 0;
        for(int i = 1; i <= TRIES; i++){
            //Generate two random numbers between -1 and 1
            
            double r = Math.random();
            double x = -1 +2 * r; //Between -1 and 1
            r = Math.random();
            double y = -1 +2 * r;
            
            //Check whether the point lies in the unit circle
            
            if(x * x + y * y <= 1){
                hits++;
            }
        }
        /*
        The Ratio hits / tries approximately the same as the ratio circle area/ square area = pi/4
        */
        
        double piEstimate = 4.0 * hits/ TRIES;
        System.out.println("Estimate for pi: " + piEstimate);
       
    }
}
