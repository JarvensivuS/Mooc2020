
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("Etunimi: ");
            String etunimi = lukija.nextLine();
            if (etunimi.equals("")) {
                break;
            }
            System.out.print("Sukunimi: ");
            String sukunimi = lukija.nextLine();
            System.out.print("Henkilötunnus: ");
            String htunnus = lukija.nextLine();
            
            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, htunnus));
            
            
        }
        
        for (Henkilotieto h : henkilotiedot) {
            System.out.println("");
            System.out.println(h.getEtunimi() + " " + h.getSukunimi());
        }
        
        
        

    }
}
