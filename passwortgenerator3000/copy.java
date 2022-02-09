package passwortgenerator3000;

import java.awt.*;
import java.awt.datatransfer.*;

public class copy {
    // Kopierfunktion Zwischenablage
    public static void kopieren() {
        System.out.println("Passwort: " + guidata.getPasswort());
        String passwort = guidata.getPasswort();
        StringSelection stringSelectionObj = new StringSelection(passwort);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);
    }

    // Löschfunktion Zwischenablage
    public static void loeschen() {
        StringSelection stringSelectionObj = new StringSelection(null);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);
    }
}
