
package project.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jdk.nashorn.internal.scripts.JS;

public class project5 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle ("JCheckBox");
        jf.setSize(500, 450);
        jf.setDefaultCloseOperation(3);
        JLabel lb = new JLabel("Language");
        lb.setBounds(30, 30, 100, 30);
        jf.add(lb);
        jf.setLayout(null);
        JCheckBox c = new JCheckBox("JAVA", true);
        JCheckBox c2 = new JCheckBox("PHP");
        JCheckBox c3 = new JCheckBox("JS");
        c.setBounds(50, 70, 80, 30);
        c2.setBounds(140, 70, 80, 30);
        c3.setBounds(230, 70, 80, 30);
        
        jf.add(c);
        jf.add(c2);
        jf.add(c3);
        
        JTextArea res = new JTextArea();
        res.setBounds(50, 100, 200, 80);
        jf.add(res);
        
        
        jf.setVisible(true);
//        jf.setLayout(null);
//        jf.setVisible(false);
        
        JButton b = new JButton("Select");
        b.setBounds(120, 200, 80, 40);
        jf.add(b);
        b.setVisible(true);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
            if(c.isSelected()){
            result += "You select Java \n";
            }
            if(c2.isSelected()){
            result += "You select PHP \n";
            }
            if(c3.isSelected()){
            result += "You select JS \n";
            }
//            res.setText(result);
            
            JOptionPane.showMessageDialog(null, result + res.getText());
            }
        });
        

           }
    
}
