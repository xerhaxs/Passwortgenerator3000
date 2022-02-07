package classes;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class copy {
    public void kopieren() {
        System.out.println("Passwort: " + passwortJTextField.getText());

        String passwort = passwortJTextField.getText();
        StringSelection stringSelectionObj = new StringSelection(passwort);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);
    }

    public void loeschen() {

    }
}
