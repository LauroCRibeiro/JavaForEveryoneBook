
import java.util.ArrayList;

/*
 * A question with multiple choices
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class ChoiceQuestion extends Question{
    
    private ArrayList<String>choices;
    /**
     * Constructs a choice question with no choices
     */
    
    public ChoiceQuestion(){
        choices = new ArrayList<String>();
    }
    
    //Adds an answer choice to this question
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            //Convert choices.size() to String
           String choiceString ="" + choices.size();
           setAnswer(choiceString);
        }
    }
    
    public void display(){
        //Display the question text
        super.display();
        //Display the answer choices
        for(int i = 0; i < choices.size(); i++){
            int choiceNumber = i +1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}
