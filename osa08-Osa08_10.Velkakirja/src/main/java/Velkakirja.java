
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
public class Velkakirja {
   private HashMap<String,Double> velkakirja;
    
    public Velkakirja() {
        velkakirja = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        velkakirja.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        
        if (velkakirja.containsKey(kuka)) {
            return velkakirja.get(kuka);
        }
        
        return 0;
    }
}
