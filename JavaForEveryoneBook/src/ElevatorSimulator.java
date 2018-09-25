
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
public class ElevatorSimulator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        int floor = in.nextInt();
        
        //Adjust floor if necessary
        
        int actualFloor;
        if(floor > 13){
            actualFloor = floor -1;
        }else{
            actualFloor = floor;
        }
        System.out.println("The elevator will travel to the actual floor " + actualFloor);
    }
}
