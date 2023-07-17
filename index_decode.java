import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index_decode {

    public static void main(String[] args) {

        JFrame f = new JFrame("Steganography Decode");

        JButton b = new JButton("Submit");

        JTextField tf1 = new JTextField();

        JLabel l1 = new JLabel("Enter location of the Encrypted image");

        l1.setBounds(30,40,425,25);

        tf1.setBounds(30,70, 425,25);

        b.setBounds(185,150,100,30);

        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CP3.Decode.STEGIMAGEFILE = tf1.getText();

                try {
                    CP3.Decode.LSB_decode();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                try {
                    CP1.AES.AES_Decode();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }


                JFrame  f2 =new JFrame();

                JOptionPane.showMessageDialog(f2,"Data Decrypted successfully");

                f.dispose();



            }
        });

        f.add(tf1);

        f.add(l1);

        f.setSize(500,250);

        f.setLayout(null);

        f.setVisible(true);


    }
}