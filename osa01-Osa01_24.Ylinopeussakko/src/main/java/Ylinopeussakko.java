
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

         System.out.println("Kerro nopeus: ");
         int luku = lukija.nextInt();
         
         if (luku > 120) {
             System.out.println("Ylinopeussakko!");
         }
    }
}
