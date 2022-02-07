package classes;

public class guidata {
    // Grossbuchstaben Wert
    private static boolean zGrossbuchstaben;
    public static void setGrossbuchstaben(boolean pGrossbuchstaben) {
        zGrossbuchstaben = pGrossbuchstaben;
    }
    public static boolean getzGrossbuchstaben() {
        return zGrossbuchstaben;
    }

    // Kleinbuchstaben Wert
    private static boolean zKleinbuchstaben;
    public static void setKleinbuchstaben(boolean pKleinbuchstaben) {
        zKleinbuchstaben = pKleinbuchstaben;
    }
    public boolean getzKleinbuchstaben() {
        return zKleinbuchstaben;
    }

    // Ziffern Wert
    private static boolean zZiffern;
    public static void setZiffern(boolean pZiffern) {
        zZiffern = pZiffern;
    }
    public boolean getzZiffern() {
        return zZiffern;
    }

    // Sonderzeichen Wert
    private static boolean zSonderzeichen;
    public static void setSonderzeichen(boolean pSonderzeichen) {
        zSonderzeichen = pSonderzeichen;
    }
    public boolean getzSonderzeichen() {
        return zSonderzeichen;
    }

    // Passwortlaenge Wert
    private static int zPasswortlaenge;
    public static void setPasswortlaenge(int pPasswortlaenge) {
        zPasswortlaenge = pPasswortlaenge;
    }
    public int getzPasswortlaenge() {
        return zPasswortlaenge;
    }

    // Passwort
    String passwort;
    public static void setPasswort(string pPasswort) { zPasswort = pPasswort; }

    public String getPasswort() {
        return zPasswort;
    }
}
