
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
public class Initials {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        //Get the names of the couples
        System.out.print("Enter your first name: ");
        String first = in.next();
        System.out.println("Enter your significant other`s first name: ");
        String second = in.next();
        //Compute and display the inscription 
        
        String initials = first.substring(0, 1) + "&" + second.substring(0, 1);
        System.out.println(initials);
    }
}
