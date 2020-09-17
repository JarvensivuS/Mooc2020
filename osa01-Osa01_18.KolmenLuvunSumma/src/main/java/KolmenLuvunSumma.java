
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int eka = lukija.nextInt();
        System.out.println("Syötä toinen luku!");
        int toka = lukija.nextInt();
        System.out.println("Syötä kolmas luku!");
        int kolmas = lukija.nextInt();
        System.out.println("Lukujen summa on " + (eka + toka + kolmas));

    }
}
