package classes;

import javax.swing.*;
import java.awt.event.*;

public class guierror_passwortlaenge extends JDialog {
    public JPanel contentPane;
    private JButton buttonOK;
    private JTextPane diePasswortlaengeIstNichtTextPane;

    public guierror_passwortlaenge() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

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
