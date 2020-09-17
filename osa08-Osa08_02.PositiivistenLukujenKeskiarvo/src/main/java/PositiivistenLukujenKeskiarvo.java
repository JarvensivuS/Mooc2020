
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int maara = 0;
        int summa = 0;
        while (true) {
            int luku = lukija.nextInt();
            
            if (luku == 0) {
                break;
            }
            
            if (luku > 0) {
                maara++;
                summa += luku;
            }
            
        }
        if (maara == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista.");
        } else {
            System.out.println((double) summa / maara);
        }
        
        

    }
}
