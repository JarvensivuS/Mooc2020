
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class Huone {
    private ArrayList<Henkilo> huone;
    
    public Huone() {
        huone = new ArrayList<>();
        
    }
    
    public void lisaa(Henkilo henkilo) {
        huone.add(henkilo);
    }
    
    public boolean onTyhja() {
        
        if (huone.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Henkilo> getHenkilot() {
        return huone;
    }
    
    public Henkilo lyhin() {
        if (huone.isEmpty()) {
            return null;
        }
        
        Henkilo lyhyin = huone.get(0);
        
        for (Henkilo lyhin : huone) {
            
            if (lyhin.getPituus() < lyhyin.getPituus()) {
                lyhyin = lyhin;
            }
        }
        return lyhyin;
        
    }
    
    public Henkilo ota() {
        
        if (huone.isEmpty()) {
            return null;
        }
        
        Henkilo lyhyin = huone.get(0);
        Henkilo tallenne = lyhyin;
        
        for (Henkilo h : huone) {
            
            if (h.getPituus() < lyhyin.getPituus()) {
                lyhyin = h;
                tallenne = lyhyin;
                
                
            }
        }
        huone.remove(lyhyin);
        return tallenne;
        
//        int i = 0;
//        int koko = huone.size();
//        Henkilo lyhyin = huone.get(0);
//        
//        while (i < koko) {
//            
//            if (huone.get(i).getPituus() < lyhyin.getPituus()) {
//                lyhyin = huone.get(i);
//                huone.remove(i);
//            }
//            i++;
//        }
//        
//        return lyhyin;
        
    }
}
