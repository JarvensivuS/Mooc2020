
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku1 = lukija.nextInt();
        int luku2 = lukija.nextInt();
        
        if (luku1 > luku2) {
            System.out.println("Luku " + luku1 + " on suurempi kuin " + luku2 + ".");
        } else if (luku1 < luku2) {
            System.out.println("Luku " + luku1 + " on pienempi kuin " + luku2 + ".");
        } else {
            System.out.println("Luku " + luku1 + " on yhtä suuri kuin luku " + luku2 + ".");
        }

    }
}
