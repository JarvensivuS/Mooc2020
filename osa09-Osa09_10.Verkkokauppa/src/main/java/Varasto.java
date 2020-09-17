import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Varasto {
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;
    
    public Varasto() {
        hinnat = new HashMap<>();
        saldot = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnat.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
        
    }
    
    public int hinta (String tuote) {
        
        if (hinnat.containsKey(tuote)) {
            return hinnat.get(tuote);
        }
        
        return -99;
    }
    
    public int saldo (String tuote) {
        
        if (saldot.containsKey(tuote)) {
            return saldot.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote) {
        
        if (this.saldot.keySet().contains(tuote) && this.saldo(tuote) > 0) {
            this.saldot.put(tuote, this.saldo(tuote) -1);
            return true;
        }
        
        return false;
        
    }
    
    public Set<String> tuotteet() {
        Set<String> tuotteet = new HashSet();
        
        for (String nimet : saldot.keySet()) {
            tuotteet.add(nimet);
        }
        return tuotteet;
    }
    
}

