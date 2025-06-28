package src.components;

import javax.swing.*;

public class Menu {
    private final JMenuBar menuBar;

    public Menu(JFrame frame) {
        menuBar = new JMenuBar();

        JMenu file   = new JMenu("File");
        JMenu edit   = new JMenu("Edit");
        JMenu window = new JMenu("Window");

        JMenuItem open  = new JMenuItem("Open");
        JMenuItem save  = new JMenuItem("Save");
        JMenuItem exit  = new JMenuItem("Exit");

        exit.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(
                    frame,
                    "Exit the program?",
                    "Confirm Exit",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) frame.dispose();
        });

        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(window);
    }

    public JMenuBar get() {
        return menuBar;
    }
}
