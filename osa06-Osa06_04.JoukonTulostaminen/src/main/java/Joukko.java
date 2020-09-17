
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    public String toString() {
        
        String tulostus_nolla = "Joukko " + nimi + " on tyhjä.";
        String tulostus_yksi = "Joukossa " + nimi + " on " + alkiot.size() + " alkio:\n"  ;
        String tulostus_monta = "Joukossa " + nimi + " on " + alkiot.size() + " alkiota:\n" ;
        
        String tallenna = "";
        for (String alkiossa : alkiot) {
            tallenna = tallenna + alkiossa + "\n";
        }
        
        String tallenne = "";
        for (String nimet : alkiot) {
            tallenne = tallenne + nimet;
        }
        
        if (alkiot.isEmpty()) {
            return tulostus_nolla;
        } else if (alkiot.size() == 1) {
            return tulostus_yksi + tallenne;
        } else {
            return tulostus_monta + tallenna;
        }
        
      
    }
    
}
