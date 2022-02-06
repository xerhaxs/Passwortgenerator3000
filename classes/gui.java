package classes;
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
                    guidata.setGrossbuchstaben(true);
                } else {
                    System.out.println("Grossbuchstaben deaktiviert");
                    guidata.setGrossbuchstaben(false);
                }
            }
        });

        kleinbuchstabenCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Kleinbuchstaben aktiviert");
                    guidata.setKleinbuchstaben(true);
                } else {
                    System.out.println("Kleinbuchstaben deaktiviert");
                    guidata.setKleinbuchstaben(false);
                }
            }
        });

        ziffernCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Ziffern aktiviert");
                    guidata.setZiffern(true);
                } else {
                    System.out.println("Ziffern deaktiviert");
                    guidata.setZiffern(false);
                }
            }
        });

        sonderzeichenCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Sonderzeichen aktiviert");
                    guidata.setSonderzeichen(true);
                } else {
                    System.out.println("Sonderzeichen deaktiviert");
                    guidata.setSonderzeichen(false);
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
