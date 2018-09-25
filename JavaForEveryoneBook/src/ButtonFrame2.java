
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Lauro Ribeiro
 */
public class ButtonFrame2 extends JFrame {
    private JButton button;
    private JLabel label;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    
    public ButtonFrame2(){
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    class ClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            label.setText("I was clicked");
        }
    }
    private void createComponents(){
        button = new JButton("Click me");
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
        
        label = new JLabel("Hello, Worlds");
        
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
    }
     public static void main(String[] args){
        JFrame frame = new ButtonFrame2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
