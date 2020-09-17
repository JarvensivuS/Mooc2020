/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
import java.util.Scanner;
public class Tekstikayttoliittyma {
    
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        
        
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
                
            } else if (komento.equals("lisaa")) {
                System.out.print("Sana: ");
                String suomex = lukija.nextLine();
                System.out.print("Käännös: ");
                String englannix = lukija.nextLine();
                this.sanakirja.lisaa(suomex, englannix);
                
            } else if (komento.equals("kaanna")) {
                System.out.print("Anna sana: ");
                String kaannettava = lukija.nextLine();
                System.out.println("Käännös: " + sanakirja.kaanna(kaannettava));
                
            } else if (komento.equals("hae")) {
                
                System.out.print("Haettava: ");
                String haettava = lukija.nextLine();
                
                if (!(sanakirja.equals(haettava))) {
                    System.out.println("Sanaa " + haettava + " ei löydy.");
                } else {
                    System.out.println("Käännös: " + sanakirja.kaanna(haettava));
                }
                
            } 

                
            else {
                System.out.println("Tuntematon komento.");
            }
            
            
            
        }
        
    }
    
}