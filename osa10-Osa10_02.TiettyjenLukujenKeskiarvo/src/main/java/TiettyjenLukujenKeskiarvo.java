
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        
        while (true) {
            String rivi = lukija.nextLine();
            
            if (rivi.equalsIgnoreCase("Loppu")) {
                break;
            }
            lista.add(rivi);
            
        }
        
        
        
        
    }
}
