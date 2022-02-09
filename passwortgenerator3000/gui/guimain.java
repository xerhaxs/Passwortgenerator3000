package passwortgenerator3000.gui;
import passwortgenerator3000.*;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Timer;
import java.util.TimerTask;

public class guimain {
    // Initalisieren & Deklarieren
    public JPanel panelMain;
    private JSlider passwortJSlider;
    private JTextField passwortJTextField;
    private JButton passwortKopierenButton;
    private  JProgressBar zwischenspeichercountdownProgressBar;
    private JCheckBox grossbuchstabenCheckBox;
    private JCheckBox sonderzeichenCheckBox;
    private JCheckBox ziffernCheckBox;
    private JCheckBox kleinbuchstabenCheckBox;
    private JButton passwortGenerierenButton;
    private JFormattedTextField passwortlaengeJTextField;

    public guimain() {
        // Funktion der Grossbuchstaben-Check-Box
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

        // Funktion der Kleinbuchstaben-Check-Box
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

        // Funktion der Ziffern-Check-Box
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

        // Funktion der Sonderzeichen-Check-Box
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

        // Passwort generiern lassen
        passwortGenerierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Idiotensicherung -> Fals keine Zeichenarte ausgewählt
                if (guidata.getGrossbuchstaben() == false && guidata.getKleinbuchstaben() == false && guidata.getZiffern() == false && guidata.getSonderzeichen() == false) {
                    System.out.println("Passwortgeneration fehlgeschlagen. Generatorvariablen nicht deffiniert.");
                    guierror_keine_variablen dialog = new guierror_keine_variablen();
                    dialog.pack();
                    dialog.setVisible(true);
                    // Idiotensicherung -> Keine Passwortlänge bzw. unsichere Passwortlänge
                } else if (!passwortlaengeJTextField.getText().matches("[0-9]+") || !((Integer.parseInt(passwortlaengeJTextField.getText())) > 7)) {
                    System.out.println("Passwortgeneration fehlgeschlagen. Passwortlaenge nicht deffiniert oder zu kurz.");
                    guierror_passwortlaenge dialog = new guierror_passwortlaenge();
                    dialog.pack();
                    dialog.setVisible(true);
                    // Passwort generieren & ausgeben
                } else {
                    passwortJTextField.setText(generator.generierePasswort(Integer.parseInt(passwortlaengeJTextField.getText())));
                    guidata.setPasswort(passwortJTextField.getText());
                    System.out.println("Passwort generiert");
                }
            }
        });

        // Passwort in Zwischenablage kopieren
        passwortKopierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Passwort kopiert");
                copy.kopieren();
                guidata.setTimer(10);
                zwischenspeichercountdownProgressBar.setValue(10);
                java.util.Timer timer = new Timer();
                // Timer um Passwort nach 10 Sekunden aus der Zwischenablage zu löschen
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (guidata.getTimer() > 0) {
                            guidata.setTimer(guidata.getTimer() - 1);
                            zwischenspeichercountdownProgressBar.setValue(zwischenspeichercountdownProgressBar.getValue() - 1);
                            System.out.println("Zwischenablage wird geleert in: " + guidata.getTimer());
                        } else {
                            copy.loeschen();
                            timer.cancel();
                        }
                    }
                }, 0, 1000);
            }
        });

        // Passwortslider um Passwortlänge einzustellen
        passwortJSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (!(passwortlaengeJTextField.getText().matches("[0-9]+")) || passwortJSlider.getValue() != (Integer.parseInt(passwortlaengeJTextField.getText()))) {
                    passwortlaengeJTextField.setText(String.valueOf(passwortJSlider.getValue()));
                    System.out.println("Passwortlaenge geaendert zu " + passwortlaengeJTextField.getText());
                }
            }
        });

        // Passwortlängentextfeld um über Zahlen die Passwortlänge einzustellen bzw. ausgabe der Passwortslidereinstellung
        passwortlaengeJTextField.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (passwortlaengeJTextField.getText().matches("[0-9]+") && (Integer.parseInt(passwortlaengeJTextField.getText())) != passwortJSlider.getValue()) {
                    passwortJSlider.setValue(Integer.parseInt(passwortlaengeJTextField.getText()));
                    System.out.println("Passwortlaenge geaendert zu " + passwortlaengeJTextField.getText());
                }
            }
        });
    }
}
