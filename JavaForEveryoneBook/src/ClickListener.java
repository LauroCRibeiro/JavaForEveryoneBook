
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * An Action Listener that prints a message
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class ClickListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
         System.out.println("I was clicked.");
    }
    
}
