
import java.util.ArrayList;
import java.util.Random;



public class Vitsipankki {
    private  ArrayList<String> lista;
            
    public Vitsipankki() {
        lista = new ArrayList<>();
    }
    
    public void lisaaVitsi(String vitsi) {
        lista.add(vitsi);
    }
    
    public String arvoVitsi() {
        Random r = new Random();
        
       
        if (lista.isEmpty()) {
            
            return "Vitsit vähissä.";
        }

        String luku = lista.get(r.nextInt(lista.size())); 
        return luku;
    }
    
    public void tulostaVitsit() {
        
        if (!lista.isEmpty()) {
            for (String vitsit : lista) {
            System.out.println(vitsit);
            }
        }
        
        
    }
}
