
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String syote = lukija.nextLine();
            
            String[] palat = syote.split(" ");
            
            
            int i = 0;
            
            while (i < palat.length) {
                
                if (palat[i].contains("av")) {
                    System.out.println(palat[i]);
                }
                i++;
            }
            
            if (syote.equals("")) {
                break;
            }
        }
        

    }
}
