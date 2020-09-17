
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku1 = lukija.nextInt();
        
        int luku2 = lukija.nextInt();
        
        int summa = luku1 + luku2;
        
        double tulos = Math.sqrt(summa);
        
        System.out.println(tulos);

    }
}
