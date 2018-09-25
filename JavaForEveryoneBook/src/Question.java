
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
public class Question {
    private String text;
    private String answer;
    
    //Constructs a question with empty question and answer
    
    public Question(){
        text = " ";
        answer=" ";
    }
    //sets the question text.
    public void setText(String questionText){
        text = questionText;
    }
    
    //sets the answer for this question
    public void setAnswer(String correctResponse){
        answer = correctResponse;
    }
    // Checks a given response for correctness
    
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    
        //Displays this question
        public void display(){
           System.out.println(text);
        }

        
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            
            Question q = new Question();
            q.setText("Who was the inventor of Java?");
            q.setAnswer("James Gosling");
            
            q.display();
            System.out.println("Your answer: ");
            String response = in.nextLine();
            System.out.println(q.checkAnswer(response));
        }
        
}
