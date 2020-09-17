
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = lukija.nextInt();
        int index = 100;
        
        while (luku <= index) {
            System.out.println(luku);
            luku++;
        }
        

    }
}
