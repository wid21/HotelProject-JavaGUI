import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class date extends JFrame {

    public date(info data) {


        setTitle("Wid's Hotel ");
        setSize(1100, 690);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));



        JLabel label = new JLabel("Select the Date and Time :");
        label.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 30));
        add(label);
        String[] items = {"January", "February", "March", "April", "May", "June", "July", "August", "September", " October", "November", "December"};
        JComboBox comboBox = new JComboBox(items);

        comboBox.setPreferredSize(new Dimension(180, 170));
        Font newFont = new Font("Arial", Font.BOLD, 45);
        comboBox.setFont(newFont);
        comboBox.setForeground(Color.PINK);
        comboBox.setBackground(Color.WHITE);
        add(comboBox);

        String[] item = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" +
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        JComboBox comboBo = new JComboBox(item);

        comboBox.setPreferredSize(new Dimension(180, 170));
        Font neFont = new Font("Arial", Font.BOLD, 45);
        comboBo.setFont(neFont);
        comboBo.setForeground(Color.PINK);
        comboBo.setBackground(Color.WHITE);
        add(comboBo);


        String[] ite = {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
        JComboBox comboBox2 = new JComboBox(ite);

        comboBox.setPreferredSize(new Dimension(180, 170));
        Font newFo = new Font("Arial", Font.BOLD, 45);
        comboBox2.setFont(newFo);
        comboBox2.setForeground(Color.PINK);
        comboBox2.setBackground(Color.WHITE);
        add(comboBox2);

        String[] it = {"00:00", "01:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00",
                "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00"};
        JComboBox comboB = new JComboBox(it);

        comboBox.setPreferredSize(new Dimension(180, 170));
        Font neFon = new Font("Arial", Font.BOLD, 45);
        comboB.setFont(neFon);
        comboB.setForeground(Color.PINK);
        comboB.setBackground(Color.WHITE);
        add(comboB);

        JButton pay = new JButton("Go to PAy ");
        add(pay);

        JButton back = new JButton("Back ");
        add(back);

        pay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == pay)
                    data.setBookingDate(item[comboBo.getSelectedIndex()] + "-" + items[comboBox.getSelectedIndex()] + "-" + ite[comboBox2.getSelectedIndex()]);
                    data.setBookingtime(it[comboB.getSelectedIndex()]);
                    new payment(data);

            }
        });
       back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == back)
                    new reservation(data);

            }
        });
    }
}
