import java.util.HashMap;
import java.util.ArrayList;

public class Kellari {
    private HashMap<String, ArrayList<String>> komerot;
    
    public Kellari() {
        this.komerot = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara) {
        
        this.komerot.putIfAbsent(komero, new ArrayList<>());
        ArrayList<String> tavarat = this.komerot.get(komero);
        tavarat.add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero) {
        
        if (!(komerot.containsKey(komero)) || komerot.equals(null)) {
            return new ArrayList<>();
        }
        
        return komerot.get(komero);
        
    }
    
    public void poista(String komero, String tavara) {
        
        if (this.komerot.get(komero).contains(tavara)) {
            this.komerot.get(komero).remove(tavara);
        }
        
        if (this.komerot.get(komero).isEmpty()) {
            this.komerot.remove(komero);
        }
    }
    
    public ArrayList<String> komerot() {
        
        ArrayList<String> palauta = new ArrayList<>();
        
        for (String lisaa : this.komerot.keySet()) {
            palauta.add(lisaa);
        }
        return palauta;
    }
            
}
