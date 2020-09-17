
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String input = lukija.nextLine();
            if (input.equals("loppu")) {
                break;
            }
            int luku = Integer.valueOf(input);
            int kuutio = luku * luku * luku;
            System.out.println(kuutio);
            
        }
        
        
    }
}
