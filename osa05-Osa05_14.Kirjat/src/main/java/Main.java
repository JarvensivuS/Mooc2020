
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();

        
        while (true) {
            
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa.");
            String nimi = sc.nextLine();
            
            if (nimi.isEmpty()) {
                break;
            }
            
            System.out.println("Syötä kirjan julkaisuvuosi.");
            int vuosi = sc.nextInt();
            
            if (kirjat.contains(nimi)) {
                System.out.println("Kirja on jo listalla. Ei lisätä samaa kirjaa uudestaan.");
            } else {
                kirjat.add(new Kirja(nimi, vuosi));
            }
 
        }
        
        System.out.println("Kiitos! Kirjoja lisätty: " + kirjat.size());
    }
}