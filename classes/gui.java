package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    private JPanel panelMain;
    private JCheckBox grossbuchstabenCheckBox;
    private JCheckBox sonderzeichenCheckBox;
    private JCheckBox ziffernCheckBox;
    private JCheckBox kleinbuchstabenCheckBox;
    private JButton passwortKopierenButton;
    private JProgressBar progressBar1;
    private JTextField textField1;
    private JButton passwortGenerierenButton;


    public gui() {
        passwortGenerierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(passwortGenerierenButton, "Hello World");
            }
        });
        grossbuchstabenCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        kleinbuchstabenCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ziffernCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sonderzeichenCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        passwortKopierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("gui");
        frame.setContentPane(new gui().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
