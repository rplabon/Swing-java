/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonframe;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mont HTB
 */
public class ButtonFrame extends JFrame{
    private JButton plainJButton;
    
    public ButtonFrame()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        plainJButton = new JButton("plain");
        add(plainJButton);
        
        //creat enew button handler
        ButtonHandler handler= new ButtonHandler();
        plainJButton.addActionListener(handler);
        
        
    }
private class ButtonHandler implements ActionListener
{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this,String.format("u pressed %s",e.getActionCommand()));
            
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ButtonFrame buttonFrame= new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(120, 344);
        buttonFrame.setVisible(true);
        // TODO code application logic here
    }
}

