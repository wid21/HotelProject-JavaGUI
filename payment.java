
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;



public class payment extends JFrame {

    private boolean payment_succssful;
    public payment(info data) {
        payment_succssful = false ;
        setTitle(" Wid's Hotel");
        setSize(1100, 690);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        //JPanel ppp = new JPanel();

       Icon ghh = new ImageIcon(getClass().getResource("ghh.jfif"));
        JLabel ph8 = new JLabel(ghh);
        add(ph8);

        Icon bbbug = new ImageIcon(getClass().getResource("bbbug.png"));
        JLabel ph9 = new JLabel(bbbug);
        add(ph9);

        JLabel c0 = new JLabel("PAYMENT ");
        c0.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 40));
        add(c0);

        JLabel card = new JLabel("Add Card");
        card.setFont(new java.awt.Font("Serif", Font.BOLD, 35));
        add(card);
        JLabel price = new JLabel(String.valueOf(data.getRoomPrice()));
        price.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 35));
        add(price);
        JLabel c1 = new JLabel("chose type of Card ");
        c1.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 25));
        add(c1);
        String[] cardt = {"MasterCard", "Visa", "APP", "Paypal"};
        JComboBox combo = new JComboBox(cardt);
        combo.setBounds(190, 90, 200, 110);
        combo.setPreferredSize(new Dimension(170, 150));
        Font newFont = new Font("Arial", Font.BOLD, 30);
        combo.setFont(newFont);
        combo.setForeground(Color.BLUE);
        combo.setBackground(Color.WHITE);
        add(combo);

        JLabel c = new JLabel("Enter the number for the Card xxxx xxxx xxxx xxxx");
        c.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 25));
        add(c);
        JTextField x1 = new JTextField(14);
        add(x1);


        JLabel c2 = new JLabel("Enter the Card code xxx");
        c2.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 25));
        add(c2);
        JTextField x2 = new JTextField(3);
        add(x2);

        JLabel c3 = new JLabel("Enter Expired year xxxx");
        c3.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 25));
        add(c3);
        JTextField x3 = new JTextField(4);
        add(x3);


        JButton bb = new JButton("Pay");
        add(bb);

        bb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bb) { //check the inputs
                    if (!x1.getText().matches("[0-9]{16}")) {
                        JOptionPane.showMessageDialog(null, "Invalid: number of card must be 16 numbers");
                    } else if (!x2.getText().matches("[0-9]{3}")) {
                        JOptionPane.showMessageDialog(null, "Invalid: code must be 3 numbers");
                    } else if (!x3.getText().matches("(20)((2)[0-9]|(30))")) {
                        JOptionPane.showMessageDialog(null, "Invalid: Expired date must be between 2020 to 2030 (year)");
                    } else {
                        payment_succssful = true ;
                        JOptionPane.showMessageDialog(null, "Successful pay thank you");
                    }


                }

            }
        });


        JButton b = new JButton("show my bill");
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {
                    if ( payment_succssful == true) {
                        data.setCardt(cardt[combo.getSelectedIndex()]);
                        data.setCardN(x1.getText());
                        data.setCode(x2.getText());
                        data.setCodeD(x3.getText());
                        int max = 300;
                        int min = 1;
                        int RoomNO = (int) (Math.random() * (max - min) + min);
                        data.setRoomNO(String.valueOf(RoomNO));
                        if (data.writeFile()) {
                            new Bill(data);

                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to Save your Reservation");

                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "you have to pay First");

                    }
                }
            }
        });
    }
}




