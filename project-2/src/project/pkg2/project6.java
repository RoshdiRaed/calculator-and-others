
package project.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class project6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle ("TextArea");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
        
        JTextArea comment = new JTextArea();
        JScrollPane jsp = new JScrollPane(comment);
        jsp.setBounds(100, 80, 200, 150);
        jf.add(jsp);
////        comment.setText("Welcome");
//        comment.setText("Hi ");  // Tack the last one
//        comment.append("New Append"); // to tack the new string text 
//        comment.setLineWrap(true);
//        for(int i = 1;i <6;i++){
//            comment.append("\n" + i);
//        };
        
        JRadioButton RABU = new JRadioButton("Male", true);
        JRadioButton RABU2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(RABU);
        bg.add(RABU2);
        RABU.setBounds(50, 240, 100, 30);
        RABU2.setBounds(160, 240, 100, 30);
        jf.add(RABU);
        jf.add(RABU2);
        
        JButton btn = new JButton("Select");
        btn.setBounds(50, 280, 80, 40);
        jf.add(btn);
        
        
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                comment.getText();
                
                if (RABU.isSelected()) {
//                    comment.append("\n" + RABU.getText());
                    JOptionPane.showMessageDialog(null,comment.getText() + "\n" + RABU.getText());
                }else{
//                comment.append("\n" + RABU2.getText());
                    JOptionPane.showMessageDialog(null, comment.getText()+ "\n" + RABU2.getText());
                }
            }
        });
        
        


//        jf.add(comment);
        jf.setVisible(true);
    }
    
}
