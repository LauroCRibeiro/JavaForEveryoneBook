

import java.util.Scanner;

/*
 This program shows a simple quiz with two choice questions
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class QuestionDemo2 {
    public static void main(String[] args){
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java Language?");
        first.addChoice("*7", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);
        
        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        
        presentQuestion(first);
        presentQuestion(second);
    }
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.print("Your name: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}

