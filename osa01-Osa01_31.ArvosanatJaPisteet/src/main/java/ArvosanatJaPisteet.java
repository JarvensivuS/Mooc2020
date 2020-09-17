
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100]:");
        int luku = lukija.nextInt();
        
        if (luku < 0) {
            System.out.println("Arvosana: mahdotonta!");
        } else if (luku >= 0 && luku < 50) {
            System.out.println("Arvosana: hylätty");
        } else if (luku > 49 && luku < 60) {
            System.out.println("Arvosana: 1");
        } else if (luku > 59 && luku < 70) {
            System.out.println("Arvosana: 2");
        } else if (luku > 69 && luku < 80) {
            System.out.println("Arvosana: 3");
        } else if (luku > 79 && luku < 90) {
            System.out.println("Arvosana: 4");
        } else if (luku > 89 && luku < 101) {
            System.out.println("Arvosana: 5");
        } else if (luku > 100) {
            System.out.println("Arvosana: uskomatonta!");
        }
    }
}
