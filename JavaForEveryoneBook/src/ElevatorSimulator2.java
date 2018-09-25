
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class ElevatorSimulator2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        
        if(in.hasNextInt()){
            //now we know that the user entered an integer
            
            int floor = in.nextInt();
            
            if(floor == 13){
                System.out.println("Error: There is no thirteenth floor.");
            }else  if(floor <=0 || floor >20){
                System.out.println("Error: the floor must be between 1 and 20");
            }
            else{
                //now we know that the input is valid
                int actualFloor = floor;
                if(floor > 13){
                    actualFloor = floor - 1;
                }
                System.out.println("The elevator will travel to the actual floor " +  actualFloor);
            }
        }
        else{
            System.out.println("Error: not an integer.");
        }
    }
}
