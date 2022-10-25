import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloMessageDialog_2 extends JFrame {
    public HelloMessageDialog_2(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Klik");
        button.setBounds(130,100,100,40);
   
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                JOptionPane.showMessageDialog(HelloMessageDialog_2.this, "Error Message", "ERROR", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(HelloMessageDialog_2.this, "Information Message", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(HelloMessageDialog_2.this, "Warning Message", "WARNING", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(HelloMessageDialog_2.this, "Question Message", "QUESTION", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(HelloMessageDialog_2.this, "Plain Message", "PLAIN", JOptionPane.PLAIN_MESSAGE);

                int confirmation = JOptionPane.showConfirmDialog(HelloMessageDialog_2.this,"Apakah anda yakin ingin keluar dari aplikasi?", "komfirmasi", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirmation == JOptionPane.YES_NO_OPTION)
                {
                    System.exit(0);
                } else 
                {
                    JOptionPane.showMessageDialog(HelloMessageDialog_2.this, "Anda menekan tombol NO");
                }

              //   int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?");
	            // String name = JOptionPane.showInputDialog("What is your name?: ");
              
            }
        });
       
        this.add(button);
             
        this.setSize(200,200);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            HelloMessageDialog_2 h = new HelloMessageDialog_2();
            h.setVisible(true);
          }
        });
      }
    
}
