
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti?");
        
        int luku = lukija.nextInt();
        int index = 0;
        int summa = 0;
        int plussa = 1;
        while (index <= luku) {
            summa += index;
            index++;
        }
        System.out.println("Summa on " + summa);
        

    }
}
