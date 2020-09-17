
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        
        System.out.println("Anna salasana: ");
        String salasana = lukija.nextLine();
        int ok = 0;
        if (tunnus.equals("aleksi")) {
            if (salasana.equals("tappara")) {
                System.out.println("Olet kirjautunut järjestelmään");
                ok = 1;
            }     
        }
        
        if (tunnus.equals("elina")) {
                if (salasana.equals("kissa")) {
                    System.out.println("Olet kirjautunut järjestelmään");
                    ok = 1;
                }
                
            } if (ok == 0) {
            System.out.println("Virheellinen tunnus tai salasana!");
        }

    }
}
