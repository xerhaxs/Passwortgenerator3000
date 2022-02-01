import java.util.Random;
import sum.kern.*;
public class Generator1alle {
    Random Generator1zahlen;
    Stift Stift1schreiben;
    int zZahl = 0;

    public Generator1alle() {
        Generator1zahlen = new Random();
        Stift1schreiben = new Stift();
    }



    public void Passwortlänge(int pZahl){
        zZahl = pZahl;
    }

    public void GeneriereAlle () {
        int upperbound = 94;
        Stift1schreiben.bewegeBis(500,600);
        do {
            int int_random = Generator1zahlen.nextInt(upperbound) + 32;
            char value_char = (char) int_random;
            Stift1schreiben.schreibeText(" " + value_char);
            zZahl = zZahl- 1;
        } while (zZahl >= 1);
    }
}
