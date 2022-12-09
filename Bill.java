import javax.swing.*;
import java.awt.*;
public class Bill extends JFrame{
public  Bill(info data) {


    setTitle("Wid's Hotel ");
    setSize(1600, 690);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
   // setLayout(new GridLayout(9, 1, 5, 5));
    setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));

    String[] booking = data.ReadFile();
    JLabel name = new JLabel("Name:  " + booking[0]);
    JLabel id = new JLabel("ID:    " + booking[1]);
    JLabel phone = new JLabel("phone:  " + booking[2]);
    JLabel email = new JLabel("email:  " + booking[3]);
    JLabel roomtype = new JLabel("Type of Room :  " + booking[4]);
    JLabel RoomNO = new JLabel("Room Number: " + booking[5]);
    JLabel roomprice = new JLabel("price:  " + booking[6]);
    JLabel boD = new JLabel("Booking Date  :  " + booking[7]);
    JLabel bot = new JLabel("Booking time is :  " +booking[8]);
    add(name );
    add(id);
    add(phone);
    add(email);
    add(roomprice);
    add(RoomNO);
    add(roomtype);
    add(boD);
    add(bot);

    ImageIcon code = new ImageIcon(getClass().getResource("code.png"));
    JLabel label = new JLabel(code);
   add(label);
}
}
