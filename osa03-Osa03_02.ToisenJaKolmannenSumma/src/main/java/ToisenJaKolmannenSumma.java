
import java.util.ArrayList;
import java.util.Scanner;

public class ToisenJaKolmannenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            
            luvut.add(luku);
        }
        int summa = luvut.get(1);
        int summa2 = luvut.get(2);
        int summat = summa + summa2;
        System.out.println(summat);
        
    }
}
