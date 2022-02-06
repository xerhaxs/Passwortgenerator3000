package classes;

import java.util.Random;

public class generator{
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


    public static String generierePasswort(int length) {
        String Grossbuchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Kleinbuchstaben = "abcdefghijklmnopqrstuvwxyz";
        String Sonderzeichen = "!@#$";
        String Ziffern = "1234567890";
        String Kombiniert = Grossbuchstaben + Kleinbuchstaben + Sonderzeichen + Ziffern;
        Random random = new Random();
        char[] passwort = new char[length];

        passwort[0] = Kleinbuchstaben.charAt(random.nextInt(Kleinbuchstaben.length()));
        passwort[1] = Grossbuchstaben.charAt(random.nextInt(Grossbuchstaben.length()));
        passwort[2] = Sonderzeichen.charAt(random.nextInt(Sonderzeichen.length()));
        passwort[3] = Ziffern.charAt(random.nextInt(Ziffern.length()));

        for(int i = 4; i< length ; i++) {
            passwort[i] = Kombiniert.charAt(random.nextInt(Kombiniert.length()));
        }
        return String.valueOf(passwort);
    }
}