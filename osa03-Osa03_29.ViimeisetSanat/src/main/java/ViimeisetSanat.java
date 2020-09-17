
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        while (true) {
            String syote = lukija.nextLine();
            
            String palat[] = syote.split(" ");
            
            int vika = palat.length - 1;
            System.out.println(palat[vika]);
            
            
            if (syote.equals("")) {
                break;
            
            }
        
        }

    }
}
