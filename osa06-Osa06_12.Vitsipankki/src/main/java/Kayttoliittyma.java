
import java.util.ArrayList;
import java.util.Scanner;


public class Kayttoliittyma {
    private Vitsipankki vitsit;
    private Scanner lukija;
    
    public Kayttoliittyma(Vitsipankki vitsi, Scanner lukija) {
        this.vitsit = vitsi;
        this.lukija = lukija;
       
    }
    
    public void kaynnista() {

        
        while (true) {
            
            System.out.println("Komennot:");
            System.out.println("1 - lisää vitsi");
            System.out.println("2 - arvo vitsi");
            System.out.println("3 - listaa vitsit");
            System.out.println("x - lopeta");
            
            String luettu = lukija.nextLine();
            
            if (luettu.equalsIgnoreCase("x")) {
                break;
            } else if (luettu.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String kirjoita = lukija.nextLine();
                vitsit.lisaaVitsi(kirjoita);
            } else if (luettu.equals("2")) {
                System.out.println(vitsit.arvoVitsi());
                
            } else if (luettu.equals("3")) {
                vitsit.tulostaVitsit();
            }
            
            
        }
    }
}
