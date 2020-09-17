
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
public class Lyhenteet {
    private HashMap<String,String> lista;
    
    public Lyhenteet() {
        lista = new HashMap<>();
    }
    
    public void lisaaLyhenne(String lyhenne, String selite) {
        lista.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        if (lista.containsKey(lyhenne)) {
            return true;
        }
        return false;
    }
    
    public String haeLyhenne(String lyhenne) {
        
        if (!lista.containsKey(lyhenne)) {
            return null;
        }
        
        return lista.get(lyhenne);
    }
    
}
