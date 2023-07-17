import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class index_encode  {

    public static void main(String[] args) {

        JFrame f = new JFrame("Steganography Encode");

        JButton b = new JButton("Submit");

        JTextField tf1 = new JTextField();

        JTextField tf2 = new JTextField();

        JLabel l1 = new JLabel("Enter the message to encode");

        JLabel l2 = new JLabel("Enter location of the cover image");


        l1.setBounds(30,40,425,25);

        tf1.setBounds(30,70, 425,25);

        l2.setBounds(30,120,425,25);

        tf2.setBounds(30,150, 425,25);


        b.setBounds(185,210,100,30);

        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usermsg = tf1.getText();

                try {
                    CP1.AES.AES_Encode(usermsg);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                CP2.Encode.COVERIMAGEFILE = tf2.getText();

                try {
                    CP2.Encode.LSB_encode();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                JFrame  f2 =new JFrame();

                 JOptionPane.showMessageDialog(f2,"Data Encrypted successfully");

                 f.dispose();

            }
        });

        f.add(tf1);

        f.add(l1);

        f.add(tf2);

        f.add(l2);

        f.setSize(500,300);

        f.setLayout(null);

        f.setVisible(true);



    }


}