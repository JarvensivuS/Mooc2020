
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int maara = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = lukija.nextInt();
            
            if (luku == 0) {
                break;
            } else {
                summa +=luku;
                maara++;
            }
            
            
        }
        
        System.out.println("Lukujen keskiarvo " + (double) summa / maara);
        
    }
}
