import java.util.Random;
import sum.kern.*;
public class Generator1alle {
    Random Generator1zahlen;
    Stift Stift1schreiben;
    int zZahl = 0;
    int int_random = 0;
    String str1 = "";
    boolean istKleinbuchstabe = false;
    boolean istGroßbuchstabe = false;
    boolean istZiffer = false;
    boolean istSonderzeichen = false;

    public Generator1alle() {
        Generator1zahlen = new Random();
        Stift1schreiben = new Stift();
    }

    public void Passwortlänge(int pZahl){
        zZahl = pZahl;
    }

    public void GeneriereAlle () {
        int upperbound = 93;
        do {
            int_random = Generator1zahlen.nextInt(upperbound) + 33;
            if (istKleinbuchstabe == false && int_random >= 97 && int_random <= 122) {
                int_random = 0;
                zZahl = zZahl +1;
            }
            if (istGroßbuchstabe == false && int_random >= 65 && int_random <= 90) {
                int_random = 0;
                zZahl = zZahl +1;
            }
            if (istZiffer == false && int_random >= 48 && int_random <= 57) {
                int_random = 0;
                zZahl = zZahl +1;
            }
            if (istSonderzeichen == false && ((int_random >= 33 && int_random <= 47) || (int_random >= 58 && int_random <= 64) || (int_random >= 91 && int_random <= 96) || (int_random >= 123 && int_random <= 126))) {
                int_random = 0;
                zZahl = zZahl +1;
            }
            if (int_random != 0) {
                char value_char = (char) int_random;
                str1 = String.valueOf(value_char) + str1;
                System.out.println(str1);
            }
            zZahl = zZahl - 1;
        } while (zZahl >= 1);
    }
}
