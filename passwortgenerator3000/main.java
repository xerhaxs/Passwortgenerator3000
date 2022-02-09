package passwortgenerator3000;

import passwortgenerator3000.classes.gui.guimain;

import javax.swing.*;

// Programm Ausführen
public class main {
    public static void main(String[] args) {
        // Programmfenster initalisieren, deklarieren & anzeigen
        JFrame frame = new JFrame("Passwortgenerator3000");
        frame.setContentPane(new guimain().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.pack();
        frame.setVisible(true);
    }
}
