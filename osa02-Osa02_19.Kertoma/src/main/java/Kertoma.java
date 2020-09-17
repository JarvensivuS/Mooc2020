
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku:");
        int luku = lukija.nextInt();
        
        int index = 1;
        int summa = 1;
       
        
        while (index <= luku) {
            summa *= index;
            index++;
            
            
        }
        
        System.out.println(summa);

    }
}
