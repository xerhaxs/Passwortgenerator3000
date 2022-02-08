package classes;

import java.awt.*;
import java.awt.datatransfer.*;

public class copy {
    public static void kopieren() {
        System.out.println("Passwort: " + guidata.getPasswort());
        String passwort = guidata.getPasswort();
        StringSelection stringSelectionObj = new StringSelection(passwort);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);
    }

    public static void loeschen() {
        StringSelection stringSelectionObj = new StringSelection(null);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);
    }
}
