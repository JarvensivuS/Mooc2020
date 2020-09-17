
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        // toteuta tänne toiminnallisuus luvun etsimiseen
        
        System.out.println("Mitä etsitään?");
        int lukua = lukija.nextInt();
        
        int i = 0;
        
        while (i < lista.size()) {
            if (lista.get(i)==lukua) {
                System.out.println("Luku " + lukua + " on indeksissä " + i);
                
            }
            i++;
        }
        
    }
}
