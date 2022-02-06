package classes;

import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import javax.swing.*;
import java.awt.event.*;

public class gui {
    public JPanel panelMain;
    private JSlider passwortJSlider;
    private JTextField passwortJTextField;
    private JButton passwortKopierenButton;
    private JProgressBar zwischenspeichercountdownProgressBar;
    private JCheckBox grossbuchstabenCheckBox;
    private JCheckBox sonderzeichenCheckBox;
    private JCheckBox ziffernCheckBox;
    private JCheckBox kleinbuchstabenCheckBox;
    private JButton passwortGenerierenButton;
    private JFormattedTextField passwortausgabe;
    private JFormattedTextField passwortlaengeJTextField;


    public gui() {
        grossbuchstabenCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Grossbuchstaben aktiviert");
                    generator.setGrossbuchstaben(true);
                } else {
                    System.out.println("Grossbuchstaben deaktiviert");
                    generator.setGrossbuchstaben(false);
                }
            }
        });

        kleinbuchstabenCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Kleinbuchstaben aktiviert");
                    generator.setKleinbuchstaben(true);
                } else {
                    System.out.println("Kleinbuchstaben deaktiviert");
                    generator.setKleinbuchstaben(false);
                }
            }
        });

        ziffernCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Ziffern aktiviert");
                    generator.setZiffern(true);
                } else {
                    System.out.println("Ziffern deaktiviert");
                    generator.setZiffern(false);
                }
            }
        });

        sonderzeichenCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Sonderzeichen aktiviert");
                    generator.setSonderzeichen(true);
                } else {
                    System.out.println("Sonderzeichen deaktiviert");
                    generator.setSonderzeichen(false);
                }
            }
        });

        passwortGenerierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwortJTextField.setText(generator.generierePasswort(Integer.parseInt(passwortlaengeJTextField.getText())));
                System.out.println("Passwort generiert");

            }
        });

        passwortKopierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Passwort kopiert");
                System.out.println("Passwort: " + passwortJTextField.getText());
            }
        });
    }

}
