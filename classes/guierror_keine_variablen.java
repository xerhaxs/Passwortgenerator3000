package classes;

import javax.swing.*;
import java.awt.event.*;

public class guierror_keine_variablen extends JDialog {
    public JPanel contentPane;
    private JButton buttonOK;
    private JTextPane esMussMindestensEineTextPane;

    public guierror_keine_variablen() {
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
