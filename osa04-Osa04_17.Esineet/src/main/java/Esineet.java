
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            if (nimi.equals("")) {
                break;
            }
            
            Esine uusiEsine = new Esine(nimi);
            esineet.add(uusiEsine);
        }
        System.out.println("");
        
        
        System.out.println(esineet.toString());
        
        
          

    }
}
