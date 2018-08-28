/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplegui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author root
 */
public class ExampleGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame myFrame = new JFrame("My GUI Application");
        
        JButton okButton = new JButton();
        okButton.setText("Okay");
        okButton.setToolTipText("This is the OkayButton!");
        //okButton.setSize(100, 100);
        
        JButton button2 = new JButton("Cancel");
        button2.setToolTipText("This is button2");
        //button2.setSize(110, 100);
        
        //creating the jpanel
        JPanel panel1 = new JPanel();
        panel1.setBorder(new TitledBorder("Panel1 Border"));
        
        panel1.add(okButton);
        panel1.add(button2);
        panel1.setSize(100,50);
        
        JButton button3 = new JButton("Button 3");
        button3.setToolTipText("This is Button 3");
        button3.setForeground(Color.red);
        
        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder("Panel 2 Border"));
        panel2.setLayout(new GridLayout(2,2));
        
        panel2.add(button3);
        
        myFrame.add(panel1);
        myFrame.add(panel2);
        
        myFrame.setSize(600, 400);
        myFrame.setLocationRelativeTo(null);
        myFrame.setLayout(new GridLayout(2,5));
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
    
}
