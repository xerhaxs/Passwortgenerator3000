import sum.kern.Bildschirm;
import sum.kern.Stift;

public class passwortmain {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Bildschirm Bildschirm1;
        Bildschirm1 = new Bildschirm();
        Stift stift1schreiben;
        stift1schreiben = new Stift();
        stift1schreiben.bewegeBis(500, 500);
        stift1schreiben.schreibeText("Hallo Welt");
    }
}