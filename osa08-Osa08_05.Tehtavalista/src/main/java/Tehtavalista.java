import java.util.ArrayList;

public class Tehtavalista {
    private ArrayList<String> lista;
    
    public Tehtavalista() {
        lista = new ArrayList();
    }
    
    public void lisaa(String tehtava) {
        lista.add(tehtava);
    }
    
    public void tulosta() {
        
        int indeksi = 1;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(indeksi + ": " + lista.get(i));
            indeksi++;
        }
        
    }
    
    public void poista(int numero) {
        if (numero == 1) {
            lista.remove(0);
        } else if (numero > 1){
            lista.remove(numero - 1);
        }
    }
}
