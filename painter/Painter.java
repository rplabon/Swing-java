/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rabiul
 */
public class Painter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create JFrame
        JFrame application = new JFrame( "A simple paint program" );

        PaintPanel paintPanel = new PaintPanel(); // create paint panel
        application.add( paintPanel, BorderLayout.CENTER ); // in center

        // create a label and place it in SOUTH of BorderLayout
        application.add( new JLabel( "Drag the mouse to draw" ),
           BorderLayout.SOUTH );

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.setSize( 400, 200 ); // set frame size
        application.setVisible( true ); // display frame
       // TODO code application logic here
    }
}
