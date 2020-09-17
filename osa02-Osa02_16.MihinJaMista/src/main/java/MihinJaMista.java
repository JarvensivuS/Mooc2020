
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        System.out.println("Mihin asti?");
        int asti = lukija.nextInt();
        System.out.println("Mistä lähtien?");
        int mista = lukija.nextInt();
        
        
        
        
        while (mista <= asti) {
            System.out.println(mista);
            mista++;
        }
        
        
        
    }
}
