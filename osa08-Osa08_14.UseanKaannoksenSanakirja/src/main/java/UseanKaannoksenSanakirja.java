import java.util.HashMap;
import java.util.ArrayList;


public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> sanakirja;
    
    public UseanKaannoksenSanakirja() {
        this.sanakirja = new HashMap<>();

    }
    
    public void lisaa(String sana, String kaannos) {
        
        this.sanakirja.putIfAbsent(sana, new ArrayList<>());
        ArrayList<String> kaannokset = this.sanakirja.get(sana);
        kaannokset.add(kaannos);
    }
    
    public ArrayList<String> kaanna(String sana) {
        
        if ((!sanakirja.containsKey(sana))) {
            return new ArrayList<>();
        }
        
        return sanakirja.get(sana);
        
    }
    
    public void poista(String sana) {
        sanakirja.remove(sana);
    }
    
}
