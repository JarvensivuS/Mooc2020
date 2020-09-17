import java.util.ArrayList;


public class Laatikko implements Talletettava{
    private ArrayList<Talletettava> laatikko;
    private double maxPaino;
    
    public Laatikko(double maxPaino) {
        this.maxPaino = maxPaino;
        laatikko = new ArrayList<>();
    }
    
    
    @Override
    public double paino() {
        double paino = 0.0;
        
        for (Talletettava tavara : laatikko) {
            paino += tavara.paino();
        }
        
        return paino;
    }
    
    public void lisaa(Talletettava tavara) {
        if ( !(this.paino() + tavara.paino() > this.maxPaino)) {
            laatikko.add(tavara);
        }
        
        
    }
    
    public String toString() {
        return  "Laatikko: " + laatikko.size() + " esinettä, paino yhteensä " +
                paino() + " kiloa";
                
    }
    
}
