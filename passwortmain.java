import sum.kern.*;

public class passwortmain {

    public static void main(String[] args) {
        Bildschirm Bildschirm1anzeige;
        Stift stift1schreiben;
        Generator1alle generator1generieren;

        Bildschirm1anzeige = new Bildschirm();
        stift1schreiben = new Stift();
        generator1generieren = new Generator1alle();

        generator1generieren.Generiere();
        stift1schreiben.bewegeBis(500, 500);
        stift1schreiben.schreibeText("Hallo Welt");

    }
}