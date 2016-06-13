/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bxlyout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;
public class bx extends JFrame{
    
    private JFrame frame;
    private JPanel panel;
     private JButton b1,b2;
     private JLabel l1;
     private JTextField t1;
     private FlowLayout l;
    
   
    
   public bx(){
       
      
        frame=new JFrame("BOX ");
        b1=new JButton();
        b2=new JButton();
        panel=new JPanel();
        
        l1=new JLabel("LBL");
        t1=new JTextField("NAME: ",5);
        
        //get man content panel
        panel=(JPanel)frame.getContentPane();
       // panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        //sidb box grid layout x1:2 y 5:5
        panel.setLayout(new GridLayout(1,2,5,5));
        panel.add(b1);
        
       // panel.add(Box.createRigidArea(new Dimension(20,50)));
        panel.add(b2);
        //panel.add(l1);
        panel.add(t1);
        //NEW ADD
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        //frame.pack();
    }
    
    
}
