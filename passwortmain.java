import sum.kern.*;

public class passwortmain {

    public static void main(String[] args) {
        Generator1alle generator1generieren;

        generator1generieren = new Generator1alle();

        generator1generieren.Passwortlänge(80);
        generator1generieren.GeneriereAlle();
    }
}