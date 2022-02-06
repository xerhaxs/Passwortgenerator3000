package classes;

import java.util.Random;

public class generator{
    // Grossbuchstaben Wert
    private boolean zGrossbuchstaben;
    public void setzGrossbuchstaben(boolean pGrossbuchstaben) {
        this.zGrossbuchstaben = pGrossbuchstaben;
    }
    public boolean getzGrossbuchstaben() {
        return zGrossbuchstaben;
    }

    // Kleinbuchstaben Wert
    private boolean zKleinbuchstaben;
    public void setKleinbuchstaben(boolean pKleinbuchstaben) {
        this.zKleinbuchstaben = pKleinbuchstaben;
    }
    public boolean getzKleinbuchstaben() {
        return zKleinbuchstaben;
    }

    // Ziffern Wert
    private boolean zZiffern;
    public void setZiffern(boolean pZiffern) {
        this.zZiffern = pZiffern;
    }
    public boolean getzZiffern() {
        return zZiffern;
    }

    // Sonderzeichen Wert
    private boolean zSonderzeichen;
    public void setSonderzeichen(boolean pSonderzeichen) {
        this.zSonderzeichen = pSonderzeichen;
    }
    public boolean getzSonderzeichen() {
        return zSonderzeichen;
    }

    // Passwortlaenge Wert
    private int zPasswortlaenge;
    public void setPasswortlaenge(int pPasswortlaenge) {
        this.zPasswortlaenge = pPasswortlaenge;
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