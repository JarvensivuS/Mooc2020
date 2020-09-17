
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        
        try {
            Scanner lue = new Scanner(new File(tiedosto));
            while (lue.hasNextLine()) {
                String data = lue.nextLine();
                
                String palat[] = data.split(",");
                if (Integer.valueOf(palat[1]) == 1) {
                    System.out.println(palat[0] + " ikä: " + palat[1]+ " vuosi");
                } else {
                    System.out.println(palat[0] + " ikä: "+ palat[1] +" vuotta");
                }
            }
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
            
        

    }
}
