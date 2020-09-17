
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = lukija.nextInt();
        int index = 0;
        while (index <= luku) {
            System.out.println(index);
            index++;
        }
        
    }
}
