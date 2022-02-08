package classes;

import java.util.Random;

public class generator{
    public static String generierePasswort(int length) {
        String Grossbuchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Kleinbuchstaben = "abcdefghijklmnopqrstuvwxyz";
        String Sonderzeichen = "!@#$?,;.:";
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