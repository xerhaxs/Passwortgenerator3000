import javax.swing.*;
import java.awt.event.*;

public class GuiErrorPasswortlaenge extends JDialog {
    // Initalisieren & Deklarieren
    public JPanel contentPane;
    private JButton buttonOK;
    private JTextPane Passwortlaenge_Error;

    public GuiErrorPasswortlaenge() {
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
