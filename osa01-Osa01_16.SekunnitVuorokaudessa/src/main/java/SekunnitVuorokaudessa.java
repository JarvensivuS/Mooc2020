
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vuorokausiSekuntteina = 86400;
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int vuorokausi = Integer.valueOf(lukija.nextLine());
        
        System.out.println(vuorokausiSekuntteina * vuorokausi);
    }
}
