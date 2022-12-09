import javax.swing.*;

public class HOTEL {

    public static void main(String[] args) {
        info data = new info();
        Welcome j = new Welcome(data);
        j.setTitle("Wid's Hotel");
        j.setSize(1100, 690);
        j.setExtendedState(JFrame.MAXIMIZED_BOTH);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);

    }
}






