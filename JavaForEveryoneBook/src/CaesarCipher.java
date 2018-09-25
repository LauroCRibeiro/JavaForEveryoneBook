
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import static oracle.jrockit.jfr.tools.ConCatRepository.usage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class CaesarCipher {
    public static void main(String[] args) throws FileNotFoundException{
        final int DEFAULT_KEY = 3;
        int key = DEFAULT_KEY;
        String inFile = " ";
        String outFile = " ";
        int files = 0; // Number of command line arguments that are files
        
        for(int i = 0; i < args.length; i++){
         String arg = args[i];
         if(arg.charAt(0) == '-'){
             //It is command line option
             char option = arg.charAt(1);
             if(option == 'd'){key = -key; }
             else{
                 //It is a file name
                 files++;
                 if(files == 1) {inFile = arg;}
                 else if(files == 2){outFile = arg;}
             }
         }
         if(files !=2){ usage(); return;}
         Scanner in = new Scanner(new File(inFile));
         in.useDelimiter(""); // Process individual characters
         PrintWriter out = new PrintWriter(outFile);
         
         while(in.hasNext()){
             char from = in.next().charAt(0);
             char to = encrypt(from,key);
             out.print(to);
         }
         in.close();
         out.close();
        }
        /**Encrypts upper= and lowercase characters by shifting them
         * according to a key
         * @param ch the letter to be encrypted
         * @param key the encryption key
         * @return the encrypted letter
         */
    }

    private static char encrypt(char ch, int key) {
       int base = 0;
       if('A' <= ch && ch <= 'Z'){base = 'A';}
       else if('a' <= ch && ch <= 'z'){base = 'a';}
       else{ return ch;}// Not a Letter
       int offset = ch - base + key;
       final int LETTERS = 26; // Number of letters in the Roman alphabet
       if(offset > LETTERS){ offset = offset - LETTERS;}
       else if(offset <0){offset = offset + LETTERS;}
       return(char) (base + offset);
    }
    //Print a message describing proper usage
    
    public static void usage(){
        System.out.println("Usage: Java CaesarCipher[-d] infile outfile");
    }
}
    
    
    
    

