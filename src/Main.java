package src;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import src.components.Menu;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Management System");
            frame.setBackground(Color.GREEN);
            frame.setForeground(Color.red);
            Image frameIcon = Toolkit.getDefaultToolkit().getImage("src/assets/images/icon.png");

            JPanel container = new JPanel();
        container.setLayout(new FlowLayout());
        container.setBackground(Color.LIGHT_GRAY);
        container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 

        // Add components to the container
        container.add(new JLabel("Name:"));
        container.add(new JTextField(15));
        container.add(new JButton("Submit"));

        frame.add(container);

            frame.setIconImage(frameIcon);
            frame.setJMenuBar(new Menu(frame).get());
            frame.setSize(800, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null); // center on screen
            frame.setVisible(true);
        });
    }
}
