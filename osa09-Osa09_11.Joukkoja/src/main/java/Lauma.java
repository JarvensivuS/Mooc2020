import java.util.ArrayList;

public class Lauma implements Siirrettava{
    private ArrayList<Siirrettava> lista;
    
    public Lauma() {
       lista = new ArrayList<Siirrettava>();
    }
    
    @Override
    public void siirra(int dx, int dy) {
        
        for (Siirrettava elio : lista) {
            elio.siirra(dx, dy);
        }
   
    }
    
    public String toString() {
        String palauta = "";
        
        for (Siirrettava elio : lista) {
            palauta += elio + "\n";
        }
        return palauta;
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        lista.add(siirrettava);
    }
    
}
