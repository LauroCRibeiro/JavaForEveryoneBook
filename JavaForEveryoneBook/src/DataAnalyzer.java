
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
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
public class DataAnalyzer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //Keep trying until there are no more exceptions
        boolean  done = false;
        while(!done){
            try{
                System.out.print("Please enter the file name: ");
                String filename = in.next();
                
                double[] data = readFile(filename);
                
             // As an example for processing the data, we compute the sum
             double sum = 0;
             for(double d : data){sum = sum + d;}
             System.out.println("The sum is " + sum);
             
             done = true;
            }
            catch(FileNotFoundException exception){
                System.out.println("File not found.");
            }
            catch(NoSuchElementException exception){
                System.out.println("File contents invalid.");
            }
            catch(IOException exception){
                exception.printStackTrace();
            }
        }
    }
    
    public static double[] readFile(String filename) throws IOException{
        File inFile = new File(filename);
        Scanner in = new Scanner(inFile);
        try{
            return readData(in);
        }
        finally{
            in.close();
        }
    }
    
    public static double[] readData(Scanner in) throws IOException{
        int numberOfValues = in.nextInt(); //May throw NoSuchElementException
        double[] data = new double[numberOfValues];
        
        for(int i = 0; i < numberOfValues; i++){
            data[i] = in.nextDouble(); // May throw NoSuchElementException
    }
        if(in.hasNext()){
            throw new IOException("End of file expected");
        }
        return data;
    }
}
