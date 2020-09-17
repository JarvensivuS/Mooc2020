
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kokeile sovelluksen osien yhteistoimintaa täällä
        Scanner lukija = new Scanner(System.in);
        Sanakirja sanakirja = new Sanakirja();
        
        Tekstikayttoliittyma tekstikayttoliittyma = new Tekstikayttoliittyma(lukija, sanakirja);
        tekstikayttoliittyma.kaynnista();
        
    }  
}
    

