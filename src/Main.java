package src;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Management");
            frame.setJMenuBar(new Menu(frame).get());
            frame.setSize(500, 350);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);   // center on screen
            frame.setVisible(true);
        });
    }
}
