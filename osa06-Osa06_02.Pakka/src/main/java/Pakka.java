
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class Pakka {
    private ArrayList<String> pakka;

    public Pakka() {
        this.pakka = new ArrayList<>();
    }
    
    public boolean onTyhja() {
        
        if (pakka.isEmpty()) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public void lisaa(String arvo) {
        pakka.add(arvo);
    }
    
    public ArrayList<String> arvot() {
        
        return pakka;
    }
    
    public String ota() {
        
        
        int vikanmr = pakka.size() - 1;
        String vika = pakka.get(vikanmr);
        pakka.remove(vika);
        return vika;
    }
}
