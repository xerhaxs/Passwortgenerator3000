import javax.swing.*;
import java.awt.event.*;

public class GuiErrorZeichen extends JDialog {
    // Initalisieren & Deklarieren
    public JPanel contentPane;
    private JButton buttonOK;
    private JTextPane Zeichenart_Error;

    public GuiErrorZeichen() {
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
