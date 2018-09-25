
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 *A Component that draws a chart.
 */

/**
 *
 * @author Lauro Ribeiro
 */
public class ChartComponent1 {
    private ArrayList<Double>values;
    private double maxValue;
    
    public ChartComponent1(double max){
        values = new ArrayList<Double>();
        maxValue = max;
    }
    public void append(double value){
        values.add(value);
        
    }
    
    public void paintComponent(Graphics g){
        final int GAP = 5;
        final int BAR_HEIGHT =10;
        
        int y = GAP;
        for(double value : values){
            int barWidth = (int) (200 * value / maxValue);
            g.fillRect(0, y, barWidth, BAR_HEIGHT);
            y = y + BAR_HEIGHT + GAP;
        }
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
