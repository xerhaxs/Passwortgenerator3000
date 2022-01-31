import sum.kern.Bildschirm;
import sum.kern.Stift;

public class passwortmain {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Bildschirm Bildschirm1;
        Bildschirm1 = new Bildschirm();
        Stift Stift1;
        Stift1 = new Stift();
        Stift1.bewegeBis(100, 100);
        Stift1.schreibeText("Hallo Welt");
    }
}