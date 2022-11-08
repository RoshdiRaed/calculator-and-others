/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author TAIBA
 */
public class rev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f= new  JFrame();
        f.setTitle("My Pro");
        f.setSize(500, 600);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        
        JLabel name1 = new JLabel("Number-1");
        name1.setBounds(20,50,100,30);
        f.add(name1);

        JLabel name2 = new JLabel("Number-2");
        name2.setBounds(20,100,100,30);
        f.add(name2);
        
        JTextField num1 = new JTextField();
        num1.setBounds(120, 50, 100, 30);
        f.add(num1);
        
        JTextField num2 = new JTextField();
        num2.setBounds(120, 100, 100, 30);
        f.add(num2);
        
        JButton btn1 = new JButton("++");
        btn1.setBounds(120, 150, 100, 30);
        f.add(btn1);
        
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // طريقة واحد
               int a = Integer.parseInt(num1.getText());
               int a2 = Integer.parseInt(num2.getText());
               int sum = a+a2;
               JOptionPane.showMessageDialog(null, sum);
                // طريقة ثانية
/*              String fname = num1.getText();
                String lname = num2.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 + num2;
                JOptionPane.showMessageDialog(null, sum);
*/
            }
        });
        
        
        f.setVisible(true);
    }
    
}
