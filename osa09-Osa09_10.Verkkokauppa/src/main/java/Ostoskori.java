
import java.util.HashMap;
import java.util.Map;


public class Ostoskori {
    private Map<String,Ostos> ostoskori;
    
    public Ostoskori() {
        this.ostoskori = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        
        if (!(this.ostoskori.containsKey(tuote))) {
            this.ostoskori.put(tuote, new Ostos(tuote, 1, hinta));
        } else {
            this.ostoskori.get(tuote).kasvataMaaraa();
        }
        
        
        
    }
    
    public int hinta() {
        
        int kokonaishinta = 0;
        
        for (Ostos ostos : ostoskori.values()) {
            kokonaishinta += ostos.hinta();
        }
        
        return kokonaishinta;
    }
    
    public void tulosta() {
        
        for (Ostos ostokset : ostoskori.values()) {
            System.out.println(ostokset);
        }
    }
}
