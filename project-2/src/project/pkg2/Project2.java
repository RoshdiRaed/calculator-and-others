
package project.pkg2;

//import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Project2 {
    
    public static void main(String[] args) {
        JFrame s = new JFrame();
        s.setTitle("My Project");
        s.setSize(500, 500);
        s.setLayout(null);
        s.setVisible(false);
        
        
        JLabel bar = new JLabel();
        bar.setText("Name");
        bar.setBounds(30, 20, 120, 30);
        s.add(bar);
        
        JLabel bar2 = new JLabel();
        bar2.setText("Name 2");
        bar2.setBounds(30, 80, 120, 30);
        s.add(bar2);
        
        
//        JLabel bar3 = new JLabel();
//        bar3.setText("Name-3");
//        bar3.setBounds(30, 120, 120, 30);
//        s.add(bar3);
        
        JTextField txt = new JTextField();
        txt.setBounds(100, 20, 120, 40);
        s.add(txt);
//        bar.add(bar2);

        JTextField txt2 = new JTextField();
        txt2.setBounds(100, 80, 120, 40);
        s.add(txt2);
        s.add(bar);

        
        JButton btn = new JButton("Click");
        btn.setBounds(120, 130, 80, 40);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String name = txt.getText();
                String name2 = txt2.getText();
                JOptionPane.showMessageDialog(null, name + " " + name2);
            }
        });
        
        
        s.add(btn);
        s.setVisible(true);
        
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
