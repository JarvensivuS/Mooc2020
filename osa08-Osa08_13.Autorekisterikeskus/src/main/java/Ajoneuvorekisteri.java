import java.util.HashMap;
import java.util.ArrayList;

public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        
        if (!(this.omistajat.get(rekkari) == null)) {
            return false;
        }
        
        omistajat.put(rekkari, omistaja);
        return true;
    }
    
    public String hae(Rekisterinumero rekkari) {
        
        if (this.omistajat.get(rekkari) == null) {
            return null;
        }
        
        return this.omistajat.get(rekkari);
        
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (this.omistajat.get(rekkari) == null) {
            return false;
        }
        
        this.omistajat.remove(rekkari);
        return true;
    }
    
    public void tulostaRekisterinumerot() {
        ArrayList<Rekisterinumero> lista = new ArrayList<>();
        
        for (Rekisterinumero rekkari : this.omistajat.keySet()) {
            if (!(lista.contains(this.omistajat.get(rekkari)))) {
                lista.add(rekkari);
            }
        }
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
            
    }
    
    public void tulostaOmistajat() {
        ArrayList<String> lista = new ArrayList<>();
        
        for (Rekisterinumero rekkari : this.omistajat.keySet()) {
            if (!(lista.contains(this.omistajat.get(rekkari)))) {
                lista.add(this.omistajat.get(rekkari));
            }
        }
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
        
        
    }
    
}
