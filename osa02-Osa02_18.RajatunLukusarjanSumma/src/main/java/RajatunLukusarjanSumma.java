
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen:");
        int luku = lukija.nextInt();
        System.out.println("Viimeinen:");
        int luku2 = lukija.nextInt();
        
        int index = 0;
        int summa = 0;
        int alku = 1;
        
        while (luku <= luku2) {
            summa += luku;
            luku++;
        }
        System.out.println("Summa on " + summa);

    }
}
