
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        while (true) {
            String syote = lukija.nextLine();
            String[] palat = syote.split(" ");
            
            
            int index = 0;
            
            while (index < palat.length) {
               System.out.println(palat[index]); 
               index++;
            }
            
            if (syote.equals("")) {
                break;
            }
            
        }

    }
}
