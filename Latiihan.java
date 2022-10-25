import java.awt.event.*;
import javax.swing.*;


public class Latiihan extends JFrame {

    public Latiihan(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         
        JLabel labelInput = new JLabel("Nama : ");
        labelInput.setBounds(130,40,100,10);

        JLabel labelInput2 = new JLabel("Kelas Anda : ");
        labelInput2.setBounds(130,100,100,10);

        JLabel labelInput3 = new JLabel("Input Npm : ");
        labelInput3.setBounds(130,165,120,10);

        JTextField textField = new JTextField();
        textField.setBounds(130,60,150,30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(130,120,150,30);

        JTextField textField3 = new JTextField();
        textField3.setBounds(130,190,150,30);

        JButton button = new JButton("Klik");
        button.setBounds(130,230,100,40);

        JTextArea textOutput = new JTextArea("");
        textOutput.setBounds(130,300,260,100);

         button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                String nama = textField.getText();
                String kelas = textField2.getText();
                String npm = textField3.getText();
                textOutput.append("Nama Anda :  "+ nama + "\n" + "Kelas anda : "+ kelas  + "\n" + "Input Npm : " + npm);
                textField.setText("");
                textField2.setText("");
                textField3.setText("");

            }
         });

        this.add(button);
        this.add(textField);
        this.add(textField2);
        this.add(textField3);
        this.add(labelInput);
        this.add(labelInput2);
        this.add(labelInput3);
        this.add(textOutput);


         this.setSize(350,500);
         this.setLayout(null);
    }


        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                Latiihan l = new Latiihan();
                l.setVisible(true);
             }  
            });
        }
}
