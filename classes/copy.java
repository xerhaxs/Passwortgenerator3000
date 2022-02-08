package classes;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.FlavorListener;
import java.awt.datatransfer.StringSelection;

public class copy {
    public static void kopieren() {
        System.out.println("Passwort: " + guidata.getPasswort());
        String passwort = guidata.getPasswort();
        StringSelection stringSelectionObj = new StringSelection(passwort);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);


    }

    public static void loeschen() {
        FlavorListener passwortclear = guidata.getPasswortasFlavor();
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.removeFlavorListener(passwortclear);
    }
}
