
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
public class Reverse {
    public static void main(String[] args){
        double[] numbers = readInputs(5);
        multiply(numbers, 10);
        printReversed(numbers);
    }
    /**
     * Reads a sequence of floating-point numbers.
     */
    public static double[] readInputs(int numberOfInputs){
        System.out.println("Enter " + numberOfInputs + " numbers: ");
        Scanner in = new Scanner(System.in);
        double[] inputs = new double[numberOfInputs];
        for(int i = 0; i < inputs.length; i++){
            inputs[i] = in.nextDouble();
        }
        return inputs;
    }
    /**
     * Multiplies all elements of an array by a factor.
     */
    public static void multiply(double[] values, double factor){
        for(int i = 0; i < values.length; i++){
            values[i] = values[i] * factor;
        }
    }
    
    //Prints an array in reverse order.
    
    public static void printReversed(double[] values){
        for(int i = values.length - 1; i >= 0; i--){
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
