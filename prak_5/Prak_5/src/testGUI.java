import javax.swing.*;
import java.awt.*;

public class testGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(300, 200));
        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("buttun 2");
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
