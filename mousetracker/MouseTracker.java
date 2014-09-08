/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mousetracker;


import javax.swing.JFrame;

/**
 *
 * @author Mont HTB
 */
public class MouseTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        mouseTrackerFrame.setSize( 500, 800 ); // set frame size
        mouseTrackerFrame.setVisible( true ); // display frame

        // TODO code application logic here
    }
}
