package passwortgenerator3000.classes.gui;

import javax.swing.*;
import java.awt.event.*;

public class guierror_passwortlaenge extends JDialog {
    // Initalisieren & Deklarieren
    public JPanel contentPane;
    private JButton buttonOK;
    private JTextPane Passwortlaenge_Error;

    public guierror_passwortlaenge() {
        // Fenster mit Button erzeugen
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        // Ok-Button
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        dispose();
    }
}
