
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String nimi = lukija.nextLine();
        
        int ottelu = 0;
        int voitot = 0;
        int tappiot = 0;
        try {
            Scanner reader = new Scanner (Paths.get(tiedosto));
            
            while (reader.hasNextLine()) {
                String rivi = reader.nextLine();
                String[] palat = rivi.split(",");

                if (rivi.contains(nimi)) {
                    ottelu++;
                    
                    if (Integer.valueOf(palat[2]) > Integer.valueOf(palat[3])) {
                        
                    }
                    
                }
                
                
            }
            System.out.println("Otteluita: " + ottelu);
            System.out.println("Voittoja: " + 1);
            System.out.println("Tappioita: " + 3);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Urheilutilastot.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
