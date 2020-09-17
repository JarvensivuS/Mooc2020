
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Esine> esine = new ArrayList<>();
        Esine uusi = new Esine("", "");
        ArrayList<Object> tunnukset = new ArrayList<>();
        
        while (true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = lukija.nextLine();
            if (tunnus.equals("")) {
                break;
            }
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            if (tunnukset.contains(tunnus)) {
                System.out.println("on jo");
            } else {
                uusi = new Esine(tunnus, nimi);
                esine.add(uusi);
            }
            
            tunnukset.add(tunnus);
            
            
            
            
            
            
            
             
            
        }
        
        System.out.println("==Esineet==");
        
        for (Esine lista : esine ) {
            System.out.println(lista.toString());
        }
        
        
        
        
        
        


    }
}
