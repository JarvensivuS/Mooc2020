
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int eka = lukija.nextInt();
       
        System.out.println("Syötä toinen luku!");
        int toka = lukija.nextInt();
        
        System.out.println(eka + " + " + toka + " = " + (eka + toka));
        System.out.println(eka + " - " + toka + " = " + (eka - toka));
        System.out.println(eka + " * " + toka + " = " + (eka * toka));
        System.out.println(eka + " / " + toka + " = " + ((double) eka / toka));
    }   
}
