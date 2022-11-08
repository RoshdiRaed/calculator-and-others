package project.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class project4 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle ("Roshdi-Clac");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
        jf.setVisible(false);
        
        JLabel bar = new JLabel();
        bar.setText("عملية الجمع :");
        bar.setBounds(400, 40, 100, 30);
        jf.add(bar);
        
        JLabel bar2 = new JLabel();
        bar2.setText("عملية الضرب :");
        bar2.setBounds(400, 80, 100, 30);
        jf.add(bar2);
        
        JLabel bar3 = new JLabel();
        bar3.setText("عملية القسمة :");
        bar3.setBounds(400, 120, 100, 30);
        jf.add(bar3);
        
        JLabel bar4 = new JLabel();
        bar4.setText("باقي القسمة :");
        bar4.setBounds(400, 160, 100, 30);
        jf.add(bar4);
        
        
        JTextField tx = new JTextField();
        tx.setBounds(290, 40, 100, 30);
        jf.add(tx);
        
        JTextField tx2 = new JTextField();
        tx2.setBounds(180, 40, 100, 30);
        jf.add(tx2);
        
        JTextField tx3 = new JTextField();
        tx3.setBounds(290, 80, 100, 30);
        jf.add(tx3);
        
        JTextField tx4 = new JTextField();
        tx4.setBounds(180, 80, 100, 30);
        jf.add(tx4);
        
        JTextField tx5 = new JTextField();
        tx5.setBounds(290, 120, 100, 30);
        jf.add(tx5);
        
        JTextField tx6 = new JTextField();
        tx6.setBounds(180, 120, 100, 30);
        jf.add(tx6);
        
        JTextField tx7 = new JTextField();
        tx7.setBounds(290, 160, 100, 30);
        jf.add(tx7);
        
        JTextField tx8 = new JTextField();
        tx8.setBounds(180, 160, 100, 30);
        jf.add(tx8);
        
        
        JButton btn = new JButton();
        btn.setText("+ +");
        btn.setBounds(60, 40, 100, 30);
        jf.add(btn);
        jf.setVisible(true);
        
        JButton btn2 = new JButton();
        btn2.setText("* *");
        btn2.setBounds(60, 80, 100, 30);
        jf.add(btn2);
        jf.setVisible(true);
//        
        JButton btn3 = new JButton();
        btn3.setText("/ /");
        btn3.setBounds(60, 120, 100, 30);
        jf.add(btn3);
        jf.setVisible(true);
        
        JButton btn4 = new JButton();
        btn4.setText("% %");
        btn4.setBounds(60, 160, 100, 30);
        jf.add(btn4);
        jf.setVisible(true);
      
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx.getText();
                String lname = tx2.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 + num2;
                JOptionPane.showMessageDialog(null, sum);
                
//                int a = Integer.parseInt(num3.getText());
//               int a2 = Integer.parseInt(num4.getText());
//               int sum2 = a+a2;
//               JOptionPane.showMessageDialog(null, sum2);
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx3.getText();
                String lname = tx4.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 * num2;
                JOptionPane.showMessageDialog(null, sum);
            }
        });
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx5.getText();
                String lname = tx6.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 / num2;
                JOptionPane.showMessageDialog(null, sum);
            }
        });
        
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx7.getText();
                String lname = tx8.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 % num2;
                
                JOptionPane.showMessageDialog(null, sum);
                
            }
            
        });
        
    }
    
}
