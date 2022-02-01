package classes;
import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Passwortgenerator3000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JCheckBox checkbox1 = new JCheckBox("Buchstaben");
        JButton buttongen1 = new JButton("Passwort generieren");
        frame.getContentPane().add(checkbox1);
        checkbox1.
        frame.getContentPane().add(buttongen1);
        frame.setVisible(true);
    }
}