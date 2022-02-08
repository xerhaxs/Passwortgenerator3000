package classes;

import javax.swing.*;

// Programm Ausführen
public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Passwortgenerator3000");
        frame.setContentPane(new gui().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.pack();
        frame.setVisible(true);
    }
}
