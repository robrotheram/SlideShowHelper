/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slideshowhelper;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Robert
 */
public class SlideShowHelper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animation a = new Animation();
        // ---- add to  panels --//
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBackground(Color.GREEN);
        p2.setBackground(Color.BLUE);
        
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        p3.setBackground(Color.GREEN);
        p4.setBackground(Color.BLUE);
        a.addBiCharts(p1, p2, AnimationType.LEFT, AnimationSpeed.VERYFAST, AnimationWait.VERYSHORT);
        a.addBiCharts(p3, p4, AnimationType.LEFT, AnimationSpeed.FAST, AnimationWait.VERYSHORT);
        a.setVisible(true);
    }
}
