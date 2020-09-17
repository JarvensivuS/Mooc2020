
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        
        System.out.println("Syötä ensimmäinen luku!");
        int eka = lukija.nextInt();
        System.out.println("Syötä toinen luku!");
        int toka = lukija.nextInt();
        System.out.println("Syötä kolmas luku!");
        int kolmas = lukija.nextInt();
        
        System.out.println("Syötettyjen lukujen keskiarvo on " + (double)(eka + toka + kolmas) / 3);
    }
}
