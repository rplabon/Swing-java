/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldframe;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import org.omg.CORBA.PRIVATE_MEMBER;


/**
 *
 * @author Rabiul
 */
public class TextFieldFrame extends JFrame {

    private JTextField textField1; // text field with set size
    private JTextField textField2; // text field constructed with text
    private JTextField textField3; // text field with text and size
    private JPasswordField passwordField;
    public TextFieldFrame()
    {
        super("Testing Jtext");
        setLayout(new FlowLayout());//
        // construct
        textField1=new JTextField(10);
        add(textField1);
        //2
        textField2= new JTextField(10);
        add(textField2);
        //3
        textField3= new JTextField("uneditable", 21);
        textField3.setEditable(false);
        add(textField3);
        ///pass
        
        passwordField =new JPasswordField("hiden");
        add(passwordField);
        
        ///register event handlesrs
        //TextFieldHandler handle = new TextFieldHandler();
        

        
    }
    private class TextFieldHandle implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String string ="";
            if(e.getSource()==textField1)
                string= String.format("textField :%s", e.getActionCommand());
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    
    public static void main(String[] args) {
        
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        textFieldFrame.setSize( 325, 100 ); // set frame size
        textFieldFrame.setVisible( true ); // 
        // TODO code application logic here
    }
}
