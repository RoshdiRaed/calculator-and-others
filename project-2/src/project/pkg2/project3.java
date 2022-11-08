
package project.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author TAIBA
 */
public class project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setSize(500, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
//        jf.setVisible(true);
        
        JCheckBox ch= new JCheckBox("JAVA", false);
        ch.setBounds(100, 200, 80, 30);
        jf.add(ch);
        
        JCheckBox ch2= new JCheckBox("PHP", false);
        ch2.setBounds(200, 200, 80, 30);
        jf.add(ch2);
        ch2.setVisible(true);
        
        
        JCheckBox ch3= new JCheckBox("JS", false);
        ch3.setBounds(300, 200, 80, 30);
        ch3.setVisible(true);
        jf.add(ch3);
        
        
        
        
        
        
        JLabel bar = new JLabel();
        bar.setText("العدد الأول");
        bar.setBounds(270, 40, 100, 30);
        jf.add(bar);
        
        
        JTextField tx = new JTextField();
        tx.setBounds(150, 40, 100, 30);
        jf.add(tx);
        
        JLabel roshdi = new JLabel();
        roshdi.setText("العدد الثاني");
        roshdi.setBounds(270, 80, 100, 30);
        jf.add(roshdi);
        
        JTextField tx2 = new JTextField();
        tx2.setBounds(150, 80, 100, 30);
        jf.add(tx2);
        
        jf.setVisible(true);
        
         

        
        JButton btn = new JButton();
        btn.setText("الطرح");
        btn.setBounds(100, 120, 100, 30);
        jf.add(btn);
        jf.setVisible(true);
        
        JButton btn2 = new JButton();
        btn2.setText("الجمع");
        btn2.setBounds(230, 120, 100, 30);
        jf.add(btn2);
        jf.setVisible(true);
        
        JButton btn3 = new JButton();
        btn3.setText("القسمة");
        btn3.setBounds(230, 160, 100, 30);
        jf.add(btn3);
        jf.setVisible(true);
        
        JButton btn4 = new JButton();
        btn4.setText("الضرب");
        btn4.setBounds(100, 160, 100, 30);
        jf.add(btn4);
        jf.setVisible(true);
        
        JButton btn5 = new JButton();
        btn5.setText("Print");
        btn5.setBounds(160, 300, 100, 30);
        jf.add(btn5);
        jf.setVisible(true);
      
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx.getText();
                String lname = tx2.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 - num2;
                JOptionPane.showMessageDialog(null, sum);
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx.getText();
                String lname = tx2.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 + num2;
                JOptionPane.showMessageDialog(null, sum);
            }
        });
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx.getText();
                String lname = tx2.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 / num2;
                JOptionPane.showMessageDialog(null, sum);
            }
        });
        
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String fname = tx.getText();
                String lname = tx2.getText();
                Double num1 = Double.parseDouble(fname);
                Double num2 = Double.parseDouble(lname);
                Double sum = num1 * num2;
                JOptionPane.showMessageDialog(null, sum);
            }
        });
        
        
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 String result = "";
                if (ch.isSelected()) {
                    
                JOptionPane.showMessageDialog(jf, ch.getText());
//                    result += "You select is " + ch;
                }
                
                if (ch2.isSelected()) {
                    JOptionPane.showMessageDialog(jf, ch2.getText() + " ");
//                    result += "You select is " + ch2;
                }
                
                if (ch3.isSelected()) {
                    JOptionPane.showMessageDialog(jf, ch3.getText() + " ");
//                    result += "You select is " + ch3;
                }
            }
        });
        
    }
    
}
