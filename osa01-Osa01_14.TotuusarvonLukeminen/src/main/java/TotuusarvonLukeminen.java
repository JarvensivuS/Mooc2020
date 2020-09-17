
import java.util.Scanner;

public class TotuusarvonLukeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä jotain!");
        String syote = lukija.nextLine();
        
        boolean arvo = Boolean.valueOf(syote);
        System.out.println("Totta vaiko ei? " + arvo);

    }
}
