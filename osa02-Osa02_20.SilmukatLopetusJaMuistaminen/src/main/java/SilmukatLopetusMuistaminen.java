
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int lukuja = 0;
        int parittomat = 0;
        int parilliset = 0;
        System.out.println("Syötä luvut:");
        
        while (true) {
            int luku = lukija.nextInt();
            
            if (luku == -1) {
                System.out.println("Kiitos ja näkemiin!"); 
                System.out.println("Summa: " + summa);
                System.out.println("Lukuja: " + lukuja);
                System.out.println("Keskiarvo: " + (double) summa / lukuja);
                System.out.println("Parillisia: " + parilliset);
                System.out.println("Parittomia: " + parittomat);
                break;
                
            } else if (luku > 0) {
                summa += luku;
                lukuja++;
                
                if (luku % 2 == 0) {
                    parilliset++;
                } else {
                    parittomat++;
                }
            }
        }

    }
}
