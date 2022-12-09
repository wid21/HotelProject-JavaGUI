import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class reservation  extends JFrame {
    JPanel p1 = new JPanel(new GridLayout(4, 1));
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel(new BorderLayout());
    JButton b1 = new JButton("Booking");
    JButton b2 = new JButton("Back");

    public reservation( info data ) {

        setTitle("Wid's Hotel ");
        setSize(1600, 690);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        //create photo
        JPanel p;
        p = new JPanel(new GridLayout(2, 2, 5, 5));
        ImageIcon bug = new ImageIcon(getClass().getResource("bug.jfif"));
        JButton photo = new JButton(bug);
        p.add(photo);

        ImageIcon bug1 = new ImageIcon(getClass().getResource("b1.jfif"));
        JButton photo1 = new JButton(bug1);
        p.add(photo1);

        ImageIcon bug2 = new ImageIcon(getClass().getResource("bug2.jfif"));
        JButton photo2 = new JButton(bug2);
        p.add(photo2);
        ImageIcon bug3 = new ImageIcon(getClass().getResource("bug3.jfif"));
        JButton photo3 = new JButton(bug3);
        p.add(photo3);

        add(p);
        //create label
        JLabel welcome = new JLabel("welcome " +data.getName());
        add(welcome);
        JLabel l1 = new JLabel("Select type of Room Reservation :");
        l1.setFont(new Font("Serif", Font.BOLD, 50));
        p2.add(l1);
        JLabel l2 = new JLabel("");
        JLabel l3 = new JLabel("");
        JLabel l4 = new JLabel("");
        JLabel l5 = new JLabel("");
        l2.setFont(new Font("Serif", Font.BOLD, 17));  // Edit font
        l2.setForeground(Color.BLUE);
        l3.setFont(new Font("Serif", Font.BOLD, 17));
        l3.setForeground(Color.black);
        l4.setFont(new Font("Serif", Font.BOLD, 17));
        l4.setForeground(Color.BLUE);
        l5.setFont(new Font("Serif", Font.BOLD, 17));
        l5.setForeground(Color.black);

        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p3.add(b1);
        p3.add(b2);
        p4.add(p2, BorderLayout.NORTH);
        p4.add(p1, BorderLayout.CENTER);
        p4.add(p3, BorderLayout.SOUTH);
        add(p4);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1)
                    new date(data);

            }
        });


        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2)
                    new Welcome(data);

            }
        });


        photo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == photo)
                    l2.setText("1Bedroom and bathroom and only one free meal for 1person in our Buffeh " +
                            "also you can get a WIFI and barking all these with 300SR");
                data.setRoomType("Room");
                data.setRoomPrice(300);
            }
        });


        photo1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == photo1) {
                    l3.setText("1Bedroom and 1Leaving Room and bathroom also you can get 2meals for 3persons" +
                            "in our Buffeh also you can get a WIFI and barking these with 500SR");
                    data.setRoomType("Room&lounge");
                    data.setRoomPrice(500);

                }
            }
        });


        photo2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == photo2) {
                    l4.setText("2Rooms and one Lounge and 2Bathrooms,one kitchen assistant and get 3meals for 4persons in our Buffeh" +
                            "also you can get a WIFI and barking these with 750SR");
                    data.setRoomType("suite");
                    data.setRoomPrice(750);
                }
            }
        });

        photo3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == photo3) {
                    l5.setText("3Rooms and one Lounge and 2Bathrooms,one kitchen assistant you will get3 meals for 5persons" +
                            "our Buffeh also you can get a WIFI and barking also your own Driver al these with 950SR");
                    data.setRoomType("VIP suite");
                    data.setRoomPrice(950);
                }

            }
        });

    }
}