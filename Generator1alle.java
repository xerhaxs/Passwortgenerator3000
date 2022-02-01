import java.util.Random;
import sum.kern.*;
public class Generator1alle {
    Random Generator1zahlen;
    Stift Stift1schreiben;
    public Generator1alle() {
        Generator1zahlen = new Random();
        Stift1schreiben = new Stift();
    }

    public void GeneriereAlle () {
        int upperbound = 94;
        int int_random = Generator1zahlen.nextInt(upperbound)+32;
        Stift1schreiben.bewegeBis(500,600);
        char value_char = (char) int_random;
        Stift1schreiben.schreibeText(" "+value_char);
    }
}
