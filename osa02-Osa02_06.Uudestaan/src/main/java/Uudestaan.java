
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä luku");
        int luku = lukija.nextInt();
        
        while (luku != 4) {
            System.out.println("Syötä luku");
            luku = lukija.nextInt();
            
        }

    }
}
