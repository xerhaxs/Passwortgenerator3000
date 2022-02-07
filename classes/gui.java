package classes;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

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
                if (guidata.getGrossbuchstaben() == false && guidata.getKleinbuchstaben() == false && guidata.getZiffern() == false && guidata.getSonderzeichen() == false) {
                    System.out.println("Passwortgeneration fehlgeschlagen. Generatorvariablen nicht deffiniert.");
                    guierror_keine_variablen dialog = new guierror_keine_variablen();
                    dialog.pack();
                    dialog.setVisible(true);
                } else if (!passwortlaengeJTextField.getText().matches("[0-9]+") || !((Integer.parseInt(passwortlaengeJTextField.getText())) > 7)) {
                    System.out.println("Passwortgeneration fehlgeschlagen. Passwortlaenge nicht deffiniert oder zu kurz.");
                    guierror_passwortlaenge dialog = new guierror_passwortlaenge();
                    dialog.pack();
                    dialog.setVisible(true);
                } else {

                    passwortJTextField.setText(generator.generierePasswort(Integer.parseInt(passwortlaengeJTextField.getText())));
                    guidata.setPasswort(passwortJTextField.getText());
                    System.out.println("Passwort generiert");
                }
            }
        });

        passwortKopierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Passwort kopiert");
                copy.kopieren();
            }
        });

        passwortJSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (passwortJSlider.getValue() != (Integer.parseInt(passwortlaengeJTextField.getText()))) {
                    passwortlaengeJTextField.setText(String.valueOf(passwortJSlider.getValue()));
                }
            }
        });

       // passwortlaengeJTextField.addCaretListener(new CaretListener() {
       //     @Override
       //     public void caretUpdate(CaretEvent e) {
       //         if (passwortlaengeJTextField.getText().matches("[0-9]+") && (Integer.parseInt(passwortlaengeJTextField.getText())) != passwortJSlider.getValue()) {
       //             passwortJSlider.setValue(Integer.parseInt(passwortlaengeJTextField.getText()));
       //         }
       //     }
       // });

        //passwortlaengeJTextField.addPropertyChangeListener(new PropertyChangeListener() {
        //    @Override
        //    public void propertyChange(PropertyChangeEvent evt) {
        //        if (passwortlaengeJTextField.getText().matches("[0-9]+") && (Integer.parseInt(passwortlaengeJTextField.getText())) != passwortJSlider.getValue()) {
        //            passwortJSlider.setValue(Integer.parseInt(passwortlaengeJTextField.getText()));
        //        }
        //    }
        //});
        
    }
}
