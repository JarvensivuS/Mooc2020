
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = lukija.nextInt();
            
            if (luku == 0) {
                break;
            } else {
                lukuja++;
            }
        }
        
        System.out.println("Lukuja yhteensä " + lukuja);

    }
}
