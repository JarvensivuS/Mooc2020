

import java.util.Scanner;

public class EtsitynAlkionIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[10];
        taulukko[0] = 6;
        taulukko[1] = 2;
        taulukko[2] = 8;
        taulukko[3] = 1;
        taulukko[4] = 3;
        taulukko[5] = 0;
        taulukko[6] = 9;
        taulukko[7] = 7;

        

        // Toteuta etsimistoiminnallisuus tänne
        
        System.out.println("Mitä etsitään?");
        int etsi = lukija.nextInt();
        
        int index = 0;
        
        int laskin = 0;
        while (index < taulukko.length) {
            
            if (taulukko[index] == etsi) {
                System.out.println("Luku " + etsi + " löytyy indeksistä " + index + ".");
                laskin = 1;
            }
            index++;
        }
        
        if (laskin == 0) {
            System.out.println("Lukua " + etsi + " ei löydy.");
        }
    }

}
