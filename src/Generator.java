import java.util.Random;

public class Generator {
    public static String generierePasswort(int passwortlaenge) {
        // Initalisierung & Deklarierung
        Guidata.setPasswort("");
        Random random = new Random();
        int int_random;
        int upperbound = 93;

        // Schleife zum generieren des Passwortes mit Auswahl von Zeichenarten
        do {
            int_random = random.nextInt(upperbound) + 33;
            if (Guidata.getKleinbuchstaben() == false && int_random >= 97 && int_random <= 122) {
                int_random = 0;
                passwortlaenge = passwortlaenge + 1;
            }
            if (Guidata.getGrossbuchstaben() == false && int_random >= 65 && int_random <= 90) {
                int_random = 0;
                passwortlaenge = passwortlaenge + 1;
            }
            if (Guidata.getZiffern() == false && int_random >= 48 && int_random <= 57) {
                int_random = 0;
                passwortlaenge = passwortlaenge + 1;
            }
            if (Guidata.getSonderzeichen() == false && ((int_random >= 33 && int_random <= 47) || (int_random >= 58 && int_random <= 64) || (int_random >= 91 && int_random <= 96) || (int_random >= 123 && int_random <= 126))) {
                int_random = 0;
                passwortlaenge = passwortlaenge + 1;
            }
            if (int_random != 0) {
                char value_char = (char) int_random;
                Guidata.setPasswort(String.valueOf(value_char) + Guidata.getPasswort());
            }
            passwortlaenge = passwortlaenge - 1;
        } while (passwortlaenge >= 1);
        // Ausgabe des Passwortes
        return Guidata.getPasswort();
    }
}
