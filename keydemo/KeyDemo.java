/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keydemo;

import javax.swing.JFrame;

/**
 *
 * @author Rabiul
 */
public class KeyDemo {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
        keyDemoFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        keyDemoFrame.setSize( 350, 100 ); // set frame size
        keyDemoFrame.setVisible( true ); // display frame

        // TODO code application logic here
    }
}
