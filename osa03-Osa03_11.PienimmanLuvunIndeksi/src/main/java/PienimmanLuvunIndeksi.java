
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        while (true) {
            int luku = lukija.nextInt();
            
            if (luku == 9999) {
                break;
            } else {
                lista.add(luku);
            }
        }
        
        int i = 0;
        int pienin = lista.get(0);
        
        while (i < lista.size()) {
            
            if (lista.get(i) < pienin) {
                pienin = lista.get(i);
            }
                
            i++;
        }
        System.out.println("Pienin luku on " + pienin);
        int a = 0;
        
        while (a < lista.size()) {
            if (lista.get(a)==pienin) {
                
                System.out.println("Luku " + pienin + " on indeksissä " + a);
                
            }
            a++;
        }
            
        
        
    }
}
