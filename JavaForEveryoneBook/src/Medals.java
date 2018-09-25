/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class Medals {
    public static void main(String[] args){
        final int COUNTRIES = 7;
        final int MEDALS = 3;
        
        String[] countries = {
            "Canada",
            "China",
            "Germany",
            "Korea",
            "Japan",
            "Russia",
            "United States"
        };
        
        int[][] counts = {
            {1,0,1},
            {1,1,0},
            {0,0,1},
            {1,0,0},
            {0,1,1},
            {0,1,1},
            {1,1,0}
           
     };
        System.out.println("    Country   Gold   Silver   Bronze   Total");
        
        //Print countries, counts, and row totals
        for(int i = 0; i < COUNTRIES; i++){
            System.out.printf("%15s", countries[i]);
            
            int total = 0;
            
            //Print each row element and update the row total
            for(int j = 0; j < MEDALS; j++){
                System.out.printf("%8d", counts[i][j]);
                total = total + counts[i][j];
            }
            
            //Display the row total and print a new line
            System.out.printf("%8d\n", total);
        }
   }
}
