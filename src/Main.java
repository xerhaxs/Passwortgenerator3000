import javax.swing.*;

// Programm Ausführen
public class Main {
    public static void main(String[] args) {
        // Programmfenster initalisieren, deklarieren & anzeigen
        JFrame frame = new JFrame("Passwortgenerator3000");
        frame.setContentPane(new GuiMain().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.pack();
        frame.setVisible(true);
    }
}
