public class Guidata {
    // Geter-Seter-Helperclass
    // Zur sinnvollen und sicheren Verwenung von Werten und Daten über mehrere Klassen

    // Grossbuchstaben Wert
    private static boolean zGrossbuchstaben;
    public static void setGrossbuchstaben(boolean pGrossbuchstaben) {
        zGrossbuchstaben = pGrossbuchstaben;
    }
    public static boolean getGrossbuchstaben() {
        return zGrossbuchstaben;
    }

    // Kleinbuchstaben Wert
    private static boolean zKleinbuchstaben;
    public static void setKleinbuchstaben(boolean pKleinbuchstaben) {
        zKleinbuchstaben = pKleinbuchstaben;
    }
    public static boolean getKleinbuchstaben() {
        return zKleinbuchstaben;
    }

    // Ziffern Wert
    private static boolean zZiffern;
    public static void setZiffern(boolean pZiffern) {
        zZiffern = pZiffern;
    }
    public static boolean getZiffern() {
        return zZiffern;
    }

    // Sonderzeichen Wert
    private static boolean zSonderzeichen;
    public static void setSonderzeichen(boolean pSonderzeichen) {
        zSonderzeichen = pSonderzeichen;
    }
    public static boolean getSonderzeichen() {
        return zSonderzeichen;
    }

    // Passwortlaenge Wert
    private static int zPasswortlaenge;
    public static void setPasswortlaenge(int pPasswortlaenge) {
        zPasswortlaenge = pPasswortlaenge;
    }
    public static int getPasswortlaenge() {
        return zPasswortlaenge;
    }

    // Timercountdown
    private static int zTimer;
    public static void setTimer(int pTimer) {
        zTimer = pTimer;
    }
    public static int getTimer() {
        return zTimer;
    }

    // Passwort
    private static String zPasswort = "";
    public static void setPasswort(String pPasswort) {
        zPasswort = pPasswort;
    }
    public static String getPasswort() {
        return zPasswort;
    }
}

