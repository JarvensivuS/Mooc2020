import java.util.ArrayList;

public class Muutoshistoria {
    private ArrayList<Double> muutoshistoria;
    
    public Muutoshistoria() {
        muutoshistoria = new ArrayList<>();
    }
    
    public void lisaa (double tilanne) {
        muutoshistoria.add(tilanne);
                    
    }
    
    public void nollaa() {
        muutoshistoria.clear();;
    }
    
    public String toString() {    
        return muutoshistoria.toString();    
    }
    
    public double maxArvo() {
        if (muutoshistoria.isEmpty()) {
            return 0.0;
        }
        
        double suurin = this.muutoshistoria.get(0);
        for (int i = 0; i < muutoshistoria.size(); i++) {
            if (muutoshistoria.get(i) > suurin) {
                suurin = muutoshistoria.get(i);
            }
        }
        return suurin;
    }
    
    public double minArvo() {
        if (muutoshistoria.isEmpty()) {
            return 0.0;
        }
        
        double pienin = this.maxArvo();
        for (int i = 0; i < muutoshistoria.size(); i++) {
            if (muutoshistoria.get(i) < pienin) {
                pienin = muutoshistoria.get(i);
            }
        }
        return pienin;
    }
    
    public double keskiarvo() {
        if (muutoshistoria.isEmpty()) {
            return 0.0;
        }
        
        double summa = 0;
        double lukuja = 0;
        
        for (int i = 0; i < muutoshistoria.size(); i++) {
            summa += muutoshistoria.get(i);
            lukuja++;
        }
        
        return summa / lukuja;
    }
}
